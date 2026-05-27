package com.example.neveranotherappthegoop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.neveranotherappthegoop.ui.screens.onboard.LandingPageBody
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.neveranotherappthegoop.ui.screens.checkout.CheckoutPage
import com.example.neveranotherappthegoop.ui.screens.checkout.OrderConfirmationScreen
import com.example.neveranotherappthegoop.ui.screens.checkout.ResultsPageBody
import com.example.neveranotherappthegoop.ui.screens.error.ErrorRecovery
import com.example.neveranotherappthegoop.ui.screens.error.FalloutPageBody
import com.example.neveranotherappthegoop.ui.screens.info.ExpectationsPageBody
import com.example.neveranotherappthegoop.ui.screens.info.InfoPageBody
import com.example.neveranotherappthegoop.ui.screens.info.LoadingScreen
import com.example.neveranotherappthegoop.ui.screens.onboard.StepFourPage
import com.example.neveranotherappthegoop.ui.screens.onboard.StepOnePage
import com.example.neveranotherappthegoop.ui.screens.onboard.StepThreePage
import com.example.neveranotherappthegoop.ui.screens.onboard.StepTwoPage
import com.example.neveranotherappthegoop.ui.screens.onboard.YouAreDoingGreatPage


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
                    _root_ide_package_.com.example.neveranotherappthegoop.ui.screens.videos.VideoOnePage(
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
                            navController.navigate("YouAreDoingGreatPage")
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
                    _root_ide_package_.com.example.neveranotherappthegoop.ui.screens.videos.VideoTwoPage(
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
                    _root_ide_package_.com.example.neveranotherappthegoop.ui.screens.videos.VideoThreePage(
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
                    _root_ide_package_.com.example.neveranotherappthegoop.ui.screens.videos.VideoFourPage(
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
                        },
                        onJoinLinkTextClick = {
                            navController.navigate("InfoPageBody")
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
                composable("InfoPageBody") {
                    InfoPageBody(
                        onBackClick = {
                            navController.popBackStack()
                        },
                    )
                }
                composable("YouAreDoingGreatPage") {
                    YouAreDoingGreatPage(
                        onBackClick = {
                            navController.popBackStack()
                        },
                        onPageButtonClick = {
                            navController.navigate("StepThreePage")
                        }
                    )
                }
            }
        }
    }
}
