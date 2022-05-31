package com.iiitlucknow.android.festify.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.iiitlucknow.android.festify.Adapters.RegEventsRecyclerViewAdapter
import com.iiitlucknow.android.festify.databinding.FragmentRegeventsBinding
import dagger.hilt.android.scopes.FragmentScoped

@FragmentScoped
class RegEventsFragment : Fragment() {
    private val regEventsViewModel: RegEventsViewModel by viewModels()

    lateinit var binding: FragmentRegeventsBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegeventsBinding.inflate(inflater, container, false)
        regEventsViewModel.allwords.observe(
            viewLifecycleOwner
        ) {
            binding.homeRecycler.adapter = RegEventsRecyclerViewAdapter(it)
        }

        binding.homeRecycler.setHasFixedSize(true)

        return binding.root
    }
}
