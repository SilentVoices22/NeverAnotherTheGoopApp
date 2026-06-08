package com.example.neveranotherappthegoop

import com.example.neveranotherappthegoop.data.model.MeasurementValidator
import org.junit.Test

import org.junit.Assert.*


//val result = MeasurementValidator.isUpperCircumferenceTooLarge("90")
//Finder objektet "MeasurementValidator" og dens funktion "isUpperCircumferenceTooLarge" -
//Herefter laver den testen ud fra de constraints der er angivet i funktionen -
//Og bruger værdien "90" i testen.

//assertEquals(false, result)
//Angiver at det forventes at resultatet er false og tjekker om det passer

//False og true kan godt være forvirrende hvis man glemmer at den tjekker efter funktionsnavnet -
//isUpperCircumferenceTooLarge - false betyder i denne sammenhæng at målet er korrekt og anvendeligt
//true betyder at målet er for stort og ikke anvendeligt

class MeasurementValidatorTest {

    //Tester om "90 cm" er inde for grænsen
    @Test
    fun `Upper circumference within range`() {
        val result =
            MeasurementValidator.isUpperCircumferenceTooLarge("90")

        assertEquals(false, result)
    }

    //Tester om "76 cm" er for lav en størrelse
    @Test
    fun `Upper circumference below minimum`() {
        val result =
            MeasurementValidator.isUpperCircumferenceTooLarge("76")

        assertEquals(true, result)

    }

    //Tester om "120 cm" er for stor en størrelse
    @Test
    fun `Upper circumference above maximum`() {
        val result =
            MeasurementValidator.isUpperCircumferenceTooLarge("120")

        assertEquals(true, result)
    }

    //Tester om "80 cm" er inde for grænsen
    @Test
    fun `Lower circumference within range` () {
        val result =
            MeasurementValidator.isLowerCircumferenceTooLarge("80")

        assertEquals(false, result)
    }

    @Test
    fun `Invalid input returns true` () {
        val result =
            MeasurementValidator.isLowerCircumferenceTooLarge("FKH")

        assertEquals(true, result)
    }
}
