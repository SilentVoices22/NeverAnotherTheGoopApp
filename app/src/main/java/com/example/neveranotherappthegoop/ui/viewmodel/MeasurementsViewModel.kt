package com.example.neveranotherappthegoop.ui.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MeasurementsViewModel : ViewModel() {

    // ---------- Measurements ----------
    var measurement1 by mutableStateOf("")
        private set
    var measurement2 by mutableStateOf("")
        private set
    var measurement3 by mutableStateOf("")
        private set
    var measurement4 by mutableStateOf("")
        private set

    fun updateMeasurement1(value: String) { measurement1 = value }
    fun updateMeasurement2(value: String) { measurement2 = value }
    fun updateMeasurement3(value: String) { measurement3 = value }
    fun updateMeasurement4(value: String) { measurement4 = value }

    // ---------- Checkout ----------
    var quantity by mutableIntStateOf(1)
        private set
    var selectedColor by mutableStateOf("White")
        private set

    val totalPrice: Int get() = 799 * quantity

    fun increaseQuantity() { quantity++ }
    fun decreaseQuantity() { if (quantity > 1) quantity-- }
    fun selectColor(color: String) { selectedColor = color }

    // ---------- Validation ----------
    // Steps 1 & 2: upper/lower circumference — max 130 cm → ErrorRecovery
    fun isCircumferenceTooLarge(value: String): Boolean =
        (value.toDoubleOrNull() ?: 0.0) > 130.0

    // Steps 3 & 4: breast span/height — max 35 cm → FalloutPage
    fun isSpanHeightTooLarge(value: String): Boolean =
        (value.toDoubleOrNull() ?: 0.0) > 35.0
}
