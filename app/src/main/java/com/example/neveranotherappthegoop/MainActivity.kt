package com.example.neveranotherappthegoop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.neveranotherappthegoop.ui.theme.screens.LandingPageBody
import com.example.neveranotherappthegoop.ui.theme.screens.ExpectationsPageBody
import com.example.neveranotherappthegoop.ui.theme.screens.StepFourPage
import com.example.neveranotherappthegoop.ui.theme.screens.StepOnePage
import com.example.neveranotherappthegoop.ui.theme.screens.StepThreePage
import com.example.neveranotherappthegoop.ui.theme.screens.StepTwoPage
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.compose.material3.Text
import com.example.neveranotherappthegoop.navigation.AppNavigation
import com.example.neveranotherappthegoop.ui.theme.screens.InfoPageBody
import com.example.neveranotherappthegoop.ui.theme.screens.ErrorRecovery
import com.example.neveranotherappthegoop.ui.theme.screens.FalloutPageBody
import com.example.neveranotherappthegoop.ui.theme.screens.OrderConfirmationScreen
import com.example.neveranotherappthegoop.ui.theme.screens.ResultsPageBody
import com.example.neveranotherappthegoop.ui.theme.screens.VideoFourPage
import com.example.neveranotherappthegoop.ui.theme.screens.VideoThreePage
import com.example.neveranotherappthegoop.ui.theme.screens.VideoTwoPage
import com.example.neveranotherappthegoop.ui.theme.screens.YouAreDoingGreatPage


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            AppNavigation()
        }
    }
}
