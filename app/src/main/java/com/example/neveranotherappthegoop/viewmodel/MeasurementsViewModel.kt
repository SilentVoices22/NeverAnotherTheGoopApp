package com.example.neveranotherappthegoop.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
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
    fun isCircumferenceTooLarge(value: String): Boolean =
        (value.toDoubleOrNull() ?: 0.0) > 130.0

    // Steps 3 & 4: breast span/height — max 35 cm → FalloutPage
    fun isSpanHeightTooLarge(value: String): Boolean =
        (value.toDoubleOrNull() ?: 0.0) > 35.0
}