package com.example.neveranotherappthegoop

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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.neveranotherappthegoop.ui.theme.Beige
import com.example.neveranotherappthegoop.ui.theme.InterFont


/*------------------------------------Screen---------------------------------- */

@Composable

fun OrderConfirmationScreen () {

    Box(

        modifier = Modifier.fillMaxSize()

    ) {

        LogoButton()

        BurgerMenu()

        IconAndText()

        OrderInfo()

        DeliveryInfo()

        StatusBar()

        InfoBox()

    }
}







/*------------------------------Interactive-Logo------------------------------ */



@Composable

fun LogoButton () {

    Box(

        modifier = Modifier.fillMaxSize(),

    ) {

        Image(

            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo",

            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 50.dp)
                .width(250.dp)
                .height(60.dp)
                .clickable{

                    println("Go to landing-page")

                }

        )

    }

}








/*----------------------------BurgerMenu-Icon-------------------------------- */


@Composable

fun BurgerMenu () {

    Box(

        modifier = Modifier.fillMaxSize()

    ) {

        Image(

            painter = painterResource(id = R.drawable.menu),
            contentDescription = "Menu Logo",

            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(top = 59.dp)
                .width(100.dp)
                .height(40.dp)

        )
    }
}








/*------------------------------Top information----------------------------- */


@Composable

fun IconAndText () {


    Box(

        modifier = Modifier.fillMaxSize()

    ) {

        Image(

            painter = painterResource(id = R.drawable.hearticon),
            contentDescription = "Heart-icon",

            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 135.dp)
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
            fontFamily = InterFont,

            textAlign = TextAlign.Center,
            fontSize = 30.sp,

            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 210.dp)
                .width(250.dp)

        )
    }

    Box(

        modifier = Modifier.fillMaxSize()

    ) {


        Text(
            text = "We’re excited to create your perfect fit.",
            fontFamily = InterFont,

            textAlign = TextAlign.Center,
            fontSize = 14.sp,

            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 290.dp)
                .width(250.dp)

        )


    }
}







/*------------------------------Order information---------------------------- */


@Composable

fun OrderInfo () {


    /* Boxen er en "usynlig" container som fylder hele
    skærmen og gør det muligt at centrerer alt indhold */
    Box(

        modifier = Modifier.fillMaxSize()

    ) {

        /* Det card som indeholder alle informationer
        Her er den også designet med farve, højerner osv*/
        Card(
            modifier = Modifier
                .padding(bottom = 50.dp)

                /* sætter cardet i midten af skærmen */
                .align(Alignment.Center)

                /* Bestemmer bredden på cardet */
                .width(330.dp),

            /* Afrunder hjørnerne */
            shape = RoundedCornerShape(12.dp),

            /* hvid baggrund */
            colors = CardDefaults.cardColors(containerColor = Color.White,),

            /* Farver kanten på boksen */
            border = BorderStroke(1.dp, Color(0xFFEFEAE3))

        ) {

            /* Column placerer teksten under hinanden */
            Column() {

                Text(

                    text = "Your order is confirmed  ✓",
                    fontFamily = InterFont,

                    modifier = Modifier
                        .fillMaxWidth()

                        /* Giver afstand fra toppen */
                        .padding(top = 20.dp),

                        /* Centrerer teksten i boksen */
                        textAlign = TextAlign.Center

                )


                Text(

                    text = "You’ll receive a confirmation email shortly.",

                    modifier = Modifier
                        .fillMaxWidth()

                        /* Giver afstand fra både top og bund,
                        for at placerer teksten korrekt*/
                        .padding(top = 10.dp, bottom = 20.dp),

                        /* Centrerer teksten */
                        textAlign = TextAlign.Center,
                        fontFamily = InterFont,

                )


                /* En divider som laver en vandret linje i cardet */
                HorizontalDivider(color = Color(0xFFEFEAE3))




                /* Placerer elementerne vandret (ved siden af hinanden) */
                Row(

                    modifier = Modifier
                        .fillMaxWidth()

                        /* Giver afstand fra både top og bund,
                        for at placerer teksten korrekt*/
                        .padding(top = 20.dp, bottom = 20.dp),

                        verticalAlignment = Alignment.CenterVertically

                ) {


                    /* Billedet */
                    Image(

                        painter = painterResource(id = R.drawable.bra),
                        contentDescription = "Bra",

                        modifier = Modifier
                            /* Styrer billedets bredde */
                            .width(130.dp)

                            /*Styrer billedets højde*/
                            .height(80.dp)


                    )

                    /* Placerer elementerne lodret */
                    Column(

                        modifier = Modifier
                            .fillMaxWidth()

                            /* Får teksten til at rykke op til toppen af billedet */
                            .padding(bottom = 2.dp),


                    ) {

                        Text("Your custom-fit bra \n")

                        Text("Color: White \n")


                        /* Placerer quantity og pris vandret */
                        Row(

                            modifier = Modifier
                                .fillMaxWidth()

                                /* Giver afstand fra cardets ende
                                (rykker prisen indad) */
                                .padding(end = 14.dp),

                            /* Skuber teksten væk fra hinanden */
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

fun DeliveryInfo () {

    Box(

        modifier = Modifier.fillMaxSize()

    ) {

        Text(

            text = "Track your custom bra",
            fontFamily = InterFont,
            fontSize = 20.sp,

            modifier = Modifier
                .padding(bottom = 335.dp)
                .align(Alignment.BottomCenter)

        )

        Text(

            text = "Please be aware that delivery may take up to 6 weeks",
            fontFamily = InterFont,
            fontSize = 14.sp,

            modifier = Modifier
                .padding(bottom = 310.dp)
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
            .padding(start = 21.dp, bottom = 80.dp),

        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.Bottom
    ) {

        Image(
            painter = painterResource(id = R.drawable.statusbar),
            contentDescription = "Status-bar",

            modifier = Modifier.width(90.dp).height(222.dp)

        )

        Column(

        ) {
            Text (
                text = "We’re preparing your order",
                fontFamily = InterFont,
                fontSize = 14.sp
            )

            Spacer(modifier = Modifier.height(42.dp))

            Text (
                text = "We’re crafting your bra",
                fontFamily = InterFont,
                fontSize = 14.sp,
            )

            Spacer(modifier = Modifier.height(44.dp))

            Text (
                text = "Your bra is being prepared for shipping",
                fontFamily = InterFont,
                fontSize = 14.sp,
            )

            Spacer(modifier = Modifier.height(44.dp))

            Text (
                text = "Your bra is now being delivered!",
                fontFamily = InterFont,
                fontSize = 14.sp,
                modifier = Modifier.padding(bottom = 12.dp)
            )

        }
    }
}








/*---------------------------------Questions----------------------------------- */


@Composable

fun InfoBox () {

    Box(

        modifier = Modifier.fillMaxSize()

    ) {

        Box(

            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 12.dp)
                .width(340.dp)
                .height(60.dp)
                .background(
                    color = Beige,

                    shape = RoundedCornerShape(12.dp)),

            contentAlignment = Alignment.Center


        ) {

            Text(

                text = "Questions?",
                fontFamily = InterFont,

                modifier = Modifier,
                color = Color.Black,
                fontSize = 20.sp

                )

        }
    }
}





















