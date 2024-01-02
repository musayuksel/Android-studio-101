package com.example.jetpackcompose.affirmations

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.R
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

@Composable
fun AffirmationApp() {

}

@Composable
fun AffirmationCard(affirmation: Affirmation, modifier: Modifier = Modifier) {
    Card(modifier = modifier) {
        Column {
            Image(
                painter = painterResource(id = affirmation.affirmationImageId),
                contentDescription = stringResource(
                    id = affirmation.affirmationStringId
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(196.dp),
                contentScale = ContentScale.Crop
            )
            Text(text = LocalContext.current.getString(affirmation.affirmationStringId),
                modifier= Modifier.padding(16.dp),
                style = MaterialTheme.typography.headlineSmall
                )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AffirmationCardPreview() {
    JetpackComposeTheme {
        AffirmationCard(Affirmation(R.string.affirmation1, R.drawable.image1))
    }
}
