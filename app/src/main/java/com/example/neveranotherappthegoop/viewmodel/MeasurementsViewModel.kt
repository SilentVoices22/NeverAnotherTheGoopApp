package com.example.neveranotherappthegoop.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.neveranotherappthegoop.data.model.MeasurementModel

/*---------------------------------------------------------Fælles-kodning, med hjælp fra ai 26/05/28-------------------------------------------------------------- */


class MeasurementsViewModel : ViewModel() {

    // Central unified single source of state powered by our pure Model layer
    var uiState by mutableStateOf(MeasurementModel())
        private set

    // ---------- Update Measurement States ----------
    fun updateUpperCircumference (value: String) {
        uiState = uiState.copy(upperCircumference = value)
    }

    fun updateLowerCircumference(value: String) {
        uiState = uiState.copy(lowerCircumference = value)
    }

    fun updateBreastSpan(value: String) {
        uiState = uiState.copy(breastSpan = value)
    }

    fun updateBreastHeight(value: String) {
        uiState = uiState.copy(breastHeight = value)
    }

    // ---------- Checkout Settings ----------
    fun increaseQuantity() {
        uiState = uiState.copy(quantity = uiState.quantity + 1)
    }

    fun decreaseQuantity() {
        if (uiState.quantity > 1) {
            uiState = uiState.copy(quantity = uiState.quantity - 1)
        }
    }

    fun selectColor(color: String) {
        uiState = uiState.copy(selectedColor = color)
    }
}