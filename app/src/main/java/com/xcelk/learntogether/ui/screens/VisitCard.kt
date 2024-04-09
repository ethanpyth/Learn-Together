package com.xcelk.learntogether.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.xcelk.learntogether.R

@Composable
fun VisitCard(){
    Information(name = stringResource(id = R.string.name), title = stringResource(id = R.string.title))
    Contact(numberPhone = "+243816205909", email = "excellencekawej@gmail.com", username = "@xcelk")
}

@Composable
fun Information(name: String, title: String){
    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = painterResource(id = R.drawable.android_logo), contentDescription = stringResource(id = R.string.imgDesc), modifier = Modifier.size(200.dp))
        Text(name, fontSize = 36.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
        Text(title, fontSize = 16.sp, textAlign = TextAlign.Justify, color = Color(0xFF3ddc84))
    }
}

@Composable
fun Contact(numberPhone: String, email: String, username : String){
    Column(verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.CenterHorizontally) {
        Row {
            Icon(Icons.Rounded.Email, contentDescription = "Icone d'email", tint = Color(0xFF3ddc84))
            Text(email, fontSize = 16.sp)
        }
        Row {
            Icon(
                Icons.Rounded.Share,
                contentDescription = "Icone de partage",
                tint = Color(0xFF3ddc84)
            )
            Text(username, fontSize = 16.sp)
        }
        Row(horizontalArrangement = Arrangement.Start) {
            Icon(Icons.Rounded.Phone, contentDescription = "Icone de telephone", tint = Color(0xFF3ddc84))
            Text(numberPhone, fontSize = 16.sp)
        }
    }
}