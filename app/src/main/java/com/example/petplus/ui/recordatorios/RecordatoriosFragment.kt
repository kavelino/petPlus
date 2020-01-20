package com.example.petplus.ui.recordatorios

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.petplus.R

class RecordatoriosFragment : Fragment() {

    private lateinit var recordatoriosViewModel: RecordatoriosViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        recordatoriosViewModel =
            ViewModelProviders.of(this).get(RecordatoriosViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_recordatorios, container, false)
        //val textView: TextView = root.findViewById(R.id.text_recordatorios)
        recordatoriosViewModel.text.observe(this, Observer {
            //textView.text = it
        })
        return root
    }
}