package com.example.jetpackcompose

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun BirthdayCard(message: String, from: String, modifier: Modifier = Modifier) {
    Text(
        text = message,
        fontSize  = 100.sp,
        lineHeight = 120.sp,
        modifier = modifier,
    )
    Text(text =from, fontSize = 40.sp, modifier = modifier)

}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    BirthdayCard("Happy Birthday Mete!", "From Musa")
}