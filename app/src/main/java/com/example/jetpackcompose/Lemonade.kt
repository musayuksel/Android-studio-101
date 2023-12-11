package com.example.jetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class ImageResource(val imageResource: Int, val description: String)

@Composable
fun Lemonade(
    modifier: Modifier = Modifier
) {
    val images = remember {
        listOf(
            ImageResource(R.drawable.lemon_tree, "Tap the lemon tree to select a lemon"),
            ImageResource(R.drawable.lemon_squeeze, "Keep tapping the lemon to squeeze it"),
            ImageResource(R.drawable.lemon_drink, "Tap the lemonade to drink it"),
            ImageResource(R.drawable.lemon_restart, "Tap the empty glass to start again"),
        )
    }
    var currentImageIndex by remember { mutableStateOf(0) }

    val handleImageClick = {
        currentImageIndex = (currentImageIndex + 1) % images.size
    }

    Column(
        modifier = Modifier
            .background(Color(0xFFFFF200))
    ) {
        Text(
            text = "Lemonade",
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(26.dp)
                .fillMaxWidth()
        )
    }
    Column(
        modifier = modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = handleImageClick,
            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.tertiaryContainer),
            shape = RoundedCornerShape(8.dp),

            ) {

            Image(
                painter = painterResource(id = images[currentImageIndex].imageResource),
                contentDescription = images[currentImageIndex].description,
                modifier = modifier.padding(16.dp)
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = images[currentImageIndex].description, fontSize = 18.sp)
    }

}

@Preview(showBackground = true)
@Composable
fun LemonadePreview() {
    Lemonade()
}