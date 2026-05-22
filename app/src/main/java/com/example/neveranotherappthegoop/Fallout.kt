package com.example.neveranotherappthegoop

import android.R.attr.onClick
import android.R.attr.text
import android.R.color.white
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.neveranotherappthegoop.data.IcMenu
import com.example.neveranotherappthegoop.data.IcShoppingCart
import com.example.neveranotherappthegoop.data.NALogoName
import org.w3c.dom.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily.Companion.Monospace
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.unit.dp
import java.lang.Compiler.enable
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.*
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.painterResource
import androidx.compose.material3.Text
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.example.neveranotherappthegoop.ui.theme.Orangevibrant


@Composable //Kevin
fun TopbarErrorRecovery() {
    Row(
        horizontalArrangement = Arrangement.spacedBy(40.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        BackArrow()
        NALogoName()
    }
}

@Composable //Oliver
fun FalloutText() {

    // Column placerer elementer lodret
    Column(modifier = Modifier.padding(vertical = 10.dp, horizontal = 50.dp)) {

        Text(
            text = "We're expanding\nour fit range ♡",
            fontSize = 32.sp,
            fontWeight = Bold,
            fontFamily = Monospace
        )

        // Spacer laver afstand mellem elementer
        Spacer(modifier = Modifier.height(10.dp) )

        Text(
            text = "You're just outside our current range, \nbut we’d love to fit you in soon."
        )
    }
}

@Composable //Oliver
fun FalloutMailBox() {

    // State variabel som gemmer email teksten
    var email by remember { mutableStateOf("") }

    Column(

        modifier = Modifier
            .padding(vertical = 75.dp, horizontal = 50.dp) // Ydre afstand
            .background(Color(0xFFF9F6EE)) // Baggrundsfarve
            .padding(16.dp), // Indre afstand

        verticalArrangement = Arrangement.Center, // Centrerer lodret
        horizontalAlignment = Alignment.CenterHorizontally // Centrerer vandret

    )

    {
        Text(
            text = "Join the waiting list and be the first to know when we’ve got your size."
        )

        Spacer(modifier = Modifier.height(10.dp))


        OutlinedTextField(
            value = email, // Viser værdien fra variablen
            onValueChange = { email = it }, // Opdaterer email når brugeren skriver
            placeholder = { Text(text = "Your email", fontSize = 14.sp) },
            singleLine = true, // Kun én linje tekst
            modifier = Modifier.fillMaxWidth()
        )


        Button(
            onClick = { }, // Hvad der skal ske når man klikker
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
                .padding(top = 10.dp),

            shape = RoundedCornerShape(5.dp), // Runde hjørner

            colors = ButtonDefaults.buttonColors(
                containerColor = Orangevibrant, // Baggrundsfarve på knappen
                contentColor = Color.White // Tekstfarve
            )
        ) {

            Text("Join waiting list")
        }
    }
}

@Composable //Oliver
fun MeantineText() {

    Column(modifier = Modifier.padding(horizontal = 50.dp)) {

        Text("In the meantine...")

        Spacer(modifier = Modifier.height(10.dp))

        Row() {


            Icon(
                painter = painterResource(R.drawable.measuringtape),
                contentDescription = "measuringtape",
                Modifier.size(40.dp)
            )

            Text(

                // buildAnnotatedString gør det muligt at style dele af teksten
                text = buildAnnotatedString {

                    withStyle(
                        style = SpanStyle(fontWeight = FontWeight.SemiBold)
                    ){

                        append(" Book an online fitting")
                    }

                    append("\n We´ll help you find the best option.")

                }
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        Row() {

            Icon(
                painter = painterResource(R.drawable.bra),
                contentDescription = "measuringtape",
                Modifier.size(40.dp)
            )

            Text(
                text = buildAnnotatedString {

                    withStyle(
                        style = SpanStyle(fontWeight = FontWeight.SemiBold)
                    ){

                        append(" Follow our journey")
                    }

                    append("\n See how we're growing our range.")

                }
            )
        }
    }
}

@Composable //Oliver
fun FalloutPageBody(){

    // Hoved layout til hele siden
    Column(modifier = Modifier.fillMaxSize()) {

        FalloutTopbar() // Topbar øverst

        FalloutText() // Overskrift og tekst

        FalloutMailBox() // Email felt + knap

        MeantineText() // Nederste informationssektion
    }
}

@Preview(showBackground = true) // Preview i Android Studio
@Composable
fun FalloutPreview() {

    // Viser hele siden i preview
    FalloutPageBody()
}