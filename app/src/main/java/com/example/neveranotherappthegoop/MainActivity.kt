package com.example.neveranotherappthegoop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.neveranotherappthegoop.navigation.AppNavigation
import com.example.neveranotherappthegoop.ui.screens.CheckoutPage
import com.example.neveranotherappthegoop.ui.screens.ErrorRecovery
import com.example.neveranotherappthegoop.ui.screens.ExpectationsPageBody
import com.example.neveranotherappthegoop.ui.screens.FalloutPageBody
import com.example.neveranotherappthegoop.ui.screens.InfoPageBody
import com.example.neveranotherappthegoop.ui.screens.LandingPageBody
import com.example.neveranotherappthegoop.ui.screens.LoadingScreen
import com.example.neveranotherappthegoop.ui.screens.OrderConfirmationScreen
import com.example.neveranotherappthegoop.ui.screens.ResultsPageBody
import com.example.neveranotherappthegoop.ui.screens.StepFourPage
import com.example.neveranotherappthegoop.ui.screens.StepOnePage
import com.example.neveranotherappthegoop.ui.screens.StepThreePage
import com.example.neveranotherappthegoop.ui.screens.StepTwoPage
import com.example.neveranotherappthegoop.ui.screens.VideoFourPage
import com.example.neveranotherappthegoop.ui.screens.VideoOnePage
import com.example.neveranotherappthegoop.ui.screens.VideoThreePage
import com.example.neveranotherappthegoop.ui.screens.VideoTwoPage
import com.example.neveranotherappthegoop.ui.screens.YouAreDoingGreatPage
import com.example.neveranotherappthegoop.viewmodel.MeasurementsViewModel


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            AppNavigation()
        }
    }
}
