package co.misw4203.grupo7.vinilos.network

import android.content.Context
import android.util.Log
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.VolleyError
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import co.misw4203.grupo7.vinilos.models.Album
import co.misw4203.grupo7.vinilos.models.Band
import co.misw4203.grupo7.vinilos.models.Comment
import co.misw4203.grupo7.vinilos.models.Musician
import co.misw4203.grupo7.vinilos.models.Collector
import com.google.gson.Gson
import org.json.JSONArray
import org.json.JSONObject
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine


class NetworkServiceAdapter constructor(context: Context) {
    companion object {
        const val BASE_URL = "https://misw4203-mobile-vynils.herokuapp.com/"
        var instance: NetworkServiceAdapter? = null
        fun getInstance(context: Context) =
            instance ?: synchronized(this) {
                instance ?: NetworkServiceAdapter(context).also {
                    instance = it
                }
            }
    }

    private val requestQueue: RequestQueue by lazy {
        // applicationContext keeps you from leaking the Activity or BroadcastReceiver if someone passes one in.
        Volley.newRequestQueue(context.applicationContext)
    }

    fun getAlbums(onComplete: (resp: List<Album>) -> Unit, onError: (error: VolleyError) -> Unit) {
        requestQueue.add(
            getRequest("albums",
                { response ->
                    val resp = JSONArray(response)
                    val list = mutableListOf<Album>()
                    for (i in 0 until resp.length()) {
                        val item = resp.getJSONObject(i)
                        list.add(
                            i,
                            Album(
                                albumId = item.getInt("id"),
                                name = item.getString("name"),
                                cover = item.getString("cover"),
                                recordLabel = item.getString("recordLabel"),
                                releaseDate = item.getString("releaseDate"),
                                genre = item.getString("genre"),
                                description = item.getString("description")
                            )
                        )
                    }
                    onComplete(list)
                },
                {
                    onError(it)
                })
        )
    }

    fun getCollectors(
        onComplete: (resp: List<Collector>) -> Unit,
        onError: (error: VolleyError) -> Unit
    ) {
        requestQueue.add(
            getRequest("collectors",
                { response ->
                    Log.d("tagb", response)
                    val resp = JSONArray(response)
                    val list = mutableListOf<Collector>()
                    for (i in 0 until resp.length()) {
                        val item = resp.getJSONObject(i)
                        list.add(
                            i,
                            Collector(
                                collectorId = item.getInt("id"),
                                name = item.getString("name"),
                                telephone = item.getString("telephone"),
                                email = item.getString("email")
                            )
                        )
                    }
                    onComplete(list)
                },
                {
                    onError(it)
                    Log.d("", it.message.toString())
                })
        )
    }

    fun getComments(
        albumId: Int,
        onComplete: (resp: List<Comment>) -> Unit,
        onError: (error: VolleyError) -> Unit
    ) {
        requestQueue.add(
            getRequest("albums/$albumId/comments",
                { response ->
                    val resp = JSONArray(response)
                    val list = mutableListOf<Comment>()
                    var item: JSONObject?
                    for (i in 0 until resp.length()) {
                        item = resp.getJSONObject(i)
                        Log.d("Response", item.toString())
                        list.add(
                            i,
                            Comment(
                                albumId = albumId,
                                rating = item.getInt("rating").toString(),
                                description = item.getString("description")
                            )
                        )
                    }
                    onComplete(list)
                },
                {
                    onError(it)
                })
        )
    }
    fun postComment(
        body: JSONObject,
        albumId: Int,
        onComplete: (resp: JSONObject) -> Unit,
        onError: (error: VolleyError) -> Unit
    ) {
        requestQueue.add(
            postRequest("albums/$albumId/comments",
                body,
                { response ->
                    onComplete(response)
                },
                {
                    onError(it)
                })
        )
    }

