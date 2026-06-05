package com.example.neveranotherappthegoop.data.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.neveranotherappthegoop.R
import com.example.neveranotherappthegoop.ui.theme.BoneWhite
import com.example.neveranotherappthegoop.ui.theme.Orangevibrant

/*---------------------------------------------------------Fælles-kodning-------------------------------------------------------------- */


@Composable
fun NaButton(
    textButton: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .padding(top = 10.dp)
            .height(60.dp)
            .width(280.dp),
        shape = RoundedCornerShape(6.dp),
        colors = buttonColors(
            containerColor = Orangevibrant,
            contentColor = Color.White
        )
    ) {
        Text(
            text = textButton,
            fontSize = 20.sp
        )
    }
}


@Composable
fun BackArrow(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier) {
        IconButton(
            onClick = onClick,
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(16.dp)
        ) {
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                contentDescription = "Back"
            )
        }
    }
}


@Composable
fun TopbarErrorRecovery(onBackClick: () -> Unit) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(40.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        BackArrow(onClick = onBackClick)
        NALogoName()
    }
}

// All video-guide-buttons
@Composable
fun VideoGuideButton(
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

// All continue-buttons
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

// All inputfield-buttons
@Composable
fun MeasurementInputField(
    value: String,
    onValueChange: (String) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 260.dp),
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
