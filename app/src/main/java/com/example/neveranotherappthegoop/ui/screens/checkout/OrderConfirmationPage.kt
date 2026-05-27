package com.example.neveranotherappthegoop.ui.screens.checkout

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.neveranotherappthegoop.R
import com.example.neveranotherappthegoop.ui.theme.BoneWhite
import com.example.neveranotherappthegoop.ui.theme.Orangevibrant


/*------------------------------------Screen---------------------------------- */

@Preview(showBackground = true)
@Composable
fun OOCPreview() {
    OrderConfirmationScreen(
        onLogoButtonClick = {}
    )
}

@Composable
fun OrderConfirmationScreen(
    onLogoButtonClick: () -> Unit
) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        LogoButton(onClick = onLogoButtonClick)
        BurgerMenu()
        IconAndText()
        OrderInfo()
        DeliveryInfo()
        StatusBar()
        InfoBox()
        BottomInfoBar()
    }
}


/*------------------------------Interactive-Logo------------------------------ */

@Composable
fun LogoButton(
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo",
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 40.dp)
                .width(250.dp)
                .height(60.dp)
                .clickable {
                    onClick()
                }
        )
    }
}


/*----------------------------BurgerMenu-Icon-------------------------------- */


@Composable
fun BurgerMenu() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.menu),
            contentDescription = "Menu Logo",
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(top = 49.dp)
                .width(100.dp)
                .height(40.dp)
        )
    }
}


/*------------------------------Top information----------------------------- */


@Composable
fun IconAndText() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.hearticon),
            contentDescription = "Heart-icon",
            colorFilter = ColorFilter.tint(Orangevibrant, blendMode = BlendMode.SrcIn),
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 110.dp)
                .width(250.dp)
                .height(50.dp)
        )
    }
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Thank you \n" +
                    "for your order!",
            textAlign = TextAlign.Center,
            fontSize = 30.sp,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 165.dp)
                .width(250.dp)
        )
    }
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "We’re excited to create your perfect fit.",
            textAlign = TextAlign.Center,
            fontSize = 14.sp,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 240.dp)
                .width(250.dp)
        )
    }
}


/*------------------------------Order information---------------------------- */


@Composable
fun OrderInfo() {
    /* Boxen er en "usynlig" container som fylder hele
    skærmen og gør det muligt at centrerer alt indhold */
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        /* Det card som indeholder alle informationer
        Her er den også designet med farve, højerner osv*/
        Card(
            modifier = Modifier
                .padding(bottom = 120.dp)
                .align(Alignment.Center)
                .width(330.dp),
            shape = RoundedCornerShape(12.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            border = BorderStroke(1.dp, Color(0xFFEFEAE3))
        ) {
            Column() {
                Text(
                    text = "Your order is confirmed  ✓",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 20.dp),
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "You’ll receive a confirmation email shortly.",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp, bottom = 20.dp),
                    textAlign = TextAlign.Center,
                )
                /* En divider som laver en vandret linje i cardet */
                HorizontalDivider(color = Color(0xFFEFEAE3))
                /* Placerer elementerne vandret (ved siden af hinanden) */
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 20.dp, bottom = 20.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    /* Billede af BH */
                    Image(
                        painter = painterResource(id = R.drawable.brahuman),
                        contentDescription = "Bra",
                        modifier = Modifier
                            .width(130.dp)
                            .height(80.dp)
                    )
                    /* Placerer elementerne lodret */
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 2.dp),
                    ) {
                        Text("Your custom-fit bra \n")
                        Text("Color: White \n")
                        /* Placerer quantity og pris vandret */
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(end = 14.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text("Quantity: 1")
                            Text("799 kr.")
                        }
                    }
                }
            }
        }
    }
}


/*------------------------------Delivery Information-------------------------- */

@Composable

fun DeliveryInfo() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Track your custom bra",
            fontSize = 20.sp,
            modifier = Modifier
                .padding(bottom = 360.dp)
                .align(Alignment.BottomCenter)
        )
        Text(
            text = "Please be aware that delivery may take up to 6 weeks",
            fontSize = 14.sp,
            modifier = Modifier
                .padding(bottom = 340.dp)
                .align(Alignment.BottomCenter)
        )
    }
}


/*----------------------------------Status-bar-------------------------------- */


@Composable

fun StatusBar() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 21.dp, bottom = 108.dp),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.Bottom
    ) {
        Image(
            painter = painterResource(id = R.drawable.statusbar),
            contentDescription = "Status-bar",
            modifier = Modifier
                .width(90.dp)
                .height(222.dp)
        )
        Column(
        ) {
            Text(
                text = "We’re preparing your order",
                fontSize = 14.sp
            )
            Spacer(modifier = Modifier.height(42.dp))
            Text(
                text = "We’re crafting your bra",
                fontSize = 14.sp,
            )
            Spacer(modifier = Modifier.height(44.dp))
            Text(
                text = "Your bra is being prepared for shipping",
                fontSize = 14.sp,
            )
            Spacer(modifier = Modifier.height(44.dp))
            Text(
                text = "Your bra is now being delivered!",
                fontSize = 14.sp,
                modifier = Modifier.padding(bottom = 12.dp)
            )

        }
    }
}


/*---------------------------------Questions----------------------------------- */


@Composable
fun InfoBox() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 40.dp)
                .width(410.dp)
                .height(60.dp)
                .background(
                    color = BoneWhite,
                    shape = RoundedCornerShape(12.dp)
                ),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Questions? \n" +
                        "We’re only an email away.",
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(start = 60.dp, bottom = 15.dp),
                color = Color.Black,
                fontSize = 15.sp
            )
        }
    }
}


@Composable
fun BottomInfoBar() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(R.drawable.guaranteebottomtext3),
            contentDescription = "Bottom information-bar",
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 7.dp)
                .align(Alignment.BottomCenter)
                .width(10.dp)
                .height(22.dp)
        )
    }
}


















