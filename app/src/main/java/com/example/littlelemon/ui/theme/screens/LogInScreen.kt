package com.example.littlelemon.ui.theme.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.littlelemon.R
import com.example.littlelemon.components.FilledButton
import com.example.littlelemon.components.ImageCopy
import com.example.littlelemon.components.OutLinedButtonCopy
import com.example.littlelemon.components.OutlinedTextFieldCopy
import com.example.littlelemon.components.TextCopy
import com.example.littlelemon.navigation.Locations

@Composable
fun LogInSheet(
    modifier: Modifier,
    navController: NavHostController
) {
    var email by rememberSaveable {
        mutableStateOf("")
    }

    var password by rememberSaveable {
        mutableStateOf("")
    }

    Column(
        modifier = modifier
            .padding(18.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ImageCopy(
            painter = painterResource(id = R.drawable.logotwo),
            contentDescription = stringResource(R.string.Logo_Title),
            modifier = Modifier.width(500.dp).height(100.dp)
        )

        Spacer(modifier = Modifier.height(70.dp))

        // Email
        OutlinedTextFieldCopy(
            onValueChange = { email = it },
            valueUpdate = email,
            shape = 10.dp,
            labelText = stringResource(R.string.mobile_number_or_email),
            modifier = Modifier
                .padding(top = 30.dp, bottom = 10.dp)
                .fillMaxWidth()
        )

        // Password
        OutlinedTextFieldCopy(
            onValueChange = { password = it },
            valueUpdate = password,
            shape = 10.dp,
            labelText = stringResource(R.string.password),
            modifier = Modifier
                .padding(bottom = 15.dp)
                .fillMaxWidth()
        )

        // LogIn Button
        FilledButton(
            onClick = { /*TODO*/ },
            text = stringResource(R.string.login),
            modifier = Modifier
                .fillMaxWidth()
                .height(44.dp)
        )

        // Forgot Password Text
        TextCopy(
            modifier = Modifier
                .padding(10.dp)
                .alpha(0.8f),
            fontSize = 15.sp,
            text = stringResource(R.string.forgot_password)
        )

        Spacer(modifier = Modifier.height(190.dp))

        // Create Account Button
        OutLinedButtonCopy(
            onclick = { navController.navigate(route = Locations.SignUpScreen.name) },
            text = stringResource(R.string.create_an_account),
            modifier = Modifier
                .fillMaxWidth()
                .height(44.dp)
        )

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