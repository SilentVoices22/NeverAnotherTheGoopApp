package com.example.neveranotherappthegoop.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.neveranotherappthegoop.data.model.MeasurementModel

class MeasurementsViewModel : ViewModel() {

    // Central unified single source of state powered by our pure Model layer
    var uiState by mutableStateOf(MeasurementModel())
        private set

    // ---------- Update Measurement States ----------
    fun updateMeasurement1(value: String) {
        uiState = uiState.copy(measurement1 = value)
    }

    fun updateMeasurement2(value: String) {
        uiState = uiState.copy(measurement2 = value)
    }

    fun updateMeasurement3(value: String) {
        uiState = uiState.copy(measurement3 = value)
    }

    fun updateMeasurement4(value: String) {
        uiState = uiState.copy(measurement4 = value)
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

    // ---------- Validation Checks ----------
    // Steps 1 & 2: upper/lower circumference — max 130 cm → ErrorRecovery
    fun isUpperCircumferenceTooLarge(value: String): Boolean {
        val number = value.toDoubleOrNull() ?: 0.0
        return number < 77.0 || number > 113.0
    }

    fun isLowerCircumferenceTooLarge(value: String): Boolean {
        val number = value.toDoubleOrNull() ?: 0.0
        return number < 65.0 || number > 100.0
    }
}