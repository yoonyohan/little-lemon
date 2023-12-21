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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
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
        Text(
            text = "Enter your name in your real life",
            modifier = Modifier
                .padding(vertical = 10.dp).align(alignment = Alignment.Start),
            fontWeight = FontWeight.Medium,
            fontSize = 20.sp
        )
        Row(
            modifier = modifier.fillMaxWidth(1f)
        ) {
            OutlinedTextField(
                value = firstName,
                onValueChange = {firstName = it},
                shape = RoundedCornerShape(10.dp),
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
                        text = "First Name",
                        color = MaterialTheme.colorScheme.primary.copy(alpha = 0.5f)
                    )
                },
                modifier = Modifier
                    .padding(end = 3.dp, bottom = 10.dp)
                    .fillMaxWidth(0.5f)
            )
            OutlinedTextField(
                value = lastName,
                onValueChange = {lastName = it},
                shape = RoundedCornerShape(10.dp),
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
                        text = "Last Name",
                        color = MaterialTheme.colorScheme.primary.copy(alpha = 0.5f)
                    )
                },
                modifier = Modifier
                    .padding(start = 3.dp, bottom = 10.dp)
                    .fillMaxWidth(1f)

            )
        }

        Button(
            onClick = { navController.navigate(route = Locations.ContactScreen.name) },
            modifier = Modifier
                .fillMaxWidth()
                .height(44.dp)
        ) {
            Text(text = "Next")
        }

        Text(
            text = "Back",
            modifier = Modifier
                .padding(10.dp)
                .alpha(0.8f).clickable { navController.navigate(route = Locations.LogInScreen.name) }.align(alignment = Alignment.CenterHorizontally),
            fontWeight = FontWeight.Light,
            fontSize = 15.sp
        )

        Spacer(modifier = Modifier.height(450.dp))


        Text(
            text = "Little Lemon",
            modifier = Modifier
                .padding(10.dp)
                .alpha(0.8f)
                .align(alignment = Alignment.CenterHorizontally),
            fontWeight = FontWeight.Light,
            fontSize = 15.sp,
        )
    }
}