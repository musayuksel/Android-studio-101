package com.example.jetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

// Box Composable
@Composable
fun BoxLayout() {
    Box(
        modifier = Modifier
            .size(200.dp)
            .background(Color.LightGray)
    ) {
        Text(
            text = "Hello", modifier = Modifier.align(Alignment.Center)
        )
        Text(
            text = "World", modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BoxLayoutPreview() {
    JetpackComposeTheme {
        BoxLayout()
    }
}