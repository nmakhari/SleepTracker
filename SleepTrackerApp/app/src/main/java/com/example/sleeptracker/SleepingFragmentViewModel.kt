package com.example.sleeptracker

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import timber.log.Timber

class SleepingFragmentViewModel: ViewModel() {
    private val _eventWakeUp = MutableLiveData<Boolean>()
    val eventWakeUp: LiveData<Boolean>
        get() = _eventWakeUp

    init {
        Timber.d("SleepingFragmentViewModel created")
        _eventWakeUp.value = false
    }

    override fun onCleared() {
        super.onCleared()
        // TODO: clean up the viewModels resources here, before they're gone for good
        Timber.d("SleepingFragmentViewModel destroyed")
    }

    fun onWakeUp() {
        _eventWakeUp.value = true
    }

    fun onWakeUpComplete() {
        _eventWakeUp.value = false
    }
}