package com.example.sleeptracker

import androidx.lifecycle.ViewModel
import timber.log.Timber

class RatingFragmentViewModel: ViewModel() {
    init {
        Timber.d("RatingViewModel created")
    }
    override fun onCleared() {
        super.onCleared()
        // TODO: clean up resources on viewModel destruction
        Timber.d("RatingViewModel destroyed")
    }
}