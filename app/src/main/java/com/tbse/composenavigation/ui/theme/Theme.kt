package com.tbse.composenavigation.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.White

private val DarkColorPalette = darkColors(
    primary = Pink400,
    primaryVariant = Pink950,
    onPrimary = Black,
    secondary = Purple400,
    secondaryVariant = Purple400,
    onSecondary = Black
)

private val LightColorPalette = lightColors(
    primary = Pink600,
    primaryVariant = Pink950,
    onPrimary = White,
    secondary = Purple400,
    secondaryVariant = Purple700,
    onSecondary = Black
)

@Composable
fun CupcakeTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
