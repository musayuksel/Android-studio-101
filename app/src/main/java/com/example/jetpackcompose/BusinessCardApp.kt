package com.example.jetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BusinessCardApp(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFCBE5CF))
    ) {

        ImageSection(modifier = modifier)
//    TextSection()
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardAppPreview() {
    BusinessCardApp()
}

@Composable
fun ImageSection(modifier: Modifier) {
    Column {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = "Android logo",
            modifier = modifier
                .background(Color(0xFF052A39))
        )
    }
}