package com.example.neveranotherappthegoop.data

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.neveranotherappthegoop.R

// Icons Kevin 26/05/18

@Composable
fun IcTapeMeasure(){
    Image(
        painter = painterResource(id = R.drawable.tapemeassure),
        contentDescription = "Never Another Logo",
        modifier = Modifier.size(120.dp)
    )
}
@Composable
fun IcOrangeLine(){
    Image(
        painter = painterResource(id = R.drawable.orangestreg),
        contentDescription = "Never Another Logo",
        modifier = Modifier.size(145.dp)
    )
}
@Composable
fun IcHeart(modifier: Modifier = Modifier, color: Color){
    Image(
        painter = painterResource(id = R.drawable.hearticon),
        contentDescription = "Never Another Logo",
        modifier = Modifier,
        colorFilter = ColorFilter.tint(color, blendMode = BlendMode.SrcIn)
    )
}

@Composable
fun IcBra(){
    Image(
        painter = painterResource(id = R.drawable.brahuman),
        contentDescription = "Never Another Logo",
        modifier = Modifier.size(145.dp)
    )
}

    @Composable
    fun NALogoName(modifier: Modifier = Modifier){
        Image(
            painter = painterResource(id = R.drawable.na_logo_black700),
            contentDescription = "Never Another Logo",
            modifier = modifier
                .width(145.dp)
                .height(40.dp)
        )
    }

@Composable
    fun IcMenu(){
        Image(
            painter = painterResource(id = R.drawable.ic_menu),
            contentDescription = "Menu",
            modifier = Modifier.size(24.dp)
        )
    }

@Composable
fun IcShoppingCart(modifier: Modifier = Modifier){
    Image(
        painter = painterResource(id = R.drawable.shopping_bag_24px),
        contentDescription = "Shopping Cart",
        modifier = modifier.size(24.dp)
    )
}

// Pictures
@Composable
fun NaAbout1(modifier: Modifier = Modifier){
 Image(
     painter = painterResource(id = R.drawable.naabout1web),
     contentDescription = "Never Another Group picture",
     modifier = modifier,
     contentScale = ContentScale.Crop
 )
}

@Composable
fun PoseAnklePic(modifier: Modifier = Modifier){
    Image(
        painter = painterResource(id = R.drawable.prodw1),
        contentDescription = "Never Another ankle picture",
        modifier = modifier,
        contentScale = ContentScale.Crop
    )
}

@Composable
fun ThreeStepList(modifier: Modifier = Modifier){
    Image(
        painter = painterResource(id = R.drawable.bulletlist),
        contentDescription = "Never Another ankle picture",
        modifier = modifier,
        contentScale = ContentScale.Crop

    )
}
