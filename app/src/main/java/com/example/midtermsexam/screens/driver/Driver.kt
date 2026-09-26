package com.example.midtermsexam.screens.driver

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.midtermsexam.R

@Composable
fun DriverScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF1A1A19))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        //add back arrow pa
        Text(
            text = "Driver profile",
            color = Color.White,
            style = MaterialTheme.typography.headlineMedium,
            textAlign = TextAlign.Left,
            modifier = Modifier.fillMaxWidth()
            )
        HorizontalDivider(
            modifier = Modifier.padding(vertical = 8.dp),
            thickness = 1.dp,
            color = Color(0xFFB5B6A2)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "JR",
            color = Color(0xFF6EA6EB),
            style = MaterialTheme.typography.headlineLarge,
            textAlign = TextAlign.Center,
            modifier = Modifier.background(Color(0xFF032042), CircleShape).padding(20.dp).size(60.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Jomari Reyes",
            color = Color.White,
            style = MaterialTheme.typography.headlineMedium
        )
        Text(
            text = "Truck driver ⬤ Fleet 3",
            color = Color.LightGray,
            style = MaterialTheme.typography.headlineSmall
        )
        Row(
            modifier = Modifier.fillMaxWidth().padding(4.dp)
        ){
            Card(
                modifier = Modifier.weight(1f).fillMaxWidth().padding(2.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),
                colors = CardDefaults.elevatedCardColors(
                    containerColor = Color(0xFF151515)
                )
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()
                ){
                    Text(
                        text = "142",
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.titleMedium
                    )
                    Text(
                        text = "deliveries",
                        color = Color.LightGray,
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.bodySmall
                    )
                }
            }
            Card(
                modifier = Modifier.weight(1f).fillMaxWidth().padding(4.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),
                colors = CardDefaults.elevatedCardColors(
                    containerColor = Color(0xFF151515)
                )
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()
                ){
                    Text(
                        text = "4.9",
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.titleMedium
                    )
                    Text(
                        text = "rating",
                        color = Color.LightGray,
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.bodySmall
                    )
                }
            }
            Card(
                modifier = Modifier.weight(1f).fillMaxWidth().padding(4.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),
                colors = CardDefaults.elevatedCardColors(
                    containerColor = Color(0xFF151515)
                )
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()
                ){
                    Text(
                        text = "3 yrs",
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.titleMedium
                    )
                    Text(
                        text = "tenure",
                        color = Color.LightGray,
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.bodySmall
                    )
                }
            }
        }
        HorizontalDivider(
            modifier = Modifier.padding(vertical = 8.dp),
            thickness = 1.dp,
            color = Color(0xFFB5B6A2)
        )
        Row(
            modifier = Modifier.fillMaxWidth().padding(12.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(id = R.drawable.contact),
                contentDescription = "Contact",
                modifier = Modifier.weight(1f).size(20.dp)
            )
            Text(
                text = "Contact",
                color = Color.White,
                textAlign = TextAlign.Left,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.weight(4f)
            )
            Text(
                text = "+63 917 000 1234",
                color = Color.LightGray,
                textAlign = TextAlign.Right,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.weight(3f)
            )
        }
        HorizontalDivider(
            modifier = Modifier.padding(vertical = 8.dp),
            thickness = 1.dp,
            color = Color(0xFFB5B6A2)
        )
        Row(
            modifier = Modifier.fillMaxWidth().padding(12.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(id = R.drawable.license),
                contentDescription = "License",
                modifier = Modifier.weight(1f).size(20.dp)
            )
            Text(
                text = "License",
                color = Color.White,
                textAlign = TextAlign.Left,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.weight(4f)
            )
            Text(
                text = "Prof. Level 2",
                color = Color.LightGray,
                textAlign = TextAlign.Right,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.weight(3f)
            )
        }
        HorizontalDivider(
            modifier = Modifier.padding(vertical = 8.dp),
            thickness = 1.dp,
            color = Color(0xFFB5B6A2)
        )
        Row(
            modifier = Modifier.fillMaxWidth().padding(12.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(id = R.drawable.base),
                contentDescription = "Base",
                modifier = Modifier.weight(1f).size(20.dp)
            )
            Text(
                text = "Base",
                color = Color.White,
                textAlign = TextAlign.Left,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.weight(4f)
            )
            Text(
                text = "Angeles City",
                color = Color.LightGray,
                textAlign = TextAlign.Right,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.weight(3f)
            )
        }
        HorizontalDivider(
            modifier = Modifier.padding(vertical = 8.dp),
            thickness = 1.dp,
            color = Color(0xFFB5B6A2)
        )
    }
}

@Preview
@Composable
fun DriverScreenPreview(){
    DriverScreen()
}