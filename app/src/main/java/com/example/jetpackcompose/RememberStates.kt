package com.example.jetpackcompose

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun IncreaseNumber() {
    Column {
        var total by remember { mutableStateOf(0) }
        Button(onClick = { total++ }) {
            Text("I've been clicked $total times")
        }
    }
}

@Preview
@Composable
fun IncreaseNumberPreview() {
    IncreaseNumber()
}