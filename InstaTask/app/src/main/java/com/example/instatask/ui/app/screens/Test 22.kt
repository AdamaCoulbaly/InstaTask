package com.example.instatask.ui.app.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.instatask.ui.app.Components.topBar

@Composable
fun greeting2(openDrawer:()->Unit){
    Column(modifier = Modifier.fillMaxSize()){

        topBar(title = "Test22",   buttonIcon = Icons.Filled.Menu,onButtonClicked = {openDrawer()})
    Text(text = "hello Test22")
    }
}