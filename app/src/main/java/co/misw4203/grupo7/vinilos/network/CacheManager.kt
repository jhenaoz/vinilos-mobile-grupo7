package co.misw4203.grupo7.vinilos.network

import android.content.Context
import android.util.LruCache
import co.misw4203.grupo7.vinilos.models.Band
import co.misw4203.grupo7.vinilos.models.Musician
import co.misw4203.grupo7.vinilos.models.Performer

class CacheManager(context: Context) {
    companion object{
        var instance: CacheManager? = null
        fun getInstance(context: Context) =
            instance ?: synchronized(this) {
                instance ?: CacheManager(context).also {
                    instance = it
                }
            }
    }

    private var bands: LruCache<Int, Band> = LruCache(5)
    fun addBand(id: Int, band: Band){
        if (bands[id] == null){
            bands.put(id, band)
        }
    }
    fun getBand(id: Int) : Band? {
        return if (bands[id]!=null) bands[id]!! else null
    }

    private var musicians: LruCache<Int, Musician> = LruCache(5)
    fun addMusician(id: Int, musician: Musician){
        if (musicians[id] == null){
            musicians.put(id, musician)
        }
    }
    fun getMusician(id: Int) : Musician? {
        return if (musicians[id]!=null) musicians[id]!! else null
    }
}