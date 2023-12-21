package com.example.littlelemon.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.littlelemon.R
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
        Image(
            painter = painterResource(id = R.drawable.logotwo),
            contentDescription = stringResource(R.string.Logo_Title),
            modifier = Modifier
                .width(500.dp)
                .height(100.dp),
        )
        Spacer(modifier = Modifier.height(70.dp))

        OutlinedTextField(
            value = email,
            onValueChange = {email = it},
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
                              text = "Mobile number or email",
                              color = MaterialTheme.colorScheme.primary.copy(alpha = 0.5f)
                          )
            },
            modifier = Modifier
                .padding(top = 30.dp, bottom = 10.dp)
                .fillMaxWidth(),

        )
        OutlinedTextField(
            value = password,
            onValueChange = {password = it},
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
                    text = "Mobile number or email",
                    color = MaterialTheme.colorScheme.primary.copy(alpha = 0.5f)
                )
            },
            modifier = Modifier
                .padding(bottom = 15.dp)
                .fillMaxWidth()
        )
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .height(44.dp)
        ) {
            Text(text = "LogIn")
        }

        Text(
            text = "Forgot password?",
            modifier = Modifier
                .padding(10.dp)
                .alpha(0.8f),
            fontWeight = FontWeight.Light,
            fontSize = 15.sp
        )

        Spacer(modifier = Modifier.height(190.dp))

        OutlinedButton(
            onClick = { navController.navigate(route = Locations.SignUpScreen.name)},
            modifier = Modifier
                .fillMaxWidth()
                .height(44.dp)
        ) {
            Text(text = "Create an account")
        }
        Text(
            text = "Little Lemon",
            modifier = Modifier
                .padding(10.dp)
                .alpha(0.8f),
            fontWeight = FontWeight.Light,
            fontSize = 15.sp
        )
    }
}