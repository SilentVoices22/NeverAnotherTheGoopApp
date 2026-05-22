package com.example.neveranotherappthegoop.ui.theme.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.neveranotherappthegoop.data.IcMenu
import com.example.neveranotherappthegoop.data.IcShoppingCart
import com.example.neveranotherappthegoop.data.NALogoName
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily.Companion.Monospace
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.material3.Icon
import com.example.neveranotherappthegoop.R
import com.example.neveranotherappthegoop.ui.theme.Orangevibrant


@Composable //Kevin
fun ExpectationsTopbar() {
    // Row placerer elementer vandret
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        IcMenu()
        NALogoName()
        IcShoppingCart()
    }
}

@Composable //Oliver
fun ExpectationsText() {
    // Column placerer elementer lodret
    Column(modifier = Modifier.padding(vertical = 10.dp, horizontal = 50.dp)) {
        Text(
            text = "Let´s get\nready", // \n laver linjeskift
            fontSize = 32.sp,
            fontWeight = Bold,
            fontFamily = Monospace
        )
        Text(
            text = "You're just outside our current range, \nbut we’d love to fit you in soon.",
            modifier = Modifier.padding(top = 10.dp)
        )
    }
}

@Composable //Oliver
fun NeedText() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                top = (75.dp), bottom = (25.dp), start = (50.dp), end = (50.dp)
            )
            // Background med afrundede hjørner
            .background(
                Color(0xFFF9F6EE), shape = RoundedCornerShape(10.dp)
            )
            .padding(16.dp) // Indre afstand
    ) {
        Text(
            text = "You'll need", fontWeight = FontWeight.SemiBold // Halvfed tekst
        )
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically // Centrerer ikon og tekst
        ) {
            // Icon fra drawable folder
            Icon(
                painter = painterResource(R.drawable.measuringtape),
                contentDescription = "measuringtape",
                Modifier.size(60.dp)
            )
            Text("   A soft tape measure")
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(R.drawable.bra1),
                contentDescription = "measuringtape",
                Modifier.size(60.dp)
            )

            Text("   A bra you feel good in")
        }
    }
}

@Composable //Oliver
fun ExplainText() {
    Column(
        modifier = Modifier.padding(horizontal = 50.dp)
    ) {
        Text(
            "Your bra should have a well-fitting underwire, no thick padding, and give you the lift and shape that you like.\n" + "\n" + "You can also wear a wire-free bra, but make sure that it gives you the lift that you want."
        )
    }
}

@Composable //Oliver
fun pressureBox() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                top = (55.dp), bottom = (5.dp), start = (50.dp), end = (50.dp)
            )
            .background( // Lys baggrund med runde hjørner
                Color(0xFFF9F6EE), shape = RoundedCornerShape(10.dp)
            )
            .padding(16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(R.drawable.heart),
                contentDescription = "heart icon",
                Modifier.size(60.dp)
            )
            Text(
                "No pressure, No GuessWork\n Just you, you've got this."
            )
        }
    }
}

@Composable //Oliver
fun BeginButton() {
    Column(
        modifier = Modifier.padding(vertical = 10.dp, horizontal = 50.dp)
    ) {
        // Button komponent
        Button(
            onClick = { }, // Hvad der sker ved klik
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
                .padding(top = 10.dp),
            shape = RoundedCornerShape(5.dp), // Runde hjørner
            colors = ButtonDefaults.buttonColors(
                containerColor = Orangevibrant, // Baggrundsfarve
                contentColor = Color.White // Tekstfarve
            )
        ) {
            Text("Let's begin")
        }
    }
}

@Composable //Oliver
fun ExpectationsPageBody() {

    // Hoved layout til hele siden
    Column(modifier = Modifier.fillMaxSize()) {
        ExpectationsTopbar()
        ExpectationsText()
        NeedText()
        ExplainText()
        pressureBox()
        BeginButton()
    }
}

@Preview(showBackground = true) // Preview i Android Studio
@Composable
fun ExpectationsPreview() {
    ExpectationsPageBody()
}