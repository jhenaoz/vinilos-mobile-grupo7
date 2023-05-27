package co.misw4203.grupo7.vinilos.repositories

import android.app.Application
import android.util.Log
import co.misw4203.grupo7.vinilos.models.Collector
import co.misw4203.grupo7.vinilos.network.CacheManager
import co.misw4203.grupo7.vinilos.network.NetworkServiceAdapter

class CollectorRepository(val application: Application) {

    suspend fun refreshDataCollectors(): List<Collector>{
        return NetworkServiceAdapter.getInstance(application).getCollectors()
    }
    suspend fun refreshDataCollectorById(id: Int): Collector {
        var potentialResp = CacheManager.getInstance(application.applicationContext).getCollector(id)
        if(potentialResp == null){
            Log.d("Cache decision", "get from network")
            var collector = NetworkServiceAdapter.getInstance(application).getCollectorById(id)
            CacheManager.getInstance(application.applicationContext).addCollector(id, collector)
            return collector
        }
        else{
            Log.d("Cache decision", "return null collector from cache")
            return potentialResp
        }
    }
}