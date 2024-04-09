package com.xcelk.learntogether.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
 import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.xcelk.learntogether.R

@Composable
fun ComposeQuadrant(){
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f).fillMaxWidth()) {
            Quadrant(
                color = Color(0xFFEADDFF),
                title = stringResource(id = R.string.title1),
                description = stringResource(id = R.string.description1)
            )
            Quadrant(
                color = Color(0xFFD0BCFF),
                title = stringResource(id = R.string.title2),
                description = stringResource(id = R.string.description2)
            )
        }
        Row(Modifier.weight(1f).fillMaxWidth()) {
            Quadrant(
                color = Color(0xFFB69DF8),
                title = stringResource(id = R.string.title3),
                description = stringResource(id = R.string.description3)
            )
            Quadrant(
                color = Color(0xFFF6EDFF),
                title = stringResource(id = R.string.title4),
                description = stringResource(id = R.string.description3)
            )
        }
    }
}

@Composable
fun Quadrant(modifier: Modifier = Modifier, color: Color, title: String, description: String){
    Column(modifier = Modifier
        .fillMaxHeight(1f)
        .fillMaxWidth(0.5f)
        .background(color)
        .padding(16.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = title, fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom=16.dp))
        Text(text = description, textAlign = TextAlign.Justify)
    }
}