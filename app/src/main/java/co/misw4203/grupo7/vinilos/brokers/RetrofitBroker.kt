package co.misw4203.grupo7.vinilos.brokers

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class RetrofitBroker {
    companion object{
        fun getRequest(onResponse:(resp:String)->Unit, onFailure:(resp:String)->Unit) {
            val r = RetrofitApi.retrofitService.getProperties()
            r.enqueue(
                object : Callback<String> {
                    override fun onFailure(call: Call<String>, t: Throwable) {
                        onFailure(t.message!!)
                    }

                    override fun onResponse(call: Call<String>, response: Response<String>) {
                        onResponse(response.body()!!)
                    }
                })
        }
        fun postRequest(body: Map<String, String>, onResponse:(resp:String)->Unit, onFailure:(resp:String)->Unit) : String? {
            var resp: String? = null

            RetrofitApi.retrofitService.postProperties(body["name"] ?: "", body["telephone"] ?: "", body["email"] ?:"").enqueue(
                object : Callback<String> {
                    override fun onFailure(call: Call<String>, t: Throwable) {
                        onFailure(t.message!!)
                    }

                    override fun onResponse(call: Call<String>, response: Response<String>) {
                        onResponse(response.body()!!)
                    }
                })
            return resp
        }
    }
}