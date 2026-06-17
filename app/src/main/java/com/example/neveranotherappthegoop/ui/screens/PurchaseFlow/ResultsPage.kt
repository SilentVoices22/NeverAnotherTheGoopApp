package com.example.neveranotherappthegoop.ui.screens.PurchaseFlow
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.neveranotherappthegoop.R
import com.example.neveranotherappthegoop.data.components.IcMenu
import com.example.neveranotherappthegoop.data.components.IcShoppingCart
import com.example.neveranotherappthegoop.data.components.NALogoName

/*---------------------------------------------------------Sofia-------------------------------------------------------------- */

@Composable
fun ResultsPageBody(
    onViewButtonClick: () -> Unit,
    onRetakeButtonClick: () -> Unit,
    changedUpperCircumference: String,
    changedLowerCircumference: String,
    changedBreastSpan: String,
   changedBreastHeight: String
) {
    // page layout
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(top = 30.dp, start = 30.dp, end = 30.dp)
    ) {

        // top bar by kevin
        ResultsTopBar()

        Spacer(modifier = Modifier.height(10.dp))

        // "Here are your results" + tekst
        ResultsHeader()

        // bra image + measurements
        MeasurementCard(
            upperCircumferenceMeasurement = changedUpperCircumference,
            lowerCircumferenceMeasurement = changedLowerCircumference,
            breastSpanMeasurement = changedBreastSpan,
            breastHeightMeasurement = changedBreastHeight
        )

        // "Why this fit is made for you" points
        ListOfBenefits()

        // orange knap
        ViewButton(onClick = onViewButtonClick)

        // space mellem knapperne
        Spacer(modifier = Modifier.height(16.dp))

        // hvid knap
        RetakeButton(onClick = onRetakeButtonClick)

        // space mellem knap og bottom details
        Spacer(modifier = Modifier.height(20.dp))

        // "Made for you - Made-to-order - Free size guarantee"
        BottomDetails()

    }
}


@Composable
fun ResultsTopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        IcMenu()
        NALogoName()
        IcShoppingCart()
    }
}


@Composable
fun ResultsHeader() {

    // "Here are your results" (screenshot pga håndtegnet streg)
    Image(
        painter = painterResource(id = R.drawable.resultsheader),
        contentDescription = null,
        modifier = Modifier.fillMaxWidth(),
        alignment = Alignment.TopStart
    )

    Spacer(modifier = Modifier.height(12.dp))

    Text(
        text = "Based on your measurements, we have \na bra design that matches your body.",
        fontSize = 14.sp,
        fontWeight = FontWeight.Medium,
        color = Color(0xFF393838),
        lineHeight = 20.sp
    )

    Spacer(modifier = Modifier.height(16.dp))
}


@Composable
fun MeasurementCard(
    upperCircumferenceMeasurement: String,
    lowerCircumferenceMeasurement: String,
    breastSpanMeasurement: String,
    breastHeightMeasurement: String
) {

    Column {

        // bra image
        Image(
            painter = painterResource(id = R.drawable.resultsbra),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )

        // connected border / measurement card
        Box(
            modifier = Modifier
                .fillMaxWidth()

                // lys ramme omkring measurements
                .border(
                    width = 1.5.dp,
                    color = Color(0xFFF9F6EE),

                    // only bottom corners rounded
                    shape = RoundedCornerShape(
                        bottomStart = 10.dp,
                        bottomEnd = 10.dp
                    )
                )
        ) {

            Column(
                modifier = Modifier.padding(20.dp)
            ) {

                // "Your personal fit"
                Text(
                    text = "Your personal fit",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF393838),
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )

                Spacer(modifier = Modifier.height(20.dp))

                // measurement values
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween // lige fordeling mellem rækkens elementer
                ) {
                    MeasurementItem("Upper", upperCircumferenceMeasurement.ifEmpty { "-" } + " cm")
                    MeasurementItem("Lower", lowerCircumferenceMeasurement.ifEmpty { "-" } + " cm")
                    MeasurementItem("Span",  breastSpanMeasurement.ifEmpty { "-" } + " cm")
                    MeasurementItem("Height",breastHeightMeasurement.ifEmpty { "-" } + " cm")
                }
            }
        }
    }
}


@Composable
fun MeasurementItem(
    label: String,
    value: String
) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        // måltype
        Text(
            text = label,
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
            color = Color(0xFF393838),
        )

        Spacer(modifier = Modifier.height(4.dp))

        // målværdi
        Text(
            text = value,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF393838),
        )
    }
}


@Composable
fun ListOfBenefits() {

    Column(
        modifier = Modifier.padding(30.dp))
    {
        Text(
            text = "Why this fit is made for you",
            fontSize = 14.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color(0xFFFF5F00),
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text("✓   Designed for your natural shape",
            fontSize = 14.sp,
            color = Color(0xFF393838),)

        Spacer(modifier = Modifier.height(20.dp))

        Text("✓   Provides support without wires",
            fontSize = 14.sp,
            color = Color(0xFF393838),)

        Spacer(modifier = Modifier.height(20.dp))

        Text("✓   Seamless for maximum comfort",
            fontSize = 14.sp,
            color = Color(0xFF393838),)

        Spacer(modifier = Modifier.height(10.dp))
    }
}


@Composable
fun ViewButton(
    onClick: () -> Unit
) {
        // View product button
        Button(
            onClick = onClick,
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFFFF5F00)),
            shape = RoundedCornerShape(10.dp)
        ) {
            Text("View product",
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal)
        }
}


@Composable
fun RetakeButton(
    onClick: () -> Unit
) {

    // Retake measurements button
    OutlinedButton(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        border = BorderStroke(1.dp, Color(0xFFFF5F00)),
        shape = RoundedCornerShape(10.dp)
    ) {
        Text("Retake measurements",
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
            color = Color(0xFFFF5F00))
    }
}


@Composable
fun BottomDetails() {
    // "Made for you - Made-to-order - Free size guarantee"
    Image(
        painter = painterResource(id = R.drawable.guaranteebottomtext),
        contentDescription = null,
        modifier = Modifier.fillMaxWidth(),
        contentScale = ContentScale.FillWidth
    )
}


@Preview(showBackground = true)
@Composable
fun ResultsPagePreview() {
    ResultsPageBody(
        onViewButtonClick = {},
        onRetakeButtonClick = {},
        changedUpperCircumference = "85",
        changedLowerCircumference = "72",
        changedBreastSpan = "14",
        changedBreastHeight = "18"
    )
}
