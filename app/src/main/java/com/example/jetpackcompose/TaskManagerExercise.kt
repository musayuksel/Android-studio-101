package com.example.jetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TaskManagerExercise() {
    Box(
        modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_task_completed),
                contentDescription = "Okay tick with green background"
            )
            Text(
                text = "All tasks completed",
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(0.dp, 24.dp, 0.dp, 8.dp)
            )
            Text(text = "Nice work!", fontSize = 16.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TaskManagerExercisePreview() {
    TaskManagerExercise()
}