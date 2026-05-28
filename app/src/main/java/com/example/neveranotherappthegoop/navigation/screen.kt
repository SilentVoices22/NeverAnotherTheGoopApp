package com.example.neveranotherappthegoop.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable


// Onboard
@Serializable
object LandingPageKey : NavKey

@Serializable
object StepOnePageKey : NavKey

@Serializable
object StepTwoPageKey : NavKey

@Serializable
object StepThreePageKey : NavKey

@Serializable
object StepFourPageKey : NavKey

@Serializable
object DoingGreatKey : NavKey


// info


@Serializable
object ExpectactionKey : NavKey

@Serializable
object InfoPageKey : NavKey

@Serializable
object LoadingScreenKey : NavKey


// Checkout


@Serializable
object CheckoutPageKey : NavKey

@Serializable
object OrderConfirmedKey : NavKey

@Serializable
object ResultKey : NavKey


// video


@Serializable
object TutorialOneKey : NavKey

@Serializable
object TutorialTwoKey : NavKey

@Serializable
object TutorialThreeKey : NavKey

@Serializable
object TutorialFourKey : NavKey


// Error


@Serializable
object ErrorRecoveryKey : NavKey

@Serializable
object FalloutKey : NavKey
