package com.example.neveranotherappthegoop.ui.screens.onboard


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily.Companion.Monospace
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.neveranotherappthegoop.R
import com.example.neveranotherappthegoop.data.ContinueButton
import com.example.neveranotherappthegoop.data.VideoGuide
import com.example.neveranotherappthegoop.ui.theme.BoneWhite
import com.example.neveranotherappthegoop.ui.theme.Orangevibrant


@Composable

fun StepTwoPage(
    onBackClick: () -> Unit,
    onStepThreeButtonClick: (String) -> Unit,
    onVideoGuideClick: () -> Unit,
) {
    var typedValue by remember { mutableStateOf("") }

    Box(
        modifier = Modifier.background(White)
    ) {
        TopBar2(onBackClick = onBackClick)
        HeaderText2()
        PictureGuide2()
        VideoGuide(
            onVideoGuideClick
        )
        ContinueButton(onClick = {onStepThreeButtonClick(typedValue)})
        ImageText2()
        TextField2(value = typedValue,
            onValueChange = { typedValue = it })
    }
}


/*-----------------------------------------------Top-Bar--------------------------------------------- */


@Composable
fun TopBar2(
    onBackClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.topbar2),
            contentDescription = "Step Two",
            modifier = Modifier.align(Alignment.TopCenter).width(220.dp)
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
fun HeaderText2() {
    Column(
        modifier = Modifier
            .padding(vertical = 90.dp, horizontal = 50.dp)
    ) {
        Text(
            text = "Lower circumference",
            fontSize = 25.sp,
            fontWeight = Bold,
            fontFamily = Monospace
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Place the tape measure around the body, " +
                    "right under the bust, where the underwire " +
                    "of a bra would sit. If you’re wearing a " +
                    "wired bra, place the tape underneath the wire."
        )
    }
}


@Composable
fun PictureGuide2() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.guide2),
            contentDescription = null,
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .padding(bottom = 105.dp)
                .width(377.dp)
                .height(288.dp)
        )
    }
}





@Composable
fun ImageText2() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 170.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Text(
            text = "Looks good!",
            modifier = Modifier.padding(bottom = 5.dp)
        )
        Text(
            text = "Make sure the tape is level all around."
        )
    }
}

@Composable
fun TextField2(
    value: String,
    onValueChange: (String) -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize().padding(bottom = 260.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Enter your measurements",
            modifier = Modifier.padding(bottom = 10.dp)
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
            OutlinedTextField(
                value = value,
                onValueChange = onValueChange,
                label = { Text("cm", fontSize = 20.sp) }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun StepTwoPreview(){
    StepTwoPage(
        onBackClick = {},
        onStepThreeButtonClick = {},
        onVideoGuideClick = {})
}





