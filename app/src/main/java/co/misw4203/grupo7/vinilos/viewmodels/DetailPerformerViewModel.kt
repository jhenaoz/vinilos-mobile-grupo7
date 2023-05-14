package co.misw4203.grupo7.vinilos.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import co.misw4203.grupo7.vinilos.models.Performer
import co.misw4203.grupo7.vinilos.repositories.PerformerRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class DetailPerformerViewModel (application: Application, id: Int) : AndroidViewModel(application) {

    private val _performer = MutableLiveData<Performer>()
    private val performerRepository = PerformerRepository(application)

    val performer: LiveData<Performer>
        get() = _performer

    private var _eventNetworkError = MutableLiveData<Boolean>(false)

    val eventNetworkError: LiveData<Boolean>
        get() = _eventNetworkError

    private var _isNetworkErrorShown = MutableLiveData<Boolean>(false)

    val isNetworkErrorShown: LiveData<Boolean>
        get() = _isNetworkErrorShown

    val id: Int = id

    init {
        refreshDataFromNetwork()
    }

    private fun refreshDataFromNetwork() {
        try {
            viewModelScope.launch (Dispatchers.Default){
                withContext(Dispatchers.IO){
                    try {
                        var band = performerRepository.refreshDataBandById(id)
                        _performer.postValue(band)
                    }catch (e:Exception){
                        var musicians = performerRepository.refreshDataMusicianById(id)
                        _performer.postValue(musicians)
                    }catch (e:Exception){
                        _eventNetworkError.postValue(true)
                    }
                }
                _eventNetworkError.postValue(false)
                _isNetworkErrorShown.postValue(false)
            }
        }
        catch (e:Exception){
            _eventNetworkError.postValue(true)
        }
    }

    fun onNetworkErrorShown() {
        _isNetworkErrorShown.value = true
    }

    class Factory(val app: Application, val id: Int) : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(DetailPerformerViewModel::class.java)) {
                @Suppress("UNCHECKED_CAST")
                return DetailPerformerViewModel(app, id) as T
            }
            throw IllegalArgumentException("Unable to construct viewmodel")
        }
    }
}