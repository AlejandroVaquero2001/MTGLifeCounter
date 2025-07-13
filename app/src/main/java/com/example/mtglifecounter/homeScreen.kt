package com.example.mtglifecounter

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController){
    Column (
            Modifier.
            fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
    ){
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.4f),
        ){
            Image(
                painter = painterResource(id = com.example.mtglifecounter.R.drawable.bg_logo),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.matchParentSize()
            )
        }
        Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .clickable{ navController.navigate("2P_RNG")}
        ){
            Image(
                painter = painterResource(id = com.example.mtglifecounter.R.drawable.bg_2players),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.matchParentSize()
            )
            Text(
                text = "2 JUGADORES",
                color = Color.White,
                modifier = Modifier.
                align(Alignment.Center),
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .clickable{ navController.navigate("3P_RNG")}
        ){
            Image(
                painter = painterResource(id = com.example.mtglifecounter.R.drawable.bg_3players),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.matchParentSize()
            )
            Text(
                text = "3 JUGADORES",
                color = Color.White,
                modifier = Modifier.
                align(Alignment.Center),
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,

                )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .clickable{ navController.navigate("4P_RNG")}
        ){
            Image(
                painter = painterResource(id = com.example.mtglifecounter.R.drawable.bg_4players),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.matchParentSize()
            )
            Text(
                text = "4JUGADORES",
                color = Color.White,
                modifier = Modifier.
                align(Alignment.Center),
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,

                )
        }

    }
}

