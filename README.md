# 2nd Semester App Development: Android Studio

An MVP (Minimum Viable Product) functional example project written in Kotlin, demonstrating a linear process flow application. Built as part of our second-semester final exam in collaboration with the business startup **NeverAnother**.

---

## Project Overview
As part of our second-semester final exam, NeverAnother invited us to build an Android application that showcases the potential of their business. 

### Key Features
* **Measurement and Checkout Process Flow:** Guides users step-by-step through the core business logic.
* **MVP Architecture:** Focuses on core functionality to validate the business concept.
* **Modern Android Stack:** Built entirely in Kotlin utilizing modern Android Jetpack components.



## Minimum Requirements

* **Operating System:** Windows 10 (64-bit) / macOS 12 / 64-bit Linux
* **CPU:** Intel 8th Gen Core i5 / AMD Ryzen 1xxx (Post-2017 Architecture)
* **RAM:** 16 GB



## Getting Started

To get a local copy up and running, follow these simple steps.

### Prerequisites
* Android Studio installed (latest stable version recommended).
* Android SDK Platform 34 or higher.

### Installation and Setup

1. **Clone the repository:**
```bash
   git clone https://github.com/SilentVoices22/NeverAnotherTheGoopApp.git
```

2. **Open the project:**
   * Launch Android Studio.
   * Select Open and navigate to the cloned project directory.
   
3. **Sync changes:**
   *Open the ``build.gradle.kts (Module :app)`` file.
   * Click **Sync Now** in the notification bar and wait for the build process to complete.
  
4. **Run the Application**
   * Select an active emulator or a connected physical Android device.
   * Click the Run button (green play icon) or use the shortcut ``Shift + F10.``
  
---

## Folder Structure 

```text
com.example.neveranotherappthegoop
└── data
    ├── components
    │   ├── Components.kt
    │   └── Icons.kt
    ├── model
    │   └── MeasurementModel.kt
    ├── navigation
    │   └── nav.kt
    ├── ui
    │   ├── screens
    │   │   ├── CheckoutPage.kt
    │   │   ├── ErrorRecovery.kt
    │   │   ├── Expectations.kt
    │   │   ├── Fallout.kt
    │   │   ├── InfoPage.kt
    │   │   ├── LandingPage.kt
    │   │   ├── LoadingScreen.kt
    │   │   ├── OrderConfirmationPage.kt
    │   │   ├── ResultsPage.kt
    │   │   ├── StepFour.kt
    │   │   ├── StepOnePage.kt
    │   │   ├── StepThree.kt
    │   │   ├── StepTwo.kt
    │   │   ├── Video1.kt
    │   │   ├── Video2.kt
    │   │   ├── Video3.kt
    │   │   ├── Video4.kt
    │   │   └── YouAreDoingGreatPage.kt
    │   └── theme
    │       ├── Color.kt
    │       ├── Theme.kt
    │       └── Type.kt
    └── viewmodel
        └── MeasurementsViewModel.kt
```

