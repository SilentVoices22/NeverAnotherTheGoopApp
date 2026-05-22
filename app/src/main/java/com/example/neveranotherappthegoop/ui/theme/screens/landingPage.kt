package com.example.neveranotherappthegoop.ui.theme.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.neveranotherappthegoop.data.IcMenu
import com.example.neveranotherappthegoop.data.IcShoppingCart
import com.example.neveranotherappthegoop.data.NALogoName
import com.example.neveranotherappthegoop.data.NaAbout1
import com.example.neveranotherappthegoop.data.NaButton
import com.example.neveranotherappthegoop.data.PoseAnklePic
import com.example.neveranotherappthegoop.data.ThreeStepList
import com.example.neveranotherappthegoop.ui.theme.CharcoalGrey

@Composable
fun Topbar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp, vertical = 20.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        IcMenu()
        NALogoName()
        IcShoppingCart()
    }
}

@Preview(showBackground = true)
@Composable
fun LandingPageBodyPreview() {
    LandingPageBody()

}


@Composable
fun LandingPageText() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 24.dp, top = 24.dp, end = 24.dp)
    ) {
        Column(modifier = Modifier.padding(end = 40.dp)) {
            Text(
                text = "A Bra that's tailored for you.",
                fontSize = 37.sp,
                fontWeight = FontWeight.Medium,
                style = MaterialTheme.typography.titleLarge.copy(),
                lineHeight = 40.sp,
                color = CharcoalGrey,
                modifier = Modifier.padding(bottom = 12.dp)
            )
            Text(
                text = "Finally. Comfort that fits your body and your life",
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                style = MaterialTheme.typography.bodyMedium,
                color = CharcoalGrey,
            )
        }
    }
}

@Composable
fun LandingPagePicture() {
    Row(modifier = Modifier.fillMaxWidth()) {
        NaAbout1(
            modifier = Modifier
                .weight(1f)
                .height(250.dp)
        )
        PoseAnklePic(
            modifier = Modifier
                .weight(1f)
                .height(250.dp)
        )
    }
}

@Composable
fun LandingPageBody() {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(top = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Topbar()
        LandingPageText()
        LandingPagePicture()
        Column(verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()) {
            ThreeStepList(modifier = Modifier
                .height(80.dp)
                .padding(top = 5.dp))
        }
        Text(
            text = "The NEVER ANOTHER wire free bra is tailored to perfectly fit you. Using your measurements, our algorithm automatically customizes the bra to fit your body. ",
            fontSize = 13.sp,
            fontWeight = FontWeight.Normal,
            style = MaterialTheme.typography.bodyMedium,
            color = CharcoalGrey,
            modifier = Modifier.padding(start = 24.dp, end = 24.dp, bottom = 40.dp, top = 40.dp),
            textAlign = TextAlign.Center,
            )
        NaButton("Create my bra")
    }
}

