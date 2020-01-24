package com.example.petplus.ui.mascota

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MascotaViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Rocko"
    }
    val text: LiveData<String> = _text
}