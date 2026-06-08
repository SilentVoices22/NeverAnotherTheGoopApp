package com.example.neveranotherappthegoop

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.neveranotherappthegoop.navigation.AppNavigation
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MeasurementUITest {

    @get:Rule
    val rule = createComposeRule()

    @Test
    fun navigateToStepOne() {
        rule.setContent { AppNavigation() }

        rule.onNodeWithText("Create my bra")
            .performClick()

        rule.waitForIdle()

        rule.onNodeWithText("Let's begin")
            .performClick()

        rule.waitForIdle()

        rule.onNodeWithText("Upper circumference")
            .assertExists()
    }

    @Test
    fun enterMeasurementAndGoToStepTwo() {
        rule.setContent { AppNavigation() }

        rule.onNodeWithText("Create my bra")
            .performClick()

        rule.waitForIdle()

        rule.onNodeWithText("Let's begin")
            .performClick()

        rule.waitForIdle()

        rule.onNodeWithText("0.00 cm")
            .performTextInput("90")

        rule.onNodeWithText("Continue")
            .performClick()

        rule.waitForIdle()

        rule.onNodeWithText("Lower circumference")
            .assertExists()
    }
}