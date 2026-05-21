package com.example.neveranotherappthegoop.data

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.neveranotherappthegoop.R


    @Composable
    fun NALogoName(){
        Image(
            painter = painterResource(id = R.drawable.na_logo_black700),
            contentDescription = "Never Another Logo",
            modifier = Modifier.size(145.dp)
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
fun IcShoppingCart(){
    Image(
        painter = painterResource(id = R.drawable.shopping_bag_24px),
        contentDescription = "Shopping Cart",
        modifier = Modifier.size(24.dp)
    )
}

@Composable
fun BackArrow(){
    Image(

        painter = painterResource(id = R.drawable.arrow_back_24px),
        contentDescription = "Arrow Back",
        modifier = Modifier.size(24.dp)

    )


}

@Composable
fun OrangeLine (){
    Image(  painter = painterResource(id = R.drawable.v2),
        contentDescription = "Orange Line",
        modifier = Modifier.size(24.dp)
    )
}

@Composable
fun Brather (){
    Image( painter = painterResource(id = R.drawable.brather),
        contentDescription = "Bra Icon",
        modifier = Modifier.size(12.dp)
    )
}