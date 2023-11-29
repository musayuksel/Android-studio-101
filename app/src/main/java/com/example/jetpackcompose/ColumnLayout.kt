package com.example.jetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme


// Layout Composable
@Composable
fun ColumnLayout(name: String, modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.End,
        // The horizontalAlignment property aligns the children of the Column to the end (right) of the column.
        modifier = modifier
            .background(Color.Green)
            .padding(16.dp),
        // The modifier is applied to the Column composable.
    ) {
        Text(
            text = "Hello $name!",
            color = Color.Blue,
            fontSize = 32.sp,
            modifier = modifier
                .background(Color.Yellow)
                .padding(16.dp)
        )
        Text(
            text = "Olá",
            color = Color.Blue,
            fontSize = 32.sp,
            modifier = modifier
                .background(Color.Cyan)
                .padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ColumnLayoutPreview() {
    JetpackComposeTheme {
        ColumnLayout("Android")
    }
}
