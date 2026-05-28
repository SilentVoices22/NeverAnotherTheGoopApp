package com.example.neveranotherappthegoop.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.example.neveranotherappthegoop.ui.screens.info.ExpectationsPageBody
import com.example.neveranotherappthegoop.ui.screens.info.LoadingScreen
import com.example.neveranotherappthegoop.ui.screens.onboard.LandingPageBody
import com.example.neveranotherappthegoop.ui.screens.onboard.StepOnePage
import com.example.neveranotherappthegoop.ui.screens.checkout.OrderConfirmationScreen
import com.example.neveranotherappthegoop.ui.screens.checkout.ResultsPageBody
import com.example.neveranotherappthegoop.ui.screens.onboard.StepFourPage
import com.example.neveranotherappthegoop.ui.screens.onboard.StepThreePage
import com.example.neveranotherappthegoop.ui.screens.onboard.StepTwoPage
import com.example.neveranotherappthegoop.ui.screens.videos.VideoFourPage
import com.example.neveranotherappthegoop.ui.screens.videos.VideoOnePage
import com.example.neveranotherappthegoop.ui.screens.videos.VideoThreePage
import com.example.neveranotherappthegoop.ui.screens.videos.VideoTwoPage


// Navigation 3 API,
@Composable
fun AppNavigation() {
    // Navigation 3 backstack initialization
    val backStack = rememberNavBackStack(LandingPageKey)

    NavDisplay(
        backStack = backStack,
        onBack = {
            if (backStack.size > 1) {
                backStack.removeAt(backStack.lastIndex)
            }
        }
    ) { key ->
        when (key) {
            is LandingPageKey -> NavEntry(key) {
                LandingPageBody(
                    onExpectationsPageBodyButtonClick = {
                        backStack.add(ExpectactionKey)
                    }
                )
            }

            is ExpectactionKey -> NavEntry(key) {
                ExpectationsPageBody(
                    onBackClick = {
                        backStack.removeAt(backStack.lastIndex)
                    },
                    onStepOneOnClick = {
                        backStack.add(StepOnePageKey)
                    }
                )
            }

            is StepOnePageKey -> NavEntry(key) {
                StepOnePage(
                    onBackClick = {
                        backStack.removeAt(backStack.lastIndex)
                    },
                    onStepTwoButtonClick = {
                        // Assuming StepTwo is next
                        backStack.add(StepTwoPageKey)
                    },
                    onVideoGuideClick = {
                        backStack.add(TutorialOneKey)
                    },
                )
            }

            is StepTwoPageKey -> NavEntry(key) {
                StepTwoPage(
                    onBackClick = {
                        backStack.removeAt(backStack.lastIndex)
                    },
                    onStepThreeButtonClick = {
                        backStack.add(DoingGreatKey)
                    },
                    onVideoGuideClick = {
                        backStack.add(TutorialTwoKey)
                    },
                )
            }

            is DoingGreatKey -> NavEntry(key) {
                StepTwoPage(
                    onBackClick = {
                        backStack.removeAt(backStack.lastIndex)
                    },
                    onStepThreeButtonClick = {
                        backStack.add(StepThreePageKey)
                    },
                    onVideoGuideClick = {
                        backStack.add(TutorialTwoKey)
                    },
                )
            }

            is StepThreePageKey -> NavEntry(key) {
                StepThreePage(
                    onBackClick = {
                        backStack.removeAt(backStack.lastIndex)
                    },
                    onStepFourButtonClick = {
                        backStack.add(StepFourPageKey)
                    },
                    onVideoGuideClick = {
                        backStack.add(TutorialThreeKey)
                    },
                )
            }

            is StepFourPageKey -> NavEntry(key) {
                StepFourPage(
                    onBackClick = {
                        backStack.removeAt(backStack.lastIndex)
                    },
                    OnContinueButtonClick = {
                        backStack.add(LoadingScreenKey)
                    },
                    onVideoGuideClick = {
                        backStack.add(TutorialFourKey)
                    },
                )
            }


            is LoadingScreenKey -> NavEntry(key) {
                LoadingScreen(
                    onFinishedLoading = {
                        backStack.add(ResultKey)
                    }
                )
            }

            is ResultKey -> NavEntry(key) {
                ResultsPageBody(
                    onCheckoutButtonClick = {
                        backStack.add(OrderConfirmedKey)
                    },
                    onRetakeButtonClick = {
                        // kode gør den gå tilbage screens indtil den rammer steponescreen, så screen ikke stacker på hinanden - Kevin 26/05/28
                        backStack.retainAll(backStack.takeWhile { it != StepOnePageKey } + StepOnePageKey)
                    }
                )
            }

            is OrderConfirmedKey -> NavEntry(key) {
                OrderConfirmationScreen(
                    onLogoButtonClick = {
                        backStack.retainAll(backStack.takeWhile { it != StepOnePageKey } + StepOnePageKey)
                    }
                )
            }

// videos

            is TutorialOneKey -> NavEntry(key) {
                VideoOnePage(
                    onBackClick = {
                        backStack.removeAt(backStack.lastIndex)
                    }
                )
            }

            is TutorialTwoKey -> NavEntry(key) {
                VideoTwoPage(
                    onBackClick = {
                        backStack.removeAt(backStack.lastIndex)
                    }
                )
            }

            is TutorialThreeKey -> NavEntry(key) {
                VideoThreePage(
                    onBackClick = {
                        backStack.removeAt(backStack.lastIndex)
                    }
                )
            }

            is TutorialFourKey -> NavEntry(key) {
                VideoFourPage(
                    onBackClick = {
                        backStack.removeAt(backStack.lastIndex)
                    }
                )
            }

            // Add more entries as you implement other screens
            else -> NavEntry(key) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Text(text = "Screen for $key not implemented yet")
                }
            }
        }
    }
}
