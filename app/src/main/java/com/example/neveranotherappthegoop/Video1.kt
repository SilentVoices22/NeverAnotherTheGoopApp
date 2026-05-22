package com.example.neveranotherappthegoop

import android.media.browse.MediaBrowser
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.ui.PlayerView
import com.example.neveranotherappthegoop.data.NALogoName
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.media3.exoplayer.upstream.Allocation


@Composable
fun VideoOnePage () {
    Column(modifier = Modifier.fillMaxSize().padding(15.dp),
        ) {
        TopbarErrorRecovery()
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Video1()
        }
    }
    }



@Composable
fun Video1(){ // Made using AI Gemini - Kevin 26/05/22
    val context = LocalContext.current

    // 1. Initialize ExoPlayer safely so it doesn't reset on every recomposition
    val exoPlayer = remember {
        ExoPlayer.Builder(context).build().apply {
            val mediaItem = MediaItem.fromUri(
                "android.resource://${context.packageName}/${R.raw.video1}"
            )
            setMediaItem(mediaItem)
            prepare()
            playWhenReady = true
        }
    }

    // 2. Clean up the player from memory when this composable leaves the screen
    DisposableEffect(Unit) {
        onDispose {
            exoPlayer.release()
        }
    }

    // 3. Keep the layout code neat and lightweight
    AndroidView(
        factory = { ctx ->
            PlayerView(ctx).apply {
                player = exoPlayer
            }
        },
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp)
    )
}




