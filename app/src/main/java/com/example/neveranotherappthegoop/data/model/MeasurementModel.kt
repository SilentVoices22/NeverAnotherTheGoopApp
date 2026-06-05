package com.example.neveranotherappthegoop.data.model

/*---------------------------------------------------------Fælles-kodning, med hjælp fra ai 26/05/28-------------------------------------------------------------- */

data class MeasurementModel(
    val upperCircumference: String = "",
    val lowerCircumference: String = "",
    val breastSpan: String = "",
    val breastHeight: String = "",
    val quantity: Int = 1,
    val selectedColor: String = "White"
) {
    // Calculated property logic stays nested inside the model data layout rules
    val totalPrice: Int
        get() = 799 * quantity
}