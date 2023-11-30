package com.example.jetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HappyBirthdayCard(message: String, from: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
    ) {
        Image(
            painter = painterResource(id = R.drawable.androidparty), contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5f // opacity
        )
//     contentDescription = null => screen readers will IGNORE this image
        BirthdayCard(message, from)
    }
}

@Preview(showBackground = true)
@Composable
fun HappyBirthdayCardPreview() {
    HappyBirthdayCard("Happy Birthday Mete!", "From Musa")
}