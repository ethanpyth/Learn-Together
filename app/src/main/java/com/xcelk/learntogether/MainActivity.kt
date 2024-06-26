package com.xcelk.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.xcelk.learntogether.ui.screens.ComposeArticle
import com.xcelk.learntogether.ui.screens.ComposeQuadrant
import com.xcelk.learntogether.ui.screens.TaskManager
import com.xcelk.learntogether.ui.screens.VisitCard
import com.xcelk.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFd2e8d4)
                ) {
                    ComposeQuadrant()
                }
            }
        }
    }
}
