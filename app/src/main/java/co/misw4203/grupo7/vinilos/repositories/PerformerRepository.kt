package co.misw4203.grupo7.vinilos.repositories

import android.app.Application
import android.content.Context
import android.net.ConnectivityManager
import android.util.Log
import co.misw4203.grupo7.vinilos.database.BandDao
import co.misw4203.grupo7.vinilos.database.MusicianDao
import co.misw4203.grupo7.vinilos.models.Band
import co.misw4203.grupo7.vinilos.models.Musician
import co.misw4203.grupo7.vinilos.network.CacheManager
import co.misw4203.grupo7.vinilos.network.NetworkServiceAdapter

class PerformerRepository (val application: Application, private val musicianDao: MusicianDao, private val bandDao: BandDao) {

    suspend fun refreshDataMusicians(): List<Musician>{
        var cached = musicianDao.getMusicians()
        return if(cached.isNullOrEmpty()){
            val cm = application.baseContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            if( cm.activeNetworkInfo?.type != ConnectivityManager.TYPE_WIFI && cm.activeNetworkInfo?.type != ConnectivityManager.TYPE_MOBILE){
                emptyList()
            } else  NetworkServiceAdapter.getInstance(application).getMusicians()
        } else cached

    }

    suspend fun refreshDataBands(): List<Band>{
        var cached = bandDao.getBands()
        return if(cached.isNullOrEmpty()){
            val cm = application.baseContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            if( cm.activeNetworkInfo?.type != ConnectivityManager.TYPE_WIFI && cm.activeNetworkInfo?.type != ConnectivityManager.TYPE_MOBILE){
                emptyList()
            } else NetworkServiceAdapter.getInstance(application).getBands()
        } else cached
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