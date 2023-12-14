package com.example.jetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class Art(
    val id: Int,
    val title: String,
    val artist: String,
    val year: Int,
    val imageResource: Int,
    val description: String
)

val exampleImages = listOf(
    Art(
        id = 1,
        title = "The Starry Night",
        artist = "Vincent van Gogh",
        year = 1889,
        imageResource = R.drawable.art_1,
        description = "The Starry Night is an oil on canvas painting by Dutch Post-Impressionist painter Vincent van Gogh."
    ),
    Art(
        id = 2,
        title = "The Mona Lisa",
        artist = "Leonardo da Vinci",
        year = 1503,
        imageResource = R.drawable.art_2,
        description = "The Mona Lisa is a half-length portrait painting by the Italian artist Leonardo da Vinci."
    ),
    Art(
        id = 3,
        title = "The Scream",
        artist = "Edvard Munch",
        year = 1893,
        imageResource = R.drawable.art_3,
        description = "The Scream is the popular name given to a composition created by Norwegian Expressionist artist Edvard Munch in 1893."
    ),
)


@Composable
fun ArtSpaceExercise(modifier: Modifier = Modifier) {

    var currentImageIndex by remember { mutableIntStateOf(0) }

    fun handleNextImageClick(imagesLength: Int) {
        if (currentImageIndex < imagesLength-1) {
            currentImageIndex++
        }
    }

    fun handlePreviousImageClick() {
        if (currentImageIndex > 0) {
            currentImageIndex--
        }
    }



    Column (
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        ArtImage(
            imageResource = exampleImages[currentImageIndex].imageResource,
            description = exampleImages[currentImageIndex].description,
            modifier = modifier.weight(3f)
        )
        ArtExplanation(
            title = exampleImages[currentImageIndex].title,
            artist = exampleImages[currentImageIndex].artist,
            year = exampleImages[currentImageIndex].year,
            modifier = modifier.padding(horizontal = 24.dp)
        )

        NavigationImages(
            handleNextClick = {
                handleNextImageClick(exampleImages.size)
            },
            handlePreviousClick = {
                handlePreviousImageClick()
            },
            modifier = modifier.weight(1f)
        )
    }
}

@Composable
fun ArtImage(imageResource: Int, description: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize().padding(16.dp)
            .shadow(14.dp, shape = RoundedCornerShape(8.dp))
    ) {
        Card(
            shape = RoundedCornerShape(8.dp),
            modifier = modifier

        ) {
            Image(
                painter = painterResource(imageResource),
                contentDescription = description,
                modifier = Modifier.fillMaxSize().padding(16.dp)
            )
        }
    }
}

@Composable
fun ArtExplanation(
    title: String,
    artist: String,
    year: Int,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.fillMaxWidth()
        .background(Color.Magenta).padding(vertical = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(text = title, fontSize = 24.sp)
        Row {
            Text(text = artist)
            Text(text = year.toString())
        }
    }
}

@Composable
fun NavigationImages(
    handleNextClick: () -> Unit,
    handlePreviousClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(modifier = modifier) {
        Button(onClick = {
            handlePreviousClick()
        }) {
            Text(text = "Previous")
        }
        Button(onClick = {
            handleNextClick()
        }) {
            Text(text = "Next")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ArtSpaceExercisePreview() {
    ArtSpaceExercise()
}