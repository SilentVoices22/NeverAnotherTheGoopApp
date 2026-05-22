package com.example.neveranotherappthegoop.ui.theme.Screens


import android.R.attr.top
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.neveranotherappthegoop.data.BackArrow
import com.example.neveranotherappthegoop.data.NALogoName


// ====================
// SOFIA
// ====================

@Composable
fun InfoPageBody() {

    val scrollState = rememberScrollState()

    // scrollable page layout
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .verticalScroll(scrollState)
    ) {
        TopbarInfoPage() // top bar by kevin
        ProductionInfo()
        ShippingInfo()
        SizeGuarantee()
    }
}


@Composable
fun TopbarInfoPage() {
    Row(
        horizontalArrangement = Arrangement.spacedBy(40.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        BackArrow( onClick = {})
        NALogoName()
    }
}


@Composable
fun ProductionInfo() {

    Text(
        text = "The NEVER ANOTHER bra was designed in Denmark with the help of countless workshop participants, survey respondents and test pilots. Our R&D phase has lasted 2 years and produced more than 50 prototypes, leading us to the right design, textile composition, and functionality.  \n" +
                "\n" +
                "Knitted in a single piece, the bra is manufactured by our skilled production partner in The Netherlands, who has been part of our journey and R&D process from the beginning.  \n" +
                "\n" +
                "Our choice of production partner reflects our commitment to high quality products, decent work and responsible production.",
        fontSize = 14.sp,
        color = Color(0xFF393838),
        lineHeight = 20.sp,
        modifier = Modifier.padding(30.dp)
    )
}


@Composable
fun ShippingInfo() {

    // SHIPPING
    Text(
        text = "\nSHIPPING",
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold,
        color = Color(0xFF393838),
        lineHeight = 20.sp,
        modifier = Modifier.padding(start = 30.dp, end = 30.dp)
    )

    // info
    Text("We ship within Denmark with Bring or GLS. In exceptional cases, we might use other courier services, than the ones stated, if that is the only viable solution.\n" +
                "\n" +
                "Once the order is shipped, the customer will receive an email notification with a tracking number for the package.\n" +
                "\n" +
                "All orders are shipped from within the European Union, which means that no import fees apply for customers with a delivery address in the EU.\n",
        fontSize = 14.sp,
        color = Color(0xFF393838),
        lineHeight = 20.sp,
        modifier = Modifier.padding(top = 10.dp, start = 30.dp, end = 30.dp, bottom = 30.dp)
    )
}


@Composable
fun SizeGuarantee() {

    // FREE SIZE GUARANTEE
    Text(
        text = "\n" +
                "\n" +
                "\n" +
                "\nFREE SIZE GUARANTEE\n",
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold,
        color = Color(0xFF393838),
        lineHeight = 20.sp,
        modifier = Modifier.padding(start = 30.dp, end = 30.dp)
    )

    // info
    Text(
        "Each customer shopping with NEVER ANOTHER is covered by the Free Size Guarantee. The guarantee is offered only once per product style.\n" +
                "\n" +
                "Should the product not fit the body correctly, subject to the judgement of NEVER ANOTHER’s size expert, we shall adjust the measurements and issue a replacement free of charge.\n" +
                "\n" +
                "To be eligible for a replacement, the customer shall contact our customer support within 1 month of receiving the garment, and the company will set up an online or physical fitting meeting with the customer. \n" +
                "\u2028The customer may be asked to measure the received garment and re-take their body measurements and share that information with our support team.\n" +
                "\n" +
                "If the customer wishes to make alterations to the product due to a change in their body dimensions, the customer will not be eligible to use the Free Size Guarantee.\u2028N.B., Many bodies change during the menstrual cycle. If your bra does not fit at the moment, consider whether this may be due to the timing in your cycle.\n" +
                "\n" +
                "In case a customer has already used the guarantee once for a specific style of product, yet wishes to make further adjustments to the size, they are encouraged to contact our customer support for fit/sizing advice. However, any potential subsequent replacements of the same product style are at the sole discretion of the company.",
        fontSize = 14.sp,
        color = Color(0xFF393838),
        lineHeight = 20.sp,
        modifier = Modifier.padding(top = 10.dp, start = 30.dp, end = 30.dp, bottom = 30.dp)
    )
}


@Preview(showBackground = true)
@Composable
fun InfoPreview() {
    InfoPageBody()
}