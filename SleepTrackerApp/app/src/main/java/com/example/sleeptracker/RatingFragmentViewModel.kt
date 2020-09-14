package com.example.sleeptracker

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import timber.log.Timber

class RatingFragmentViewModel: ViewModel() {
    // This variable will contain an image resource, hence int type
    // LiveData is encapsulated using a backing property
    private val _currentRatingImage = MutableLiveData<Int>()
    val currentRatingImage: LiveData<Int>
        get() = _currentRatingImage

    init {
        Timber.d("RatingViewModel created")
        _currentRatingImage.value = 0
    }
    // Needs current image
    // Needs to load in the sleeping time
    // needs to interact with the view to directly implement listeners
    override fun onCleared() {
        super.onCleared()
        // TODO: clean up resources on viewModel destruction
        Timber.d("RatingViewModel destroyed")
    }

    fun updateCurrentRating(newImage: Int) {
        _currentRatingImage.value = newImage
    }

}