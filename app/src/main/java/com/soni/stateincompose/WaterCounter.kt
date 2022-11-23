package com.soni.stateincompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.soni.stateincompose.ui.theme.StateInComposeTheme

@Composable
fun WaterCounter(modifier : Modifier = Modifier){
    Column( modifier = modifier.padding(16.dp)){
        //val count: MutableState<Int> = remember{ mutableStateOf(0) }
        var count by rememberSaveable { mutableStateOf(0)}

        if(count > 0){
            var showTask by rememberSaveable { mutableStateOf(true) }
            if(showTask){
                WellnessTaskItem(
                    onClose = { showTask = false },
                    taskItemName = "Have you skipped for thirty minutes today?")
            }
            Text(text = "You have had $count glasses.")
        }
        Row(Modifier.padding(top = 8.dp)){
            Button(onClick = { count++ },
                enabled = count < 10) {
                Text(text = "Add One")
            }
            Button(onClick = { count = 0 },
                Modifier.padding(start = 8.dp)) {
                Text(text = "Clear Water Count")
            }
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