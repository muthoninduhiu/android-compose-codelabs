package com.soni.stateincompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.soni.stateincompose.ui.theme.StateInComposeTheme

@Composable
fun WaterCounter(modifier : Modifier = Modifier){
    Column( modifier = modifier.padding(16.dp)){
        //val count: MutableState<Int> = remember{ mutableStateOf(0) }
        var count by remember { mutableStateOf(0)}
        Text(text = "You have had $count glasses.")
        Row(){
            Button(onClick = { count++ },
                Modifier.padding(top = 8.dp)) {
                Text(text = "Add One")
            }
            Button(onClick = { count-- },
                Modifier.padding(top = 8.dp)) {
                Text(text = "Remove One")
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