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
import com.example.neveranotherappthegoop.ui.theme.screens.ErrorRecovery
import com.example.neveranotherappthegoop.ui.theme.screens.FalloutPageBody
import com.example.neveranotherappthegoop.ui.theme.screens.OrderConfirmationScreen
import com.example.neveranotherappthegoop.ui.theme.screens.ResultsPageBody
import com.example.neveranotherappthegoop.ui.theme.screens.VideoFourPage
import com.example.neveranotherappthegoop.ui.theme.screens.VideoThreePage
import com.example.neveranotherappthegoop.ui.theme.screens.VideoTwoPage


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            val navController = rememberNavController()

            NavHost(
                navController = navController,
                startDestination = "LandingPageBody"
            ) {
                composable("LandingPageBody") {
                    LandingPageBody(
                        onExpectationsPageBodyButtonClick = {
                            navController.navigate("ExpectationsPageBody")
                        }
                    )
                }

                composable("ExpectationsPageBody") {
                    ExpectationsPageBody(
                        onBackClick = {
                        navController.popBackStack()
                    },
                        onBeginClick = {
                            navController.navigate("StepOnePage")
                        }
                    )
                }
                composable("StepOnePage") {
                    StepOnePage(
                        onBackClick = {
                            navController.popBackStack()
                        },
                        onContinueClick = {
                            navController.navigate("StepTwoPage")
                        },
                        onVideoGuideClick = {
                            navController.navigate("VideoOnePage")
                        },
                        onTextFieldClick = {
                            navController.navigate("FalloutPage")
                        }
                    )
                }
                composable("FalloutPage") {
                    FalloutPageBody(

                        onBackClick = {
                            navController.popBackStack()
                        }
                    )
                }
                composable("VideoOnePage") {
                    VideoOnePage(
                        onBackClick = {
                            navController.popBackStack()
                        },
                    )
                }

                composable("StepTwoPage") {
                    StepTwoPage(
                        onBackClick = {
                            navController.popBackStack()
                        },
                        onContinueClick = {
                            navController.navigate("StepThreePage")
                        },
                        onVideoGuideClick = {
                            navController.navigate("VideoTwoPage")
                        },
                        onTextFieldClick = {
                            navController.navigate("ErrorRecoveryPage")
                        }
                    )
                }
                composable("ErrorRecoveryPage") {
                    ErrorRecovery(
                        onBackClick = {
                            navController.popBackStack()
                        }
                    )
                }
                composable("VideoTwoPage") {
                    VideoTwoPage(
                        onBackClick = {
                            navController.popBackStack()
                        },
                    )
                }
                composable("StepThreePage") {
                    StepThreePage(
                        onBackClick = {
                            navController.popBackStack()
                        },
                        onContinueClick = {
                            navController.navigate("StepFourPage")
                        },
                        onVideoGuideClick = {
                            navController.navigate("VideoThreePage")
                        }
                    )
                }
                composable("VideoThreePage") {
                    VideoThreePage(
                        onBackClick = {
                            navController.popBackStack()
                        },
                    )
                }
                composable("StepFourPage") {
                    StepFourPage(

                        onBackClick = {
                            navController.popBackStack()
                        },
                        onContinueClick = {
                            navController.navigate("LoadingScreen")
                        },
                        onVideoGuideClick = {
                            navController.navigate("VideoFourPage")
                        }
                    )
                }
                composable("VideoFourPage") {
                    VideoFourPage(
                        onBackClick = {
                            navController.popBackStack()
                        },
                    )
                }
                composable("LoadingScreen") {

                    LoadingScreen(
                        onFinishedLoading = {
                            navController.navigate("ResultsPageBody")
                        }
                    )
                }
                composable("ResultsPageBody") {
                    ResultsPageBody(

                        onViewButtonClick = {
                            navController.navigate("CheckoutPage")
                        }
                    )
                }
                composable("CheckoutPage") {
                    CheckoutPage(
                        onBackClick = {
                            navController.popBackStack()
                        },
                        onPlaceOrderBClick = {
                            navController.navigate("OrderConfirmationScreen")
                        }
                    )
                }
                composable("OrderConfirmationScreen") {
                    OrderConfirmationScreen(
                        onLogoButtonClick = {
                            navController.navigate("LandingPageBody")
                        }
                    )
                }
            }
        }
    }
}
