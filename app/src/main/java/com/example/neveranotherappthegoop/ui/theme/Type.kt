package com.example.neveranotherappthegoop.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.unit.sp
// Replace with your actual project package name to reference the auto-generated certs
import com.example.neveranotherappthegoop.R

/*---------------------------------------------------------Fælles-kodning, med hjælp fra ai 26/05/28-------------------------------------------------------------- */


// used Ai to write line of code, to find out how to use fonts in the newest android studio.
val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs // Points to the file Android Studio made!
)

// 2. Choose your Google Font
val InterFont = GoogleFont("Inter")

// 3. Combine them into a Compose FontFamily
val InterFontFamily = FontFamily(
    Font(googleFont = InterFont, fontProvider = provider, weight = FontWeight.Normal),
    Font(googleFont = InterFont, fontProvider = provider, weight = FontWeight.Medium),
    Font(googleFont = InterFont, fontProvider = provider, weight = FontWeight.Bold)
)

// 4. Map it to your Theme's default styles
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = InterFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    titleLarge = TextStyle(
        fontFamily = InterFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp
    )
)