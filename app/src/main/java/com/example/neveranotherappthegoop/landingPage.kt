package com.example.neveranotherappthegoop

import androidx.compose.foundation.Image
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
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.neveranotherappthegoop.data.IcMenu
import com.example.neveranotherappthegoop.data.IcShoppingCart
import com.example.neveranotherappthegoop.data.NALogoName
import org.w3c.dom.Text

@Composable
fun Topbar(){
    Row(modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween){
        IcMenu()
        NALogoName()
        IcShoppingCart()
    }
}

@Preview(showBackground = true)
@Composable
fun LandingPageBodyPreview(){
   LandingPageBody()
}


@Composable
fun LandingPageText(){
 Column(modifier = Modifier.fillMaxWidth().padding( start = 24.dp, top = 24.dp, end = 24.dp)) {
     Box(modifier = Modifier.wrapContentSize()) {
         Text(text = "A Bra that's made for you.",
             fontSize = 42.sp,
             fontWeight = FontWeight.Bold,
             fontFamily = FontFamily.Monospace)
         Spacer(modifier = Modifier.height(12.dp))
         Text(text = "Finally. Comfort that fits your body and your life")
     }

 }
}
<!--- Kevin --->
@Composable
fun LandingPageBody(){
    Column(modifier = Modifier.fillMaxSize()) {
        Topbar()
        Spacer(modifier = Modifier.height(10.dp))
        LandingPageText()

    }
}