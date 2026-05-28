package com.example.neveranotherappthegoop.data

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.neveranotherappthegoop.R
import com.example.neveranotherappthegoop.ui.theme.Orangevibrant


// Kevin
@Composable
fun NaButton(
    textButton: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit, ){
    Button(
        onClick = onClick,
        modifier = Modifier
            .padding(top = 10.dp)
            .height(60.dp)
            .width(280.dp),
        shape = RoundedCornerShape(6.dp),
        colors = buttonColors(
            containerColor = Orangevibrant,
            contentColor = Color.White)
    ){
        Text( text = textButton,
            fontSize = 20.sp)
    }
}


// Hjalte
@Composable
fun BackArrow(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = Modifier
    ) {
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

// Sofia
@Composable
fun BottomDetailscheckout() {

    // "Made for you - Made-to-order - Free size guarantee"
    Image(
        painter = painterResource(id = R.drawable.guaranteebottomtext2),
        contentDescription = null,
        modifier = Modifier
            .size(350.dp)
            .padding(bottom = 15.dp),
        contentScale = ContentScale.FillWidth
    )
}

@Composable
fun BottomDetailsresult() {
    // "Made for you - Made-to-order - Free size guarantee"
    Image(
        painter = painterResource(id = R.drawable.guaranteebottomtext),
        contentDescription = null,
        modifier = Modifier.fillMaxWidth(),
        contentScale = ContentScale.FillWidth
    )
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