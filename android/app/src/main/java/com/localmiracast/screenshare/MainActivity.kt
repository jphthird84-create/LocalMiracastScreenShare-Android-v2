package com.localmiracast.screenshare

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MiracastScreen()
        }
    }
}

@Composable
fun MiracastScreen() {
    var status by remember { mutableStateOf("Ready") }
    Column {
        Text("Local Miracast Screen Share")
        Button(onClick = { status = "Starting..." }) {
            Text("Start Casting")
        }
        Text(status)
    }
}