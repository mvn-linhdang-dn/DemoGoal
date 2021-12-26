package com.example.demogoal.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.koin.core.KoinComponent

open class BaseViewModel : ViewModel(), KoinComponent {

    val firstFragment = "First Fragment"
    val secondFragment = "Second Fragment"
    val firstButton = "First"
    val secondButton = "Second"

    private val _toastMessage = MutableLiveData<String>()
    val toastMessage: LiveData<String> = _toastMessage

    fun newToastMessage(message: String) {
        _toastMessage.value = message
    }
}
