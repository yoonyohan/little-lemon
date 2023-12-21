package com.example.littlelemon.components

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.FixedScale

@Composable
fun ImageCopy(
    painter: Painter,
    contentDescription: String,
    modifier: Modifier = Modifier,
    contentScale: FixedScale = ContentScale.None
) {
    Image(
        painter = painter,
        contentDescription = contentDescription,
        modifier = modifier,
        contentScale = contentScale
    )
}