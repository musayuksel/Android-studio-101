package com.example.jetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

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
    Column {
//        image
        ArtImage(
            imageResource = exampleImages[0].imageResource,
            description = exampleImages[0].description,
            modifier = modifier
        )
        ArtExplanation(
            title = exampleImages[0].title,
            artist = exampleImages[0].artist,
            year = exampleImages[0].year,
            modifier = modifier
        )
        NavigationImages(modifier = modifier)
    }
}

@Composable
fun ArtImage(imageResource: Int, description: String, modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(imageResource),
        contentDescription = description,
        modifier = modifier
    )
}

@Composable
fun ArtExplanation(
    title: String,
    artist: String,
    year: Int,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Text(text = title)
        Row {
            Text(text = artist)
            Text(text = year.toString())
        }
    }
}

@Composable
fun NavigationImages(
    modifier: Modifier = Modifier,
) {
    Row(modifier = modifier) {
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Previous")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Next")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ArtSpaceExercisePreview() {
    ArtSpaceExercise()
}