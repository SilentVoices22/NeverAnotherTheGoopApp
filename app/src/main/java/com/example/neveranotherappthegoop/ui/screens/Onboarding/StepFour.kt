package com.example.neveranotherappthegoop.ui.screens.Onboarding

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
import androidx.compose.material3.ButtonDefaults.buttonColors
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
import com.example.neveranotherappthegoop.data.components.ContinueButton
import com.example.neveranotherappthegoop.data.components.MeasurementInputField
import com.example.neveranotherappthegoop.data.components.VideoGuideButton
import com.example.neveranotherappthegoop.ui.theme.BoneWhite
import com.example.neveranotherappthegoop.ui.theme.Orangevibrant

/*---------------------------------------------------------Fælles-kodning-------------------------------------------------------------- */

@Composable
fun StepFourPage(
    onBackClick: () -> Unit,
    onContinueClick: () -> Unit,
    onVideoGuideClick: () -> Unit,
    measurement: String,
    onMeasurementChange: (String) -> Unit
) {
    Box(
        modifier = Modifier.background(White)
    ) {
        TopBar4(onBackClick = onBackClick)
        HeaderText4()
        PictureGuide4()
        VideoGuideButton(onClick = onVideoGuideClick)
        ContinueButton(onClick = onContinueClick)
        MeasurementInputField(value = measurement, onValueChange = onMeasurementChange)
        ImageText4()


    }
}

/*-----------------------------------------------Top-Bar--------------------------------------------- */

@Composable
fun TopBar4(
    onBackClick: () -> Unit
) {
    Box(
        modifier = Modifier.fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.topbar4),
            contentDescription = "Step Two",
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
fun HeaderText4() {
    Column(
        modifier = Modifier.padding(vertical = 90.dp, horizontal = 50.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp, alignment = Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Breast height",
            fontSize = 25.sp,
            fontWeight = Bold,
            fontFamily = Monospace)
        Text(
            text = "Measure from the under burst point, across" + "   the fullest point of your chest, and to the cup height point, in a straight vertical line."
        )
    }
}

@Composable
fun PictureGuide4() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.guide4),
            contentDescription = null,
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .padding(bottom = 140.dp)
                .width(377.dp)
                .height(288.dp)
        )
    }
}

@Composable
fun ImageText4() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 170.dp),

        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "If you are wearing a wired bra, measure from just\n" + "below your actual breast, and not below the wire."
        )
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = "Hold the tape measure tightly over your breast,\n" + "creating a little lift."
        )
    }
}


@Preview(showBackground = true)
@Composable
fun StepFourPreview() {
    StepFourPage(
        onBackClick = {},
        onContinueClick = {},
        onVideoGuideClick = {},
        measurement = "",
        onMeasurementChange = {}
    )
}



