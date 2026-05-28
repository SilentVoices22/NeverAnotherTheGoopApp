package com.example.neveranotherappthegoop.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily.Companion.Monospace
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.neveranotherappthegoop.R
import com.example.neveranotherappthegoop.ui.theme.BoneWhite
import com.example.neveranotherappthegoop.ui.theme.Orangevibrant


@Composable
fun StepOnePage(
    onBackClick: () -> Unit,
    onContinueClick: () -> Unit,
    onVideoGuideClick: () -> Unit,
    measurement: String,
    onMeasurementChange: (String) -> Unit
) {
    Box(
        modifier = Modifier.background(White)
    ) {
        StepOneTopBar(onBackClick = onBackClick)
        HeaderText()
        PictureGuide()
        VideoGuide(onClick = onVideoGuideClick)
        ContinueButton(onClick = onContinueClick)
        ImageText()
        MeasurementTextField(value = measurement, onValueChange = onMeasurementChange)
    }

}


/*-----------------------------------------------Top-Bar--------------------------------------------- */

@Composable
fun StepOneTopBar(
    onBackClick: () -> Unit
) {
    Box(
        modifier = Modifier.fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.topbar1),
            contentDescription = "Step One",
            modifier = Modifier
                .align(Alignment.TopCenter)
                .width(220.dp)
        )
    }
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        IconButton(
            onClick = onBackClick,
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(24.dp)
        ) {
            Icon(
                imageVector = Icons.Default.ArrowBack, contentDescription = "Back"
            )
        }
    }
}


/*-------------------------------------------HeaderText---------------------------------------------- */


@Composable
fun HeaderText() {
    Column(
        modifier = Modifier.padding(vertical = 90.dp, horizontal = 50.dp)
    ) {
        Text(
            text = "Upper circumference",
            fontSize = 25.sp,
            fontWeight = Bold,
            fontFamily = Monospace
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Place your tape measure around your upper body, " + "and over the fullest part of your chest."
        )
    }
}

@Composable
fun PictureGuide() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.guide), contentDescription = null,
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .padding(bottom = 105.dp)
                .width(377.dp)
                .height(288.dp)
        )
    }
}

@Composable
fun VideoGuide(
    onClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 90.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // View video guide button
        OutlinedButton(
            onClick = onClick,
            modifier = Modifier
                .width(330.dp)
                .height(50.dp),
            border = BorderStroke(1.dp, Color(0xFFFF5F00)),
            shape = RoundedCornerShape(10.dp)
        ) {
            Text(
                "View video guide",
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal,
                color = Color(0xFFFF5F00)
            )
        }
    }
}


@Composable
fun ContinueButton(
    onClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 20.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // View video guide button
        OutlinedButton(
            onClick = onClick,
            modifier = Modifier
                .width(330.dp)
                .height(50.dp),
            border = BorderStroke(1.dp, Color(0xFFFF5F00)),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Orangevibrant
            )
        ) {
            Text(
                "Continue", fontSize = 20.sp, fontWeight = FontWeight.Normal, color = White
            )
        }
    }
}

@Composable
fun ImageText() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 170.dp, start = 30.dp),
        verticalArrangement = Arrangement.Bottom,
        ) {
        Text(
            text = "Stand up straight, " + "relax your body, and breathe out.",
            modifier = Modifier.padding(10.dp)
        )
        Text(
            text = "The measurement tape should run parallel to the floor, all the way around the body."
        )
    }
}

@Composable
fun MeasurementTextField(
    value: String,
    onValueChange: (String) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 240.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Enter your measurements",
            modifier = Modifier.padding(10.dp)
        )
        OutlinedTextField(
            value = value,
            onValueChange = onValueChange,
            modifier = Modifier.width(180.dp),
            placeholder = { Text("0.00 cm") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal),
            shape = RoundedCornerShape(12.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Orangevibrant,
                unfocusedBorderColor = Color.Transparent,
                unfocusedContainerColor = BoneWhite,
                focusedContainerColor = BoneWhite
            ),
            singleLine = true
        )
    }
}


@Preview(showBackground = true)
@Composable
fun StepONePagePreviewer() {
    StepOnePage(
        onBackClick = {},
        onContinueClick = {},
        onVideoGuideClick = {},
        measurement = "",
        onMeasurementChange = {}
    )
}



