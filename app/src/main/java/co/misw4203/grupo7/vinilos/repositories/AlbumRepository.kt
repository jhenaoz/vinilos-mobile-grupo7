package co.misw4203.grupo7.vinilos.repositories

import android.app.Application
import android.util.Log
import co.misw4203.grupo7.vinilos.models.Album
import co.misw4203.grupo7.vinilos.network.CacheManager
import co.misw4203.grupo7.vinilos.network.NetworkServiceAdapter

class AlbumRepository(val application: Application) {
    suspend fun refreshDataAlbums(): List<Album>{
        return NetworkServiceAdapter.getInstance(application).getAlbums()
    }
    suspend fun refreshDataAlbumById(id: Int): Album {
        var potentialResp = CacheManager.getInstance(application.applicationContext).getAlbum(id)
        if(potentialResp == null){
            Log.d("Cache decision", "get from network")
            var album = NetworkServiceAdapter.getInstance(application).getAlbumById(id)
            CacheManager.getInstance(application.applicationContext).addAlbum(id, album)
            return album
        }
        else{
            Log.d("Cache decision", "return null musician from cache")
            return potentialResp
        }
    }
}