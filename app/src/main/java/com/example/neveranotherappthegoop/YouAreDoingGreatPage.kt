package com.example.neveranotherappthegoop
import android.graphics.fonts.FontFamily
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import com.example.neveranotherappthegoop.ui.theme.InterFont
import com.example.neveranotherappthegoop.ui.theme.Orange
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton



@Composable
fun YouAreDoingGreatPage() {

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {

        PageText()

        PageButton()

        BackArrow()


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

            fontFamily = InterFont,
            fontSize = 30.sp,
            textAlign = TextAlign.Start,

            modifier = Modifier
                .padding(top = 270.dp)
                .align(Alignment.TopCenter)
        )
    }


    Box(

    modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center

    ) {

    Text(
        text = "If you ever need to go back and double\n" +
                "check, don't worry - we've saved your\n" +
                "measurements.",

        fontFamily = InterFont,
        fontSize = 15.sp,

        modifier = Modifier.padding(bottom = 70.dp)

    )

    }
}




@Composable
fun PageButton () {

   Box(
        modifier = Modifier
            .padding(bottom = 20.dp)
            .fillMaxSize(),
            contentAlignment = Alignment.BottomCenter

   ) {

       Button(
           onClick = {},

           modifier = Modifier
               .width(310.dp)
               .height(40.dp),

           shape = RoundedCornerShape(12.dp),
           colors = ButtonDefaults.buttonColors(

               containerColor = Orange
           )

           ) {
           Text(
               text = "Continue",
               fontFamily = InterFont
           )
       }
   }
}



@Composable
fun BackArrow() {

    Box(
        modifier = Modifier.fillMaxSize()
    ) {

        IconButton(
            onClick = {
                println("Back clicked")
            },

            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(16.dp)
        ) {

            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "Back"
            )
        }
    }
}










