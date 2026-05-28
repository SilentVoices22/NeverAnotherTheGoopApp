package com.example.neveranotherappthegoop.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.Bullet
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.neveranotherappthegoop.ui.components.BackArrow
import com.example.neveranotherappthegoop.ui.components.IcHeart
import com.example.neveranotherappthegoop.ui.components.IcTapeMeasure
import com.example.neveranotherappthegoop.ui.components.NALogoName
import com.example.neveranotherappthegoop.ui.components.NaButton
import com.example.neveranotherappthegoop.ui.components.TopbarErrorRecovery
import com.example.neveranotherappthegoop.ui.theme.CharcoalGrey
import com.example.neveranotherappthegoop.ui.theme.Orangevibrant


@Preview(showBackground = true)
@Composable
fun ErrorRecoveryPreview(){
    ErrorRecovery(
        onBackClick = {}
    )
}

@Composable
fun ErrorRecovery(
    onBackClick: () -> Unit
) {
    Column(modifier = Modifier.fillMaxSize().padding(start = 15.dp, end = 15.dp, top = 20.dp)){
        TopbarErrorRecovery(onBackClick = onBackClick)
        Column(modifier = Modifier
            .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "let's double check",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = CharcoalGrey
            )
            Text(text = "This measurement looks a bit unusual compared to the last one.",
                modifier = Modifier.padding(start = 40.dp, top = 10.dp, end = 40.dp))
            IcTapeMeasure()
            BulletpointErrorRecovery()
            NaButton(textButton = "Try Again",
                onClick = {


                })
            HeartOkayQoute()
        }
    }
}




@Composable
fun BulletpointErrorRecovery() {
    val bullet = Bullet.Default.copy(shape = RoundedCornerShape(4.dp))
    Column() {
        Text(text = "Tips that might help",
            fontSize = 35.sp)
        BasicText(
            buildAnnotatedString {
                withBulletList(bullet = bullet) {
                    withBulletListItem { append("Make sure the tape is level") }
                    withBulletListItem { append("Don’t pull it too tight") }
                    withBulletListItem { append("Watch the video for instructions") }
                }
            })
    }
}

@Composable
fun HeartOkayQoute() {
    Row(
        modifier = Modifier
            .fillMaxSize(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        IcHeart(
            modifier = Modifier
                .size(10.dp),
            color = Orangevibrant
        )
        Text(
            text = "It’s totally okay. \n" +
                    "We’ll find the right fit together.",
            fontSize = 13.sp,
            lineHeight = 17.sp,
            modifier = Modifier.weight(1f, fill = false).padding( start = 10.dp)
        )
    }
}