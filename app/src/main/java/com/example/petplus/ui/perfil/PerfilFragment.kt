package com.example.petplus.ui.perfil

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.petplus.R
import com.example.petplus.ui.recordatorios.RecordatoriosViewModel

class PerfilFragment : Fragment() {

    private lateinit var perfilViewModel: PerfilViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        perfilViewModel =
            ViewModelProviders.of(this).get(PerfilViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_perfil, container, false)
        //val textView: TextView = root.findViewById(R.id.text_perfil)
        perfilViewModel.text.observe(this, Observer {
            //textView.text = it
        })
        return root
    }
}
