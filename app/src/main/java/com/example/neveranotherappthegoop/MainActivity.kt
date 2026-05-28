package com.example.neveranotherappthegoop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.neveranotherappthegoop.navigation.AppNavigation
import com.example.neveranotherappthegoop.ui.theme.NeverAnotherAppTheGoopTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NeverAnotherAppTheGoopTheme{
                AppNavigation()
            }

        }
    }
}
