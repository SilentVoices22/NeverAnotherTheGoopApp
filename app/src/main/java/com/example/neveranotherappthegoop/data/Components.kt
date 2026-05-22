package com.example.neveranotherappthegoop.data

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.neveranotherappthegoop.ui.theme.Orangevibrant


// Kevin
@Composable
fun NaButton(textButton: String, modifier: Modifier = Modifier){
    Button(onClick = { },
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

@Preview(showBackground = true)
@Composable
fun NaButtonPreview(){

}

// Hjalte
@Composable
fun BackArrow() {
    Box(
        modifier = Modifier
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
                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                contentDescription = "Back"
            )
        }
    }
}
