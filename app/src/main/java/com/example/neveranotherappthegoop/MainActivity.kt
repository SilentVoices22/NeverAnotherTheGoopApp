package com.example.neveranotherappthegoop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.neveranotherappthegoop.ui.theme.Screens.LandingPageBody
import com.example.neveranotherappthegoop.ui.theme.Screens.Topbar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExpectationsPageBody()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreviewer() {
    Topbar()
}

