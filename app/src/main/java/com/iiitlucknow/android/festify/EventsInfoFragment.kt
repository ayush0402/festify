package com.iiitlucknow.android.festify

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.iiitlucknow.android.festify.Adapters.EventsInfoRecyclerViewAdapter
import com.iiitlucknow.android.festify.data_classes.recyclerItemClick
import com.iiitlucknow.android.festify.databinding.FragmentEventsinfoBinding

class EventsInfoFragment : Fragment() {
    private var _binding: FragmentEventsinfoBinding? = null
    private val binding get() = _binding!!
    val args: EventsInfoFragmentArgs by navArgs()
    lateinit var adapter: EventsInfoRecyclerViewAdapter
    private var m_android: MutableList<recyclerItemClick> = mutableListOf(
        recyclerItemClick(R.drawable.android_img, R.string.android, R.string.date),
        recyclerItemClick(R.drawable.android_img, R.string.android, R.string.date),
        recyclerItemClick(R.drawable.android_img, R.string.android, R.string.date),
        recyclerItemClick(R.drawable.android_img, R.string.android, R.string.date),
        recyclerItemClick(R.drawable.android_img, R.string.android, R.string.date)
    )
    private var m_web: MutableList<recyclerItemClick> = mutableListOf(
        recyclerItemClick(R.drawable.web_development_img, R.string.web, R.string.date),
        recyclerItemClick(R.drawable.web_development_img, R.string.web, R.string.date),
        recyclerItemClick(R.drawable.web_development_img, R.string.web, R.string.date),
        recyclerItemClick(R.drawable.web_development_img, R.string.web, R.string.date),
        recyclerItemClick(R.drawable.web_development_img, R.string.web, R.string.date)
    )
    private var m_cyber: MutableList<recyclerItemClick> = mutableListOf(
        recyclerItemClick(R.drawable.cybersecurity_img, R.string.cyber_sec, R.string.date),
        recyclerItemClick(R.drawable.cybersecurity_img, R.string.cyber_sec, R.string.date),
        recyclerItemClick(R.drawable.cybersecurity_img, R.string.cyber_sec, R.string.date),
        recyclerItemClick(R.drawable.cybersecurity_img, R.string.cyber_sec, R.string.date),
        recyclerItemClick(R.drawable.cybersecurity_img, R.string.cyber_sec, R.string.date)
    )
    private var m_ai: MutableList<recyclerItemClick> = mutableListOf(
        recyclerItemClick(R.drawable.ai_img, R.string.ai, R.string.date),
        recyclerItemClick(R.drawable.ai_img, R.string.ai, R.string.date),
        recyclerItemClick(R.drawable.ai_img, R.string.ai, R.string.date),
        recyclerItemClick(R.drawable.ai_img, R.string.ai, R.string.date),
        recyclerItemClick(R.drawable.ai_img, R.string.ai, R.string.date)
    )
    private var m_design: MutableList<recyclerItemClick> = mutableListOf(
        recyclerItemClick(R.drawable.designing_img, R.string.design, R.string.date),
        recyclerItemClick(R.drawable.designing_img, R.string.design, R.string.date),
        recyclerItemClick(R.drawable.designing_img, R.string.design, R.string.date),
        recyclerItemClick(R.drawable.designing_img, R.string.design, R.string.date),
        recyclerItemClick(R.drawable.designing_img, R.string.design, R.string.date)
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEventsinfoBinding.inflate(
            inflater, container, false
        )
        if (args.event == resources.getString(R.string.android)) {
            adapter = EventsInfoRecyclerViewAdapter(m_android)
        } else if (args.event == resources.getString(R.string.web)) {
            adapter = EventsInfoRecyclerViewAdapter(m_web)
        } else if (args.event == resources.getString(R.string.design)) {
            adapter = EventsInfoRecyclerViewAdapter(m_design)
        } else if (args.event == resources.getString(R.string.ai)) {
            adapter = EventsInfoRecyclerViewAdapter(m_ai)
        } else if (args.event == resources.getString(R.string.cyber_sec)) {
            adapter = EventsInfoRecyclerViewAdapter(m_cyber)
        }
        binding.clickRecycler.adapter = adapter
        binding.clickRecycler.setHasFixedSize(true)
        return binding.root
    }
}
