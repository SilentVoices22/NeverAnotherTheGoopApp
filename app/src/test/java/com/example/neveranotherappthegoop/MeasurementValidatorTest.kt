package com.example.neveranotherappthegoop

import com.example.neveranotherappthegoop.data.model.MeasurementValidator
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

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
