package com.example.neveranotherappthegoop.ui.screens.viewmodel

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class MeasurementViewmodel: ViewModel() {

    var upperBand by mutableStateOf("")

    var lowerBand by mutableStateOf("")

    var breastSpan by mutableStateOf("")

    var breastHeight by mutableStateOf("")

    fun saveUpperBand(size: String){
        upperBand = size
    }

    fun saveLowerBand(size: String){
        lowerBand = size
    }
    fun saveBreastSpand(size: String){
        breastSpan = size
    }
    fun SaveBreastHeight(size: String){
        breastHeight = size
    }




}