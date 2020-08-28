package com.example.sleeptracker

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.sleeptracker.databinding.FragmentRatingBinding
import timber.log.Timber

class RatingFragment : Fragment() {

    private lateinit var FragmentRatingbinding: FragmentRatingBinding
    private lateinit var viewModel: RatingFragmentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        FragmentRatingbinding = FragmentRatingBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this).get(RatingFragmentViewModel::class.java)
        setClickListeners()
        return FragmentRatingbinding.root
    }

    private fun setClickListeners() {
        FragmentRatingbinding.submitButton.setOnClickListener {
            Timber.d("Submit rating button clicked")
        }
        // TODO: Implement rating click listeners and changes in viewModel
    }

}