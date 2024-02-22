@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.jetpackcompose.visualTransformation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.VisualTransformation


@ExperimentalMaterial3Api
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChargePointIdScreen(
    chargePointId: String,
    onChargePointIdChange: (String) -> Unit,
    visualTransformation: VisualTransformation,
    modifier: Modifier = Modifier
) {
    TextField(
        value = chargePointId,
        onValueChange = onChargePointIdChange,
        visualTransformation = visualTransformation,
        modifier = modifier
    )
}
