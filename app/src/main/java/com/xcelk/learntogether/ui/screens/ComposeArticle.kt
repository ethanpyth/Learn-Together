package com.xcelk.learntogether.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.xcelk.learntogether.R

@Composable
fun ComposeArticle(){
    Column {
        ImageCompose()
        Title(text = "Jetpack Compose tutorial")
        Text1(text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.")
        Text2(text = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.")
    }
}

@Composable
fun ImageCompose() {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Image(modifier = Modifier, painter = image, contentDescription = null, alignment = Alignment.TopStart)
}

@Composable
fun Title(text : String){
    Text(text, modifier = Modifier.padding(16.dp), fontSize = 24.sp)
}

@Composable
fun Text1(text : String){
    Text(text = text, modifier = Modifier.padding(start = 16.dp, end = 16.dp), textAlign = TextAlign.Justify)
}

@Composable
fun Text2(text : String){
    Text(text = text, modifier = Modifier.padding(16.dp), textAlign = TextAlign.Justify)
}

@Preview(showBackground = true)
@Composable
fun ImageComposePreview(){
    ImageCompose()
}
