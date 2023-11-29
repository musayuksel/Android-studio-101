package com.example.jetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ImageGallery() {
    LazyRow(
        modifier = Modifier.padding(16.dp), horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        items(10) {
            Column(
                modifier = Modifier
                    .background(Color.Green)
                    .padding(4.dp)
            ) {
                CardImage()
            }
        }
    }
}


@Preview
@Composable
fun ImageGalleryPreview() {
    ImageGallery()
}
