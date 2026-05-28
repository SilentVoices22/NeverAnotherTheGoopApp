package com.example.neveranotherappthegoop.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.neveranotherappthegoop.CheckoutPage
import com.example.neveranotherappthegoop.LoadingScreen
import com.example.neveranotherappthegoop.VideoOnePage
import com.example.neveranotherappthegoop.ui.theme.screens.ErrorRecovery
import com.example.neveranotherappthegoop.ui.theme.screens.ExpectationsPageBody
import com.example.neveranotherappthegoop.ui.theme.screens.FalloutPageBody
import com.example.neveranotherappthegoop.ui.theme.screens.InfoPageBody
import com.example.neveranotherappthegoop.ui.theme.screens.LandingPageBody
import com.example.neveranotherappthegoop.ui.theme.screens.OrderConfirmationScreen
import com.example.neveranotherappthegoop.ui.theme.screens.ResultsPageBody
import com.example.neveranotherappthegoop.ui.theme.screens.StepFourPage
import com.example.neveranotherappthegoop.ui.theme.screens.StepOnePage
import com.example.neveranotherappthegoop.ui.theme.screens.StepThreePage
import com.example.neveranotherappthegoop.ui.theme.screens.StepTwoPage
import com.example.neveranotherappthegoop.ui.theme.screens.VideoFourPage
import com.example.neveranotherappthegoop.ui.theme.screens.VideoThreePage
import com.example.neveranotherappthegoop.ui.theme.screens.VideoTwoPage
import com.example.neveranotherappthegoop.ui.theme.screens.YouAreDoingGreatPage



@Composable

fun AppNavigation () {

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

