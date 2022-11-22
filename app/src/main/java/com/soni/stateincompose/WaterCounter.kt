package com.soni.stateincompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.soni.stateincompose.ui.theme.StateInComposeTheme

@Composable
fun WaterCounter(
    modifier : Modifier = Modifier
) {
    Column( modifier = modifier.padding(16.dp)){
        val count: MutableState<Int> = remember{ mutableStateOf(0) }
        Text(text = "You have had $count glasses.")
        Button(onClick = { count.value++},
            Modifier.padding(top = 8.dp)) {
            Text(text = "Add One")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    StateInComposeTheme {
        WaterCounter()
    }
}