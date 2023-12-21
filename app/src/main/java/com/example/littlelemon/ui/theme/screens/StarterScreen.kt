package com.example.littlelemon.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.littlelemon.R
import com.example.littlelemon.navigation.Locations
import kotlinx.coroutines.delay

// Started screen for first and all launches
@Composable
fun StarterScreen(
    modifier: Modifier,
    navController: NavHostController
) {
    val isFirstLaunched = rememberSaveable {
        mutableStateOf(true)
    }


    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = stringResource(R.string.Logo_Title),
            modifier = Modifier.size(300.dp),
        )
    }

    // Show Login and sign up screen when user enter the app first time
    if (isFirstLaunched.value) {
        LaunchedEffect(Unit) {
            delay(3000) // Delay 1 second
            isFirstLaunched.value = true
        }

        navController.navigate(route = Locations.LogInScreen.name) // After delay the bottom sheet  is going to display
    }
}