package com.pelp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.google.maps.android.compose.GoogleMap

@Composable
fun emergency(navController : NavController) {

    Column() {
        Box(/*modifier= Modifier.fillMaxSize()*/){
            GoogleMap(modifier=Modifier.size(400.dp)){

            }
        }
        Box(modifier= Modifier.height(50.dp)) {
            MenuTab(navController)
        }

        Box(modifier = Modifier
            .weight(0.8f)
            .background(MaterialTheme.colors.primaryVariant)
        ){
            MakeScrollComponents(navController)
        }
    }





   
}

