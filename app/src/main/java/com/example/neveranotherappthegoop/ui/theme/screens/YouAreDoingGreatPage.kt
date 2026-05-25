package com.example.neveranotherappthegoop.ui.theme.screens
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.ui.tooling.preview.Preview
import com.example.neveranotherappthegoop.data.BackArrow
import com.example.neveranotherappthegoop.ui.theme.Orangevibrant

@Preview(showBackground = true)
@Composable
fun YouaredoinggreatPreview(
){
    YouAreDoingGreatPage(
        onBackClick = {},
        onPageButtonClick = {}
    )
}

@Composable
fun YouAreDoingGreatPage(
    onBackClick: () -> Unit,
    onPageButtonClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        PageText()
        PageButton( onPageButtonClick = onPageButtonClick)
        BackArrow( onClick = onBackClick)
    }
}

@Composable
fun PageText () {
    Box (
        modifier = Modifier.fillMaxSize(),
    ) {
        Text(
            text = "You're doing great!\n" +
                    "Let's get the last two \n"  +
                    "measurements.",
            fontSize = 30.sp,
            textAlign = TextAlign.Start,
            modifier = Modifier
                .padding(top = 270.dp)
                .align(Alignment.TopCenter)
        )
    }
    Box(
    modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
    Text(
        text = "If you ever need to go back and double\n" +
                "check, don't worry - we've saved your\n" +
                "measurements.",
        fontSize = 15.sp,
        modifier = Modifier
            .padding(bottom = 65.dp, top = 15.dp)
    )
    }
}

@Composable
fun PageButton (
    onPageButtonClick: () -> Unit
) {
   Box(
        modifier = Modifier
            .padding(bottom = 20.dp)
            .fillMaxSize(),
            contentAlignment = Alignment.BottomCenter
   ) {
       Button(
           onClick = onPageButtonClick,
           modifier = Modifier
               .width(310.dp)
               .height(40.dp),
           shape = RoundedCornerShape(12.dp),
           colors = ButtonDefaults.buttonColors(
               containerColor = Orangevibrant
           )
           ) {
           Text(
               text = "Continue",
           )
       }
   }
}












