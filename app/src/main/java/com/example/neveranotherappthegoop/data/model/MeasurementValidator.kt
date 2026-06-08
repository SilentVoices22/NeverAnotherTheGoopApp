package com.example.neveranotherappthegoop.data.model

object MeasurementValidator {

    // ---------- Validation Checks ----------
    fun isUpperCircumferenceTooLarge(value: String): Boolean {
        val number = value.toDoubleOrNull() ?: 0.0
        return number == null || number < 77.0 || number > 113.0
    }

    fun isLowerCircumferenceTooLarge(value: String): Boolean {
        val number = value.toDoubleOrNull() ?: 0.0
        return number < 65.0 || number > 100.0
    }

    fun isInvalidInput(value: String): Boolean {
        return value.toDoubleOrNull() == null
    }
}