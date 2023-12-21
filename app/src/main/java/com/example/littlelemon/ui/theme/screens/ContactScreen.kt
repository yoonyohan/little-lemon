package com.example.littlelemon.ui.theme.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemon.R
import com.example.littlelemon.components.FilledButton
import com.example.littlelemon.components.OutlinedTextFieldCopy
import com.example.littlelemon.components.TextCopy

@Composable
fun ContactScreen(
    modifier: Modifier
) {
    var emailOrPassword by rememberSaveable {
        mutableStateOf("")
    }


    Column(
        modifier = modifier
            .padding(top = 40.dp, start = 18.dp, end = 18.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        // Name field header
        TextCopy(
            modifier = Modifier
                .padding(vertical = 10.dp)
                .align(alignment = Alignment.Start),
            fontWeight = FontWeight.Medium,
            fontSize = 20.sp,
            text = stringResource(R.string.enter_your_name_in_your_real_life)
        )

        // Contact information field
        OutlinedTextFieldCopy(
            onValueChange = { emailOrPassword = it },
            valueUpdate = emailOrPassword,
            shape = 10.dp,
            labelText = "Mobile number or email",
            modifier = Modifier
                .padding(bottom = 10.dp)
                .fillMaxWidth()
        )

        // Sign Up Button
        FilledButton(
            onClick = { /*TODO*/ },
            text = stringResource(R.string.signup),
            modifier = Modifier
                .fillMaxWidth()
                .height(44.dp)
        )

        // Switch mobile or email
        TextCopy(
            modifier = Modifier.padding(10.dp).alpha(0.8f).align(alignment = Alignment.CenterHorizontally),
            fontSize = 10.sp,
            text = stringResource(R.string.use_mobile_number_instead)
        )

        Spacer(modifier = Modifier.height(450.dp))

        // Bottom Logo Text
        TextCopy(
            modifier = Modifier
                .padding(10.dp)
                .alpha(0.8f),
            fontSize = 15.sp,
            text = stringResource(R.string.little_lemon)
        )
    }
}