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

//Noter til testen

//rule.onNodeWithText("Create my bra") .performClick()
//Finder det UI-element som har teksten og clicker på elementet

//rule.waitForIdle()
//Venter på at compose bliver færdig med de tidligere instruktioner,
//så den ikke bare går videre med flere ting på en gang og risikerer at fejle

//.assertExists()
//Tjekker om siden den navigerer til indholder -
// teksten "Lower circumference" ellers fejler testen.

//rule.setContent { AppNavigation() }
//SetContent fortæller testen hvilken page der skal testes på.
//Eftersom at det er AppNavigation kører den hele appen og lader -
// testen navigere mellem skærmene.

//val rule = createComposeRule()
//opretter Compose-testmiljø.
//Kan ses som en fjernbetjening til testen.
// som finder ui elementer og kan udføre -
// handlinger som man beder den om.

@RunWith(AndroidJUnit4::class)
class MeasurementUITest {

    @get:Rule
    val rule = createComposeRule()

    @Test
    fun navigateToStepOne() {
        rule.setContent { AppNavigation() }

        Thread.sleep(2000)

        rule.onNodeWithText("Create my bra")
            .performClick()

        Thread.sleep(2000)

        rule.waitForIdle()

        Thread.sleep(2000)

        rule.onNodeWithText("Let's begin")
            .performClick()

        Thread.sleep(1000)

        rule.waitForIdle()

        Thread.sleep(1000)

        rule.onNodeWithText("Upper circumference")
            .assertExists()
    }

    @Test
    fun enterMeasurementAndGoToStepTwo() {
        rule.setContent { AppNavigation() }

        Thread.sleep(1000)

        rule.onNodeWithText("Create my bra")
            .performClick()

        Thread.sleep(1000)

        rule.waitForIdle()

        Thread.sleep(1000)

        rule.onNodeWithText("Let's begin")
            .performClick()

        Thread.sleep(1000)

        rule.waitForIdle()

        Thread.sleep(1000)

        rule.onNodeWithText("0.00 cm")
            .performTextInput("90")

        Thread.sleep(1000)

        rule.onNodeWithText("Continue")
            .performClick()

        Thread.sleep(1000)


        rule.waitForIdle()

        Thread.sleep(1000)


        rule.onNodeWithText("Lower circumference")
            .assertExists()
    }
}