package com.example.petplus.ui.mascota

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.petplus.R

class MascotaFragment : Fragment() {

    private lateinit var mascotaViewModel: MascotaViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mascotaViewModel =
            ViewModelProviders.of(this).get(MascotaViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_mascota, container, false)
        val textView: TextView = root.findViewById(R.id.text_mascota)
        mascotaViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}