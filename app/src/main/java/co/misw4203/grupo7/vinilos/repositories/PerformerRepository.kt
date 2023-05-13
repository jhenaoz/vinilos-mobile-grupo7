package co.misw4203.grupo7.vinilos.repositories

import android.app.Application
import android.content.Context
import android.net.ConnectivityManager
import android.util.Log
import co.misw4203.grupo7.vinilos.models.Band
import co.misw4203.grupo7.vinilos.models.Musician
import co.misw4203.grupo7.vinilos.network.CacheManager
import co.misw4203.grupo7.vinilos.network.NetworkServiceAdapter

class PerformerRepository (val application: Application) {

    suspend fun refreshDataMusicians(): List<Musician>{
        return NetworkServiceAdapter.getInstance(application).getMusicians()
    }

    suspend fun refreshDataBands(): List<Band>{
        return NetworkServiceAdapter.getInstance(application).getBands()
    }

    suspend fun refreshDataMusicianById(id: Int): Musician {
        var potentialResp = CacheManager.getInstance(application.applicationContext).getMusician(id)
        if(potentialResp == null){
            Log.d("Cache decision", "get from network")
            var musician = NetworkServiceAdapter.getInstance(application).getMusicianById(id)
            CacheManager.getInstance(application.applicationContext).addMusician(id, musician)
            return musician
        }
        else{
            Log.d("Cache decision", "return null musician from cache")
            return potentialResp
        }
    }

    suspend fun refreshDataBandById(id: Int): Band {
        var potentialResp = CacheManager.getInstance(application.applicationContext).getBand(id)
        if(potentialResp == null){
            Log.d("Cache decision", "get from network")
            var band = NetworkServiceAdapter.getInstance(application).getBandById(id)
            CacheManager.getInstance(application.applicationContext).addBand(id, band)
            return band
        }
        else{
            Log.d("Cache decision", "return null band from cache")
            return potentialResp
        }
    }

}