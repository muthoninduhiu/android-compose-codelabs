package com.codelab.theming.ui.start.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

@Composable
fun JetNewsTheming(content: @Composable () -> Unit){
    MaterialTheme(content = content)
}
private val lightColors = lightColors(

)