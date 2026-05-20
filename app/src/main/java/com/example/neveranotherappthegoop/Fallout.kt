package com.example.neveranotherappthegoop

import android.R.attr.onClick
import android.R.attr.text
import android.R.color.white
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.neveranotherappthegoop.data.IcMenu
import com.example.neveranotherappthegoop.data.IcShoppingCart
import com.example.neveranotherappthegoop.data.NALogoName
import org.w3c.dom.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily.Companion.Monospace
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.unit.dp
import com.example.neveranotherappthegoop.ui.theme.OrangeMain
import java.lang.Compiler.enable
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.*
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.painterResource
import com.example.neveranotherappthegoop.ui.theme.EggWhite
import androidx.compose.material3.Text
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle


@Composable
    fun FalloutTopbar(){
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween){
            IcMenu()
            NALogoName()
            IcShoppingCart()
        }
    }

@Composable
fun FalloutText() {
    Column(modifier = Modifier.padding(vertical = 10.dp, horizontal = 50.dp)) {
        Text(
            text = "We're expanding\nour fit range ♡",
            fontSize = 32.sp,
            fontWeight = Bold,
            fontFamily = Monospace
        )
        Spacer(modifier = Modifier.height(10.dp) )
        Text(
            text = "You're just outside our current range, but we’d love to fit you in soon."
        )
    }
}

@Composable
fun FalloutMailBox() {

    var email by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .padding(vertical = 75.dp, horizontal = 50.dp)
            .background(Color(0xFFF9F6EE))
            .padding(16.dp),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    )
        {
        Text(
            text = "Join the waiting list and be the first to know when we’ve got your size."
        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            placeholder = { Text(text = "Your email", fontSize = 14.sp) },
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )


        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
                .padding(top = 10.dp),
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = OrangeMain,
                contentColor = Color.White
            )
        ) {
            Text("Join waiting list")
        }
    }
}


@Composable
fun MeantineText() {

    Column(modifier = Modifier.padding(horizontal = 50.dp)) {
        Text("In the meantine...")

        Spacer(modifier = Modifier.height(10.dp))

        Row() {


            Icon(
                painter = painterResource(R.drawable.measuringtape),
                contentDescription = "measuringtape",
                Modifier.size(40.dp)
            )

            Text(
                text = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(fontWeight = FontWeight.SemiBold)
                ){

                    append(" Book an online fitting")}

                append("\n We´ll help you find the best option.")

            })
        }

        Spacer(modifier = Modifier.height(10.dp))

        Row() {

            Icon(
                painter = painterResource(R.drawable.bra),
                contentDescription = "measuringtape",
                Modifier.size(40.dp)
            )

            Text(
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(fontWeight = FontWeight.SemiBold)
                    ){

                    append(" Follow our journey")}

                    append("\n See how we're growing our range.")

                }


            )

        }
    }
}



    @Composable
    fun FalloutPageBody(){
        Column(modifier = Modifier.fillMaxSize()) {
            FalloutTopbar()
            FalloutText()
            FalloutMailBox()
            MeantineText()
        }
    }

@Preview(showBackground = true)
@Composable
fun FalloutPreview() {
    FalloutPageBody()
}


