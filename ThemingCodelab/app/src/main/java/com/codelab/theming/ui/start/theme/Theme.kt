package com.codelab.theming.ui.start.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MovableContent
import java.lang.reflect.Modifier

@Composable
fun JetNewsTheming(content: @Composable () -> Unit){
    MaterialTheme(content = content)
}