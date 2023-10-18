package com.example.myapplication.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.Greeting

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppCounter()
                }
            }
        }
    }
}

@Preview
@Composable
fun AppCounter() {
    var numCount by remember {
        mutableStateOf(0)
    }
    Column {
        Text(numCount.toString())
        Row {
            Button(onClick = { ++numCount} ) {
                Text(text = "Increment")
            }
            Text(text = "       ")
            Button(onClick = { --numCount}) {
                Text(text = "Decrement")
            }
        }
    }
}


