package com.xcelk.learntogether.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.xcelk.learntogether.R

@Composable
fun TaskManager(){
    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        CheckImage()
        Text3(text = "All tasks completed")
        Text4(text = "Nice work")
    }
}

@Composable
fun CheckImage(){
    Image(painter = painterResource(id = R.drawable.ic_task_completed), contentDescription = "Check validation")
}

@Composable
fun Text3(text: String){
    Text(text, fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 24.dp, bottom = 8.dp))
}

@Composable
fun Text4(text: String){
    Text(text, fontSize = 16.sp, )
}