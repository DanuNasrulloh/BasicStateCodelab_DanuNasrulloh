package com.example.basicstatecodelab

import android.R.attr.text
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Button as Buttom
import androidx.compose.foundation.layout.Column

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    Column (modifier = modifier.padding(16.dp)){
    var count = 0
        Text("You've had $count glasses.")
        Buttom(onClick = { count++ }, modifier = Modifier.padding(top = 8.dp)){
            Text("Add one")
        }
    }
}