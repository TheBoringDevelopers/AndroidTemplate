package com.theboringdevelopers.androidtemplate.activity

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * Модель базовой активности
 */
@HiltViewModel
class MainViewModel @Inject constructor(

) : ViewModel() {

    init {

    }
}