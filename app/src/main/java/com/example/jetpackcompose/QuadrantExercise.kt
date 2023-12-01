package com.example.jetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class Task(val header: String, val body: String, val colorCode: Color)

val task1 = Task(
    "Text composable",
    "Displays text and follows the recommended Material Design guidelines.",
    Color(0xFFEADDFF)
)
val task2 = Task(
    "Image composable",
    "Creates a composable that lays out and draws a given Painter class object.",
    Color(0xFFD0BCFF)
)
val task3 = Task(
    "Row composable",
    "A layout composable that places its children in a horizontal sequence.",
    Color(0xFFB69DF8)
)
val task4 = Task(
    "Column composable",
    "A layout composable that places its children in a vertical sequence.",
    Color(0xFFF6EDFF)
)


@Composable
fun TextCard(task: Task, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(task.colorCode)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = task.header, fontWeight = FontWeight.Bold
        )
        Text(
            text = task.body,
            textAlign = TextAlign.Justify,
        )
    }
}

@Composable
fun TaskGrid() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(modifier = Modifier.weight(1f)) {
            TextCard(
                task1, modifier = Modifier.weight(1f)
            )
            TextCard(
                task2, modifier = Modifier.weight(1f)
            )
        }
        Row(modifier = Modifier.weight(1f)) {
            TextCard(
                task3, modifier = Modifier.weight(1f)
            )
            TextCard(
                task4, modifier = Modifier.weight(1f)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TaskGridPreview() {
    TaskGrid()
}