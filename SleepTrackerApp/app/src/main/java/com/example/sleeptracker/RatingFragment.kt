package com.example.sleeptracker

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
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

        viewModel.currentRatingImage.observe(viewLifecycleOwner, Observer { newRating ->
            FragmentRatingbinding.selectedRating.setImageResource(newRating)
        })
        return FragmentRatingbinding.root
    }

    private fun setClickListeners() {
        FragmentRatingbinding.submitButton.setOnClickListener {
            Timber.d("Submit rating button clicked")
        }

        // TODO: Refactor these listeners into the view itself
        FragmentRatingbinding.goodRating.setOnClickListener{
            Timber.d("Good rating selected")
            viewModel.currentRatingImage.value = R.drawable.good_rating
        }

        FragmentRatingbinding.neutralRating.setOnClickListener{
            Timber.d("Neutral rating selected")
            viewModel.currentRatingImage.value = R.drawable.neutral_rating
        }

        FragmentRatingbinding.poorRating.setOnClickListener{
            Timber.d("Poor rating selected")
            viewModel.currentRatingImage.value = R.drawable.poor_rating
        }
    }

}