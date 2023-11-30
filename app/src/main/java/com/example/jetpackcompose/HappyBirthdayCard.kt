package com.example.jetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BirthdayCard(message: String, from: String, modifier: Modifier = Modifier) {
//    Trailing Lambda Syntax = The last parameter of a function can be passed as a lambda outside the parentheses. We can also use Column( content = { ... } ) instead of Column { ... }.
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(4.dp)) {
        Text(
            text = message,
            fontSize = 100.sp,
            lineHeight = 120.sp,
            textAlign =TextAlign.Center,
            modifier = modifier.align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = from, fontSize = 40.sp, modifier = modifier
                .padding(8.dp)
                .align(alignment = Alignment.End)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    BirthdayCard("Happy Birthday Mete!", "From Musa")
}

