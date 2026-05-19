package com.example.neveranotherappthegoop


import androidx.compose.foundation.Image
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


// ====================
// SOFIA
// ====================

@Composable
fun ResultsPageBody() {

    // page layout
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(36.dp)
    ) {

        // "Here are your results" + underoverskrift
        ResultsHeader()

        // bra image + measurements
        MeasurementCard()

    }
}


@Composable
fun ResultsHeader() {

    Text(
        text = "Here are your \nresults",
        fontSize = 32.sp,
        fontWeight = FontWeight.Medium,
        color = Color(0xFF393838)
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
fun MeasurementCard() {

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
                    color = Color(0xFFE7E3DA),

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
                    MeasurementItem("Upper", "X cm")
                    MeasurementItem("Lower", "X cm")
                    MeasurementItem("Span", "X cm")
                    MeasurementItem("Height", "X cm")
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


@Preview(showBackground = true)
@Composable
fun ResultsPreview() {
    ResultsPageBody()
}