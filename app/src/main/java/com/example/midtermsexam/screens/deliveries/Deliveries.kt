package com.example.midtermsexam.screens.deliveries

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
fun DeliveriesScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF1A1A19))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.Top
        ) {
            Text(
                text = "Deliveries",
                color = Color.White,
                style = MaterialTheme.typography.headlineMedium,
                textAlign = TextAlign.Left,
                modifier = Modifier.weight(5f).fillMaxWidth()
            )
            Image(
                painter = painterResource(id = R.drawable.bell),
                contentDescription = "Bell",
                modifier = Modifier.weight(1f).size(30.dp)
            )
        }
        HorizontalDivider(
            modifier = Modifier.padding(vertical = 8.dp),
            thickness = 1.dp,
            color = Color(0xFFB5B6A2)
            //dapat nakasagad siya sa edges
        )
        //this card is for the first item
        Card(
        modifier = Modifier.fillMaxWidth().padding(4.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        colors = CardDefaults.elevatedCardColors(
            containerColor = Color(0xFF151515)
        )
        ) {
            Row(
                modifier = Modifier.fillMaxWidth().padding(12.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.gasblue),
                    contentDescription = "Gasoline Blue",
                    modifier = Modifier.weight(1f).background(Color(0xFF032042),(RoundedCornerShape(15.dp))).padding(15.dp).size(30.dp)
                )
                Column(
                    modifier = Modifier.weight(3f)
                ){
                    Text(
                        text = "Station 04 -\nAngeles",
                        color = Color.White,
                        style = MaterialTheme.typography.bodyLarge,
                        textAlign = TextAlign.Left,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Text(
                        text = "1,200L diesel ⬤ en route",
                        color = Color.LightGray,
                        style = MaterialTheme.typography.bodySmall,
                        textAlign = TextAlign.Left,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
                Text(
                    text = "on time",
                    color = Color(0XFF0D970C),
                    style = MaterialTheme.typography.bodySmall,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.weight(1f).fillMaxWidth().background(Color(0xFF11260F),RoundedCornerShape(35.dp))
                )
            }
        }
        // 2nd card item
        Card(
            modifier = Modifier.fillMaxWidth().padding(4.dp),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 6.dp
            ),
            colors = CardDefaults.elevatedCardColors(
                containerColor = Color(0xFF151515)
            )
        ) {
            Row(
                modifier = Modifier.fillMaxWidth().padding(12.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.gasorange),
                    contentDescription = "Gasoline Orange",
                    modifier = Modifier.weight(1f).background(Color(0xFF311A00),(RoundedCornerShape(15.dp))).padding(15.dp).size(30.dp)
                )
                Column(
                    modifier = Modifier.weight(3f)
                ){
                    Text(
                        text = "Station 11 -\nMabalacat",
                        color = Color.White,
                        style = MaterialTheme.typography.bodyLarge,
                        textAlign = TextAlign.Left,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Text(
                        text = "800L diesel ⬤\npending",
                        color = Color.LightGray,
                        style = MaterialTheme.typography.bodySmall,
                        textAlign = TextAlign.Left,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
                Text(
                    text = "delayed",
                    color = Color(0XFFD48D00),
                    style = MaterialTheme.typography.bodySmall,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.weight(1f).fillMaxWidth().background(Color(0xFF311A00),RoundedCornerShape(35.dp))
                )
            }
        }
        // third card item
        Card(
            modifier = Modifier.fillMaxWidth().padding(4.dp),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 6.dp
            ),
            colors = CardDefaults.elevatedCardColors(
                containerColor = Color(0xFF151515)
            )
        ) {
            Row(
                modifier = Modifier.fillMaxWidth().padding(12.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.gasblue),
                    contentDescription = "Gasoline Blue",
                    modifier = Modifier.weight(1f).background(Color(0xFF032042),(RoundedCornerShape(15.dp))).padding(15.dp).size(30.dp)
                )
                Column(
                    modifier = Modifier.weight(3f)
                ){
                    Text(
                        text = "Station 02 - San\nFernando",
                        color = Color.White,
                        style = MaterialTheme.typography.bodyLarge,
                        textAlign = TextAlign.Left,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Text(
                        text = "1,500L diesel ⬤\nscheduled",
                        color = Color.LightGray,
                        style = MaterialTheme.typography.bodySmall,
                        textAlign = TextAlign.Left,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
                Text(
                    text = "queued",
                    color = Color(0xFFB5B6A2),
                    style = MaterialTheme.typography.bodySmall,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.weight(1f).fillMaxWidth().border(1.dp, Color(0xFF222222), RoundedCornerShape(35.dp))
                )
            }
        }
    }
}

@Preview
@Composable
fun DeliveriesScreenPreview(){
    DeliveriesScreen()
}