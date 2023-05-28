package co.misw4203.grupo7.vinilos.viewmodels

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import co.misw4203.grupo7.vinilos.models.Track
import co.misw4203.grupo7.vinilos.network.NetworkServiceAdapter




class TrackListViewModel (application: Application, albumId: Int) : AndroidViewModel(application) {

    private val _trackList = MutableLiveData<List<Track>>()

    val id: Int = albumId

    val trackList: LiveData<List<Track>>
        get() = _trackList

    private var _eventNetworkError = MutableLiveData<Boolean>(false)

    val eventNetworkError: LiveData<Boolean>
        get() = _eventNetworkError

    private var _isNetworkErrorShown = MutableLiveData<Boolean>(false)

    val isNetworkErrorShown: LiveData<Boolean>
        get() = _isNetworkErrorShown

    init {
        refreshDataFromNetwork()
    }
    private fun refreshDataFromNetwork() {
        NetworkServiceAdapter.getInstance(getApplication()).getTracksByAlbumId(id, {
            _trackList.postValue(it)
            _eventNetworkError.value = false
            _isNetworkErrorShown.value = false
        }, {
            Log.d("Error", it.toString())
            _eventNetworkError.value = true
        })
    }

    fun onNetworkErrorShown() {
        _isNetworkErrorShown.value = true
    }

    class Factory(val app: Application, val albumId: Int) : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(TrackListViewModel::class.java)) {
                @Suppress("UNCHECKED_CAST")
                return TrackListViewModel(app, albumId) as T
            }
            throw IllegalArgumentException("Unable to construct viewmodel")
        }
    }
}