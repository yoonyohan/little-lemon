package com.example.littlelemon.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit

@Composable
fun TextCopy(
    modifier: Modifier = Modifier,
    fontWeight: FontWeight = FontWeight.Light,
    fontSize: TextUnit,
    text: String
) {
    Text(
        text = text,
        modifier = modifier,
        fontWeight = fontWeight,
        fontSize = fontSize
    )
}