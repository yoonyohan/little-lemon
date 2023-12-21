package com.example.littlelemon.components

import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun OutLinedButtonCopy(
    onclick: () -> Unit,
    modifier: Modifier = Modifier,
    text: String
) {
    OutlinedButton(
        onClick = {onclick()},
        modifier = modifier
    ) {
        Text(text = text)
    }
}