    suspend fun getBands() = suspendCoroutine<List<Band>> { cont ->
        requestQueue.add(
            getRequest("bands",
                { response ->
                    val resp = JSONArray(response)
                    val list = mutableListOf<Band>()
                    for (i in 0 until resp.length()) {
                        val item = resp.getJSONObject(i)
                        val gson = Gson()
                        list.add(
                            i,
                            Band(
                                id = item.getInt("id"),
                                name = item.getString("name"),
                                image = item.getString("image"),
                                description = item.getString("description"),
                                creationDate = item.getString("creationDate"),
                                albums = getAlbumsOfPerformers(item.getString("albums"))
                            )
                        )
                    }
                    cont.resume(list)
                },
                {
                    cont.resumeWithException(it)
                })
        )
    }

    suspend fun getBandById(id: Int) = suspendCoroutine<Band> { cont ->
        requestQueue.add(
            getRequest("bands/$id",
                { response ->
                    val item = JSONObject(response)
                    var band = Band(
                        id = item.getInt("id"),
                        name = item.getString("name"),
                        image = item.getString("image"),
                        description = item.getString("description"),
                        creationDate = item.getString("creationDate"),
                        albums = getAlbumsOfPerformers(item.getString("albums"))
                    )
                    cont.resume(band)
                },
                {
                    cont.resumeWithException(it)
                })
        )
    }
    suspend fun getMusicians() = suspendCoroutine<List<Musician>> { cont ->
        requestQueue.add(
            getRequest("musicians",
                { response ->
                    val resp = JSONArray(response)
                    val list = mutableListOf<Musician>()

                    for (i in 0 until resp.length()) {
                        val item = resp.getJSONObject(i)
                        list.add(
                            i,
                            Musician(
                                id = item.getInt("id"),
                                name = item.getString("name"),
                                image = item.getString("image"),
                                description = item.getString("description"),
                                birthDate = item.getString("birthDate"),
                                albums = getAlbumsOfPerformers(item.getString("albums"))
                            )
                        )
                    }
                    cont.resume(list)
                },
                {
                    cont.resumeWithException(it)
                })
        )
    }

    suspend fun getMusicianById(id: Int) = suspendCoroutine<Musician> { cont ->
        requestQueue.add(
            getRequest("musicians/$id",
                { response ->
                    val item = JSONObject(response)
                    var musician = Musician(
                        id = item.getInt("id"),
                        name = item.getString("name"),
                        image = item.getString("image"),
                        description = item.getString("description"),
                        birthDate = item.getString("birthDate"),
                        albums = getAlbumsOfPerformers(item.getString("albums"))
                    )
                    cont.resume(musician)
                },
                {
                    cont.resumeWithException(it)
                })
        )
    }

    private fun getAlbumsOfPerformers(response : String) : List<Album>{
        val resp = JSONArray(response)
        val list = mutableListOf<Album>()

        for (i in 0 until resp.length()) {
            val item = resp.getJSONObject(i)
            list.add(
                i,
                Album(
                    albumId = item.getInt("id"),
                    name = item.getString("name"),
                    cover = item.getString("cover"),
                    description = item.getString("description"),
                    releaseDate = item.getString("releaseDate"),
                    genre = item.getString("genre"),
                    recordLabel = item.getString("recordLabel")
                )
            )
        }

        return list
    }

    private fun getRequest(
        path: String,
        responseListener: Response.Listener<String>,
        errorListener: Response.ErrorListener
    ): StringRequest {
        return StringRequest(Request.Method.GET, BASE_URL + path, responseListener, errorListener)
    }

    private fun postRequest(
        path: String,
        body: JSONObject,
        responseListener: Response.Listener<JSONObject>,
        errorListener: Response.ErrorListener
    ): JsonObjectRequest {
        return JsonObjectRequest(
            Request.Method.POST,
            BASE_URL + path,
            body,
            responseListener,
            errorListener
        )
    }

    private fun putRequest(
        path: String,
        body: JSONObject,
        responseListener: Response.Listener<JSONObject>,
        errorListener: Response.ErrorListener
    ): JsonObjectRequest {
        return JsonObjectRequest(
            Request.Method.PUT,
            BASE_URL + path,
            body,
            responseListener,
            errorListener
        )
    }
}