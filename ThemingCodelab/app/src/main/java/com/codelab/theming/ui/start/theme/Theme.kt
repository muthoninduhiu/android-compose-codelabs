package com.codelab.theming.ui.start.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun JetNewsTheming(content: @Composable () -> Unit){
    MaterialTheme(
        content = content,
        colors = lightColors
    )
}
private val lightColors = lightColors(
    primary = Red700,
    primaryVariant = Red900,
    onPrimary = Color.White,
    secondary = Red700,
    secondaryVariant = Red900 ,
    onSecondary = Color.White,
    error = Red800
)