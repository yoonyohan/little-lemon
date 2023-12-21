package com.example.littlelemon.components

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun FilledButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    text: String
) {
    Button(
        onClick = { onClick()},
        modifier = modifier
    ) {
        Text(text = text, modifier = Modifier)
    }
}