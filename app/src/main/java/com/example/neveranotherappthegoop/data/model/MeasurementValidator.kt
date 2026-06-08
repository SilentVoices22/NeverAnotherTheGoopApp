package com.example.neveranotherappthegoop.data.model

//Noter til testen

//value: String
//Modtager brugerens input som tekst

//toDoubleOrNull()
//Forsøger at konvertere tekst til tal

//number < 77.0
//Tjekker minimumsgrænse

//number > 113.0
//Tjekker maksimumsgrænse

//number == null
//Hvis inputtet ikke kan konverteres, returneres værdien null.
//Fx hvis number er strengen "90" kan den godt konvertere til tal.
//Men hvis number er strengen "abc" kan den ikke konvertere til tal.

//return
//Returnerer true hvis det indtastet mål er ugyldigt
object MeasurementValidator {

    // ---------- Validation Checks ----------
    fun isUpperCircumferenceTooLarge(value: String): Boolean {
        val number = value.toDoubleOrNull()
        return number == null || number < 77.0 || number > 113.0
    }

    fun isLowerCircumferenceTooLarge(value: String): Boolean {
        val number = value.toDoubleOrNull()
        return number == null || number < 65.0 || number > 100.0
    }

    fun isInvalidInput(value: String): Boolean {
        return value.toDoubleOrNull() == null
    }
}
