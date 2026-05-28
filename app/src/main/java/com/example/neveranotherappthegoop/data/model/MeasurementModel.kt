package com.example.neveranotherappthegoop.data.model

/**
 * Data model representing the core measurement and purchase state.
 * Keeping this as a data class makes it pure, easily testable, and separate from UI frameworks.
 */
data class MeasurementModel(
    val measurement1: String = "",
    val measurement2: String = "",
    val measurement3: String = "",
    val measurement4: String = "",
    val quantity: Int = 1,
    val selectedColor: String = "White"
) {
    // Calculated property logic stays nested inside the model data layout rules
    val totalPrice: Int
        get() = 799 * quantity
}