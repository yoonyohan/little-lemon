package com.example.littlelemon.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp

@Composable
fun OutlinedTextFieldCopy(
    modifier: Modifier = Modifier,
    onValueChange: (String) -> Unit,
    valueUpdate: String,
    shape: Dp,
    labelText: String
) {
    OutlinedTextField(
        value = valueUpdate,
        onValueChange = {onValueChange(it)},
        shape = RoundedCornerShape(shape),
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color.Transparent,
            unfocusedContainerColor = Color.Transparent,
            disabledContainerColor = MaterialTheme.colorScheme.background,
            focusedIndicatorColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.7f),
            unfocusedIndicatorColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.4f)
        ),
        singleLine = true,
        label = {
            Text(
                text = labelText,
                color = MaterialTheme.colorScheme.primary.copy(alpha = 0.5f)
            )
        },
        modifier = modifier
    )
}