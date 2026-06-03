package com.example.neveranotherappthegoop.ui.screens.PurchaseFlow

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.neveranotherappthegoop.data.components.NALogoName
import coil.ImageLoader
import coil.compose.AsyncImage
import coil.decode.GifDecoder
import com.example.neveranotherappthegoop.R
import kotlinx.coroutines.delay

/*---------------------------------------------------------Mohsen-------------------------------------------------------------- */

@Composable
fun LoadingScreen(
    onFinishedLoading: () -> Unit

) {

    LaunchedEffect(Unit) {

        delay(3000)

        onFinishedLoading()
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LogoNA()
        Spacer(Modifier.height(40.dp))
        BraGif()
    }
}



@Composable
fun LogoNA() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 10.dp, top = 24.dp, end = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        NALogoName()
    }
}

@Composable
fun BraGif (){
    val context = LocalContext.current
    val gifLoader = ImageLoader.Builder(context)
        .components { add(GifDecoder.Factory()) }
        .build()

    Box(modifier= Modifier
        .fillMaxSize()) {
        Text(
            "Tailoring your bra...",
            fontSize = 32.sp,
            modifier = Modifier
                .padding(top = 100.dp)
                .offset(x = 70.dp, y = 0.dp)
        )
        AsyncImage(
            model       = R.drawable.loadinggif,
            contentDescription = "gif",
            imageLoader = gifLoader,
            modifier    = Modifier.size(500.dp)
        )


    }


}

@Preview(showBackground = true)
@Composable
fun LoadingScreenPreview() {
    LoadingScreen(
        onFinishedLoading = {}
    )
}