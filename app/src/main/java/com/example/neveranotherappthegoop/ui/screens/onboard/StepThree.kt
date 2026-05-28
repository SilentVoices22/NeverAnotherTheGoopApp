package com.example.neveranotherappthegoop.ui.screens.onboard


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily.Companion.Monospace
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.neveranotherappthegoop.R
import com.example.neveranotherappthegoop.data.ContinueButton
import com.example.neveranotherappthegoop.data.VideoGuide
import com.example.neveranotherappthegoop.ui.theme.BoneWhite


@Composable

fun StepThreePage(
    onBackClick: () -> Unit,
    onStepFourButtonClick: () -> Unit,
    onVideoGuideClick: () -> Unit
) {
    Box(
        modifier = Modifier.background(White)
    ) {
        TopBar3(onBackClick = onBackClick)
        HeaderText3()
        PictureGuide3()
        VideoGuide(onClick = onVideoGuideClick)
        ContinueButton(onClick = onStepFourButtonClick)
        ImageText3()
        TextField3()
    }
}


/*-----------------------------------------------Top-Bar--------------------------------------------- */


@Composable
fun TopBar3(
    onBackClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.topbar3),
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
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "Back"
            )
        }
    }
}


/*-------------------------------------------HeaderText---------------------------------------------- */




@Composable
fun HeaderText3() {
    Column(
        modifier = Modifier
            .padding(vertical = 90.dp, horizontal = 50.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Breast span",
            fontSize = 25.sp,
            fontWeight = Bold,
            fontFamily = Monospace,
            modifier = Modifier.padding(bottom = 20.dp)
        )
        Text(
            text = "Place the tape measure in a straight " +
                    "horizontal line across the curve of your bust."
        )
    }
}


@Composable
fun PictureGuide3() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.guide3),
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
fun ImageText3() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 180.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Don't tighten the measurement tape, but \n" +
                    "keep it snug over your bust."
        )
    }
}


@Composable
fun TextField3() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 260.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Enter your measurements",
            modifier = Modifier.padding( bottom = 10.dp)
        )
        Box(
            modifier = Modifier
                .width(180.dp)
                .height(50.dp)
                .background(
                    color = BoneWhite,
                    shape = RoundedCornerShape(12.dp)
                ),
            contentAlignment = Alignment.Center
        ) {
            TextField(
                state = rememberTextFieldState(initialText = ""),
                label = { Text("cm")}
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun MainScreenPreviewer() {
    StepThreePage(
        onBackClick = {},
        onStepFourButtonClick = {},
        onVideoGuideClick = {}
    )
}



