package co.misw4203.grupo7.vinilos.network

import android.content.Context
import android.util.LruCache
import co.misw4203.grupo7.vinilos.models.Album
import co.misw4203.grupo7.vinilos.models.Band
import co.misw4203.grupo7.vinilos.models.Collector
import co.misw4203.grupo7.vinilos.models.Musician

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
    private var albums: LruCache<Int, Album> = LruCache(5)
    fun addAlbum(id: Int, album: Album){
        if (albums[id] == null){
            albums.put(id, album)
        }
    }
    fun getAlbum(id: Int) : Album? {
        return if (albums[id]!=null) albums[id]!! else null
    }

    private var collectors: LruCache<Int, Collector> = LruCache(5)
    fun addCollector(id: Int, collector: Collector){
        if (collectors[id] == null){
            collectors.put(id, collector)
        }
    }
    fun getCollector(id: Int) : Collector? {
        return if (collectors[id]!=null) collectors[id]!! else null
    }
}