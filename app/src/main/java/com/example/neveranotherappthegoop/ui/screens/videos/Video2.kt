package com.example.neveranotherappthegoop.ui.screens.videos


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.ui.PlayerView
import androidx.compose.runtime.remember
import com.example.neveranotherappthegoop.R
import com.example.neveranotherappthegoop.data.components.TopbarErrorRecovery

/*---------------------------------------------------------Fælles-kodning-------------------------------------------------------------- */

@Composable
fun VideoTwoPage (
    onBackClick: () -> Unit,
) {
    Column(modifier = Modifier.fillMaxSize().padding(15.dp),
    ) {
        TopbarErrorRecovery(
            onBackClick = onBackClick
        )
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Video2()
        }
    }
}



@Composable
fun Video2(){ // Made using AI Gemini - Kevin 26/05/22
    val context = LocalContext.current

    // 1. Initialize ExoPlayer safely so it doesn't reset on every recomposition
    val exoPlayer = remember {
        ExoPlayer.Builder(context).build().apply {
            val mediaItem = MediaItem.fromUri(
                "android.resource://${context.packageName}/${R.raw.tutorial2someform}"
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
            .height(900.dp)
    )
}




