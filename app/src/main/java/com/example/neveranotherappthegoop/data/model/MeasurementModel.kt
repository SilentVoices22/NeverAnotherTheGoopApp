package com.example.neveranotherappthegoop.data.model

/*---------------------------------------------------------Fælles-kodning, med hjælp fra ai 26/05/28-------------------------------------------------------------- */

//data class
//Bruges til at samle og opbevare data ét sted.

//MeasurementModel
//Indeholder appens state/data om målinger og checkout.

//upperCircumference
//Gemmer brugerens øvre omkreds.

//lowerCircumference
//Gemmer brugerens nedre omkreds.

//breastSpan
//Gemmer brugerens breast span.

//breastHeight
//Gemmer brugerens breast height.

//quantity
//Gemmer antal BH'er.

//selectedColor
//Gemmer den valgte farve.

//get()
//Kører hver gang totalPrice læses.

//totalPrice
//Beregnes ud fra antal BH'er.

//799 * quantity
//Prisen opdateres automatisk når quantity ændres.

data class MeasurementModel(
    val upperCircumference: String = "",
    val lowerCircumference: String = "",
    val breastSpan: String = "",
    val breastHeight: String = "",
    val quantity: Int = 1,
    val selectedColor: String = "White"
) {

    val totalPrice: Int
        get() = 799 * quantity
}