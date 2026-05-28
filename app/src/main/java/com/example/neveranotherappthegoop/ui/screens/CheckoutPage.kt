package com.example.neveranotherappthegoop.ui.screens
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.neveranotherappthegoop.R
import com.example.neveranotherappthegoop.data.components.BackArrow
import com.example.neveranotherappthegoop.data.components.IcShoppingCart
import com.example.neveranotherappthegoop.data.components.NALogoName
import com.example.neveranotherappthegoop.ui.theme.BoneWhite
import com.example.neveranotherappthegoop.ui.theme.CharcoalGrey
import com.example.neveranotherappthegoop.ui.theme.Orangevibrant


@Composable
fun CheckoutPage(
    onBackClick: () -> Unit,
    onPlaceOrderBClick: () -> Unit,
    onJoinLinkTextClick: () -> Unit,
    quantity: Int,
    selectedColor: String,
    onIncrease: () -> Unit,
    onDecrease: () -> Unit,
    onColorSelect: (String) -> Unit,
    totalPrice: Int
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 15.dp)
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TopRow(onBackClick = onBackClick)

        BraBox(
            selectedColor = selectedColor,
            onColorSelect = onColorSelect,
            onDecrease = onDecrease,
            onIncrease = onIncrease,
            quantity = quantity
        )
        Spacer(Modifier.height(32.dp))
        JoinLinkText(onClick = onJoinLinkTextClick)
        TotalPrice(totalPrice = totalPrice)
        Spacer(Modifier.height(16.dp))
        PlaceOrderB(onClick = onPlaceOrderBClick)
        Spacer(modifier = Modifier.height(20.dp))
        BottomDetailss()
    }
}

@Composable
fun TopRow(
    onBackClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
    ) {
        BackArrow(
            onClick = onBackClick,
            modifier = Modifier
                .align(Alignment.CenterStart)
                .padding(start = 10.dp)
        )
        NALogoName(
            modifier = Modifier.align(Alignment.Center)
        )
        IcShoppingCart(
            modifier = Modifier
                .align(Alignment.CenterEnd)
                .padding(end = 20.dp)
        )
    }
}

@Composable
fun BraBox(
    selectedColor: String,
    quantity: Int,
    onColorSelect: (String) -> Unit,
    onDecrease: () -> Unit,
    onIncrease: () -> Unit
) {
    Column(
        modifier = Modifier
            .padding(horizontal = 38.dp)
            .background(Color.White)
            .border(
                3.dp,
                color = Color(0xFFF9F6EE),
                RoundedCornerShape(10.dp)
            )
            .padding(16.dp)
            .height(500.dp)
            .width(335.dp),
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            BraText()
        }
        BraBoxPics()

        Spacer(Modifier.height(16.dp))

        ColorChoose(
            selectedColor = selectedColor,
            onColorSelect = onColorSelect
        )

        Spacer(Modifier.height(32.dp))
        Quantity(
            quantity = quantity,
            onDecrease = onDecrease,
            onIncrease = onIncrease
        )
    }
}

@Composable
fun BraText() {
    Column(modifier = Modifier) {
        Text(
            "Your custom-fit bra",
            lineHeight = 35.sp
        )
        Text(
            "Seamless. Made for your shape.",
            lineHeight = 35.sp
        )

        Text(
                "Size: Your personal fit",
                lineHeight = 35.sp
        )

        Spacer(Modifier.height(50.dp))
        Text(
            "1.Choose your color",
            lineHeight = 35.sp
        )
    }
}


@Composable
fun BraBoxPics() {
    Row(
        modifier = Modifier
            .background(Color.White)
            .fillMaxWidth()
            .padding(horizontal = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.naprodw6),
            contentDescription = "Bra product white",
            modifier = Modifier.size(150.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.approdb1),
            contentDescription = "Bra product black",
            modifier = Modifier.size(150.dp)
        )
    }
}


@Composable
fun ColorDots(
    color: Color,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    val borderColor = if (isSelected) Orangevibrant else BoneWhite

    Box(
        modifier = Modifier
            .size(24.dp)
            .clip(CircleShape)
            .background(color)
            .border(2.dp, borderColor, CircleShape)
            .clickable { onClick() }
    )
}


@Composable
fun ColorChoose(
    selectedColor: String,
    onColorSelect: (String) -> Unit,
) {
    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
        ColorDots(
            color = Color.White,
            isSelected = selectedColor == "White",
            onClick = { onColorSelect("White") }
        )
        ColorDots(
            color = Color.Black,
            isSelected = selectedColor == "Black",
            onClick = { onColorSelect("Black") }
        )
    }
}


@Composable
fun Quantity(
    quantity: Int,
    onDecrease: () -> Unit,
    onIncrease: () -> Unit
) {
    Text(
        "2. Quantity",
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp,
        color = CharcoalGrey
    )

    Spacer(Modifier.height(8.dp))

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        OutlinedButton(
            onClick = onDecrease,
            modifier = Modifier.size(36.dp),
            contentPadding = PaddingValues(0.dp),
            shape = RoundedCornerShape(8.dp)
        ) {
            Text("-", fontSize = 18.sp)
        }

        Text(
            quantity.toString(),
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            color = CharcoalGrey
        )

        OutlinedButton(
            onClick = onIncrease,
            modifier = Modifier.size(36.dp),
            contentPadding = PaddingValues(0.dp),
            shape = RoundedCornerShape(8.dp)
        ) {
            Text("+", fontSize = 18.sp)
        }
    }
}

@Composable
fun JoinLinkText(
    onClick: () -> Unit
) {
    Text(
        text = "Production, shipping, and size guarantee",
        color = Orangevibrant,
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .padding(bottom = 20.dp)
            .clickable { onClick() }
    )
}

@Composable
fun TotalPrice(totalPrice: Int) {
    Row(
        modifier = Modifier
            .width(335.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){ Text("Total")
        Text("  ${totalPrice} kr.")
}
}

@Composable
fun PlaceOrderB(
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 45.dp)
            .height(50.dp),
        shape = RoundedCornerShape(10.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Orangevibrant)
    ) {
        Text("Place order", color = Color.White, fontSize = 20.sp)
    }
}

@Composable
fun BottomDetailss() {
    Image(
        painter = painterResource(id = R.drawable.guaranteebottomtext2),
        contentDescription = null,
        modifier = Modifier
            .size(350.dp)
            .padding(bottom = 15.dp),
        contentScale = ContentScale.FillWidth
    )
}

@Preview(showBackground = true)
@Composable
fun CheckoutPagePreview() {
    CheckoutPage(
        onBackClick = {},
        onPlaceOrderBClick = {},
        onJoinLinkTextClick = {},
        quantity = 1,
        selectedColor = "White",
        onIncrease = {},
        onDecrease = {},
        onColorSelect = {},
        totalPrice = 799
    )
}
