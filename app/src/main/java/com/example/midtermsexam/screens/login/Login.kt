package com.example.midtermsexam.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.midtermsexam.R

@Composable
fun LoginScreen(onNavigate: () -> Unit){
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var signedin by remember { mutableStateOf(false) }
    var forgetpassword by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF1A1A19))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.delivery),
            contentDescription = "Delivery Truck",
            modifier = Modifier.background(Color(0xFF032042),(RoundedCornerShape(35.dp))).padding(30.dp).size(60.dp)
        )
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "Welcome Back",
            style = MaterialTheme.typography.headlineLarge,
            color = Color.White
        )
        Text(
            text = "Sign in to continue",
            style = MaterialTheme.typography.titleMedium,
            color = Color.LightGray
        )
        Spacer(modifier = Modifier.height(35.dp))
        Text(
            text = "Email",
            textAlign = TextAlign.Left,
            color = Color.White,
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            modifier = Modifier.fillMaxWidth(),
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color.White,
                unfocusedTextColor = Color.LightGray,
                focusedBorderColor = Color.White,
                unfocusedBorderColor = Color.LightGray
            )
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Password",
            textAlign = TextAlign.Left,
            color = Color.White,
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            modifier = Modifier.fillMaxWidth(),
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color.White,
                unfocusedTextColor = Color.LightGray,
                focusedBorderColor = Color.White,
                unfocusedBorderColor = Color.LightGray
            ),
            visualTransformation = PasswordVisualTransformation()
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {signedin = true},
            colors = ButtonColors(
                containerColor = Color(0xFF2A78D6),
                contentColor = Color.White,
                disabledContainerColor = Color(0xFF2A78D6),
                disabledContentColor = Color.White
            ),
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Sign in",
                color = Color.White,
                style = MaterialTheme.typography.bodyLarge
            )
        }
        TextButton(
            onClick = {forgetpassword = true}
        ) {
            Text(
                text = "Forgot password?",
                color = Color(0xFF2A78D6),
                style = MaterialTheme.typography.bodyLarge
            )
        }
        if(signedin){
            AlertDialog(
                onDismissRequest = {
                    signedin = false
                },
                title = {
                    Text("Signing in")
                },
                text = {
                    Column() {
                        Text("Logging in as $email")
                    }
                },
                confirmButton = {
                    Button(
                        onClick = {
                            signedin = false
                        },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2A78D6))
                    ){
                        Text("OK")
                    }
                },
                dismissButton = {
                    TextButton(
                        onClick = {
                            signedin = false
                        }
                    ) {
                        Text("Cancel")
                    }
                }
            )
        }
        if(forgetpassword){
            AlertDialog(
                onDismissRequest = {
                    forgetpassword = false
                },
                title = {
                    Text("Forget password")
                },
                text = {
                    Column() {
                        Text("Work in progress")
                    }
                },
                confirmButton = {
                    Button(
                        onClick = {
                            forgetpassword = false
                        },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2A78D6))
                    ){
                        Text("OK")
                    }
                },
                dismissButton = {
                    TextButton(
                        onClick = {
                            forgetpassword = false
                        }
                    ) {
                        Text("Cancel")
                    }
                }
            )
        }
    }
}

@Preview
@Composable
fun LoginScreenPreview(){
    LoginScreen(onNavigate = {})
}