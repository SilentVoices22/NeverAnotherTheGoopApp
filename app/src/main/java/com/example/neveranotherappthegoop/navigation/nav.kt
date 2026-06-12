package com.example.neveranotherappthegoop.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.neveranotherappthegoop.data.model.MeasurementValidator
import com.example.neveranotherappthegoop.ui.screens.PurchaseFlow.CheckoutPage
import com.example.neveranotherappthegoop.ui.screens.Error.ErrorRecovery
import com.example.neveranotherappthegoop.ui.screens.Hook.ExpectationsPageBody
import com.example.neveranotherappthegoop.ui.screens.Error.FalloutPageBody
import com.example.neveranotherappthegoop.ui.screens.Hook.InfoPageBody
import com.example.neveranotherappthegoop.ui.screens.Hook.LandingPageBody
import com.example.neveranotherappthegoop.ui.screens.PurchaseFlow.LoadingScreen
import com.example.neveranotherappthegoop.ui.screens.PurchaseFlow.OrderConfirmationScreen
import com.example.neveranotherappthegoop.ui.screens.PurchaseFlow.ResultsPageBody
import com.example.neveranotherappthegoop.ui.screens.Onboarding.StepFourPage
import com.example.neveranotherappthegoop.ui.screens.Onboarding.StepOnePage
import com.example.neveranotherappthegoop.ui.screens.Onboarding.StepThreePage
import com.example.neveranotherappthegoop.ui.screens.Onboarding.StepTwoPage
import com.example.neveranotherappthegoop.ui.screens.videos.VideoFourPage
import com.example.neveranotherappthegoop.ui.screens.videos.VideoOnePage
import com.example.neveranotherappthegoop.ui.screens.videos.VideoThreePage
import com.example.neveranotherappthegoop.ui.screens.videos.VideoTwoPage
import com.example.neveranotherappthegoop.ui.screens.Onboarding.YouAreDoingGreatPage
import com.example.neveranotherappthegoop.viewmodel.MeasurementsViewModel

/*---------------------------------------------------------Programmeret af Hjalte, men peer-coded af hele gruppen-------------------------------------------------------------- */

@Composable
fun AppNavigation() {

    val navController = rememberNavController()
    val viewModel: MeasurementsViewModel = viewModel()

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
                onBackClick = { navController.popBackStack() },
                onBeginClick = { navController.navigate("StepOnePage") }
            )
        }

        composable("StepOnePage") {
            StepOnePage(
                onBackClick = { navController.popBackStack() },
                onContinueClick = {
                    if (MeasurementValidator.isUpperCircumferenceTooLarge(viewModel.uiState.upperCircumference)) {
                        navController.navigate("ErrorRecoveryPage")
                    } else {
                        navController.navigate("StepTwoPage")
                    }
                },
                onVideoGuideClick = { navController.navigate("VideoOnePage") },
                measurement = viewModel.uiState.upperCircumference,
                onMeasurementChange = { viewModel.updateUpperCircumference(it) }
            )
        }

        composable("ErrorRecoveryPage") {
            ErrorRecovery(
                onBackClick = { navController.popBackStack()},
                onTryAgainClick = {navController.popBackStack()}
            )
        }

        composable("VideoOnePage") {
            VideoOnePage(
                onBackClick = { navController.popBackStack() }
            )
        }

        composable("StepTwoPage") {
            StepTwoPage(
                onBackClick = { navController.popBackStack() },
                onContinueClick = {
                    if (MeasurementValidator.isLowerCircumferenceTooLarge(viewModel.uiState.lowerCircumference)) {
                        navController.navigate("FalloutPage")
                    } else {
                        navController.navigate("YouAreDoingGreatPage")
                    }
                },
                onVideoGuideClick = { navController.navigate("VideoTwoPage") },
                measurement = viewModel.uiState.lowerCircumference,
                onMeasurementChange = { viewModel.updateLowerCircumference(it) }
            )
        }

        composable("VideoTwoPage") {
            VideoTwoPage(
                onBackClick = { navController.popBackStack() }
            )
        }

        composable("YouAreDoingGreatPage") {
            YouAreDoingGreatPage(
                onBackClick = { navController.popBackStack() },
                onContinueClick = { navController.navigate("StepThreePage") }
            )
        }

        composable("StepThreePage") {
            StepThreePage(
                onBackClick = { navController.popBackStack() },
                onContinueClick = {
                    if (MeasurementValidator.isInvalidInput(viewModel.uiState.breastSpan)) {
                        navController.navigate("FalloutPage")
                    } else {
                        navController.navigate("StepFourPage")

                    }
                },
                onVideoGuideClick = { navController.navigate("VideoThreePage") },
                measurement = viewModel.uiState.breastSpan,
                onMeasurementChange = { viewModel.updateBreastSpan(it) }
            )
        }

        composable("VideoThreePage") {
            VideoThreePage(
                onBackClick = { navController.popBackStack() }
            )
        }

        composable("StepFourPage") {
            StepFourPage(
                onBackClick = { navController.popBackStack() },
                onContinueClick = {
                    if (MeasurementValidator.isInvalidInput(viewModel.uiState.breastHeight)) {
                        navController.navigate("ErrorRecoveryPage")
                    } else {
                        navController.navigate("LoadingScreen")
                    }
                },
                onVideoGuideClick = { navController.navigate("VideoFourPage") },
                measurement = viewModel.uiState.breastHeight,
                onMeasurementChange = { viewModel.updateBreastHeight(it) }
            )
        }

        composable("VideoFourPage") {
            VideoFourPage(
                onBackClick = { navController.popBackStack() }
            )
        }

        composable("FalloutPage") {
            FalloutPageBody(
                onBackClick = { navController.popBackStack() }
            )
        }

        composable("LoadingScreen") {
            LoadingScreen(
                onFinishedLoading = { navController.navigate("ResultsPageBody") }
            )
        }

        composable("ResultsPageBody") {
            ResultsPageBody(
                onViewButtonClick = { navController.navigate("CheckoutPage") },
                onRetakeButtonClick = { navController.navigate("StepOnePage") },
                measurement1 = viewModel.uiState.upperCircumference,
                measurement2 = viewModel.uiState.lowerCircumference,
                measurement3 = viewModel.uiState.breastSpan,
                measurement4 = viewModel.uiState.breastHeight
            )
        }

        composable("CheckoutPage") {
            CheckoutPage(
                onBackClick = { navController.popBackStack() },
                onPlaceOrderBClick = { navController.navigate("OrderConfirmationScreen") },
                onJoinLinkTextClick = { navController.navigate("InfoPageBody") },
                quantity = viewModel.uiState.quantity,
                selectedColor = viewModel.uiState.selectedColor,
                onIncrease = { viewModel.increaseQuantity() },
                onDecrease = { viewModel.decreaseQuantity() },
                onColorSelect = { viewModel.selectColor(it) },
                totalPrice = viewModel.uiState.totalPrice
            )
        }

        composable("OrderConfirmationScreen") {
            OrderConfirmationScreen(
                onLogoButtonClick = { navController.navigate("LandingPageBody") },
                quantity = viewModel.uiState.quantity,
                totalPrice = viewModel.uiState.totalPrice,
                selectedColor = viewModel.uiState.selectedColor
            )
        }

        composable("InfoPageBody") {
            InfoPageBody(
                onBackClick = { navController.popBackStack() }
            )
        }
    }
}