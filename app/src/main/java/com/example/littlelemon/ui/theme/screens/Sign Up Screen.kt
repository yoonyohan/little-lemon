package com.example.littlelemon.ui.theme.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.navigation.NavHostController
import com.example.littlelemon.R
import com.example.littlelemon.components.FilledButton
import com.example.littlelemon.components.OutlinedTextFieldCopy
import com.example.littlelemon.components.TextCopy
import com.example.littlelemon.navigation.Locations

@Composable
fun SignUpSheet(
    modifier: Modifier,
    navController: NavHostController
) {
    var firstName by rememberSaveable {
        mutableStateOf("")
    }

    var lastName by rememberSaveable {
        mutableStateOf("")
    }

    Column(
        modifier = modifier
            .padding(top = 40.dp, start = 18.dp, end = 18.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        // Header
        TextCopy(
            modifier = Modifier
                .padding(vertical = 10.dp)
                .align(alignment = Alignment.Start),
            fontWeight = FontWeight.Medium,
            fontSize = 20.sp,
            text = stringResource(id = R.string.enter_your_name_in_your_real_life)
        )

        Row(
            modifier = modifier.fillMaxWidth(1f)
        ) {
            // First Name
            OutlinedTextFieldCopy(
                onValueChange = { firstName = it },
                valueUpdate = firstName,
                shape = 10.dp,
                labelText = stringResource(R.string.first_name),
                modifier = Modifier
                    .padding(end = 3.dp, bottom = 10.dp)
                    .fillMaxWidth(0.5f)
            )

            // Last name
            OutlinedTextFieldCopy(
                onValueChange = { lastName = it },
                valueUpdate = lastName,
                shape = 10.dp,
                labelText = stringResource(R.string.last_name),
                modifier = Modifier
                    .padding(start = 3.dp, bottom = 10.dp)
                    .fillMaxWidth(1f)
            )
        }

        // Next Button
        FilledButton(
            onClick = { navController.navigate(route = Locations.ContactScreen.name)  },
            text = stringResource(R.string.next),
            modifier = Modifier
                .fillMaxWidth()
                .height(44.dp)
        )

        // Go Back
        TextCopy(
            modifier = Modifier
                .padding(10.dp)
                .alpha(0.8f)
                .clickable { navController.navigate(route = Locations.LogInScreen.name) }
                .align(alignment = Alignment.CenterHorizontally),
            fontSize = 15.sp,
            text = stringResource(R.string.back),
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