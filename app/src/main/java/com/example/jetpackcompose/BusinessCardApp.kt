package com.example.jetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BusinessCardApp(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFCBE5CF)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ImageSection(modifier = modifier, fullName = "Musa Yuxel", title = "Android Developer")
//    TextSection()
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardAppPreview() {
    BusinessCardApp()
}

@Composable
fun ImageSection(fullName: String, title: String, modifier: Modifier) {
    Column(
        modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = "Android logo",
            modifier = modifier
                .background(Color(0xFF052A39))
                .height(200.dp)
                .width(200.dp)
        )
        Text(text = fullName, modifier = modifier, fontSize = 24.sp)
        Text(
            text = title,
            modifier = modifier,
            color = (Color(0xFF006237)),
            fontWeight = FontWeight.Bold
        )
    }
}