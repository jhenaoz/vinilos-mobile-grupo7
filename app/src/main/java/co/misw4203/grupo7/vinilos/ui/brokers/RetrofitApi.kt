package co.misw4203.grupo7.vinilos.ui.brokers

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.*

private const val BASE_URL = "http://vynils-back-heroku.herokuapp.com/"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface RetrofitApiService {
    @GET("collectors")
    fun getProperties():
            Call<String>

    @FormUrlEncoded
    @POST("collectors")
    fun postProperties(@Field("name") name: String,
                       @Field("telephone") telephone: String,
                       @Field("email") email: String):
            Call<String>
}

object RetrofitApi {
    val retrofitService : RetrofitApiService by lazy {
        retrofit.create(RetrofitApiService::class.java) }
}