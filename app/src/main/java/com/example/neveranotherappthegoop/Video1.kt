package com.example.neveranotherappthegoop

import android.media.browse.MediaBrowser
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
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


@Composable
fun VideoPage1 () {


    TopbarVideo1()


}






@Composable

fun TopbarVideo1 () {

    Row(
        horizontalArrangement = Arrangement.spacedBy(40.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically,
    ) {

        NALogoName()
        /*BackArrow()*/

    }

}



@Composable
fun Video1() {

    val context = LocalContext.current

    AndroidView(
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp),

        factory = {

            PlayerView(context).apply {

                player = ExoPlayer.Builder(context).build().also { exoPlayer ->

                    val mediaItem = MediaItem.fromUri(
                        "android.resource://${context.packageName}/${R.raw.video1}"
                    )

                    exoPlayer.setMediaItem(mediaItem)
                    exoPlayer.prepare()
                    exoPlayer.playWhenReady = true
                }
            }
        }
    )
}

