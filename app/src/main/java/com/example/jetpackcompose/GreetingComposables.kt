package com.example.jetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

// Text Composable vs Custom Modifier
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        color = Color.Blue,
        fontSize = 32.sp,
        // The above properties are for the Text composable
        // color, fontSize, and text are properties of the Text composable itself
        // modifier is not a property of the Text composable, but it is used to modify the appearance of the Text composable

        // modifier = modifier.padding(16.dp).background(Color.Yellow)
        // ORDER is important, the code above is different from the code below
        modifier = modifier
            .background(Color.Yellow)
            .padding(16.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeTheme {
        Greeting("Android")
    }
}