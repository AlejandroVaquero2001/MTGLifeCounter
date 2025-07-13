package com.example.mtglifecounter

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import kotlin.random.Random

fun rng(): Int {
    return Random.nextInt(1, 21)
}

@Composable
fun RngScreen2P(navController: NavController) {
    var playerStart by remember { mutableIntStateOf(0)}

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column {
                Image(
                    painter = painterResource(id = R.drawable.icon_rng),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.clickable { playerStart = rng() },
                )

                Text(
                    text = if (playerStart == 0) "" else "$playerStart",
                    fontSize = 30.sp,
                    color = Color.Black,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
                if (playerStart!=0){
                    Box(
                        modifier = Modifier
                            .width(200.dp)
                            .height(100.dp)
                            .border(2.dp, Color.Black)
                            .clickable {
                                navController.navigate("2P")
                            }
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.bg_logo),
                            contentDescription = null,
                            modifier = Modifier.matchParentSize()
                        )
                    }
                }
            }
            }
}

@Composable
fun RngScreen3P(navController: NavController) {
    var playerStart by remember { mutableIntStateOf(0)}

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column {
            Image(
                painter = painterResource(id = R.drawable.icon_rng),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.clickable { playerStart = rng() },
            )

            Text(
                text = if (playerStart == 0) "" else "$playerStart",
                fontSize = 30.sp,
                color = Color.Black,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            if (playerStart!=0){
                Box(
                    modifier = Modifier
                        .width(200.dp)
                        .height(100.dp)
                        .border(2.dp, Color.Black)
                        .clickable {
                            navController.navigate("3P")
                        }
                ){
                    Image(
                        painter = painterResource(id = R.drawable.bg_logo),
                        contentDescription = null,
                        modifier = Modifier.matchParentSize()
                    )
                }
            }
        }
    }
}
@Composable
fun RngScreen4P(navController: NavController) {
    var playerStart by remember { mutableIntStateOf(0)}

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column {
            Image(
                painter = painterResource(id = R.drawable.icon_rng),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.clickable { playerStart = rng() },
            )

            Text(
                text = if (playerStart == 0) "" else "$playerStart",
                fontSize = 30.sp,
                color = Color.Black,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            if (playerStart!=0){
                Box(
                    modifier = Modifier
                        .width(200.dp)
                        .height(100.dp)
                        .border(2.dp, Color.Black)
                        .clickable {
                            navController.navigate("4P")
                        }
                ){
                    Image(
                        painter = painterResource(id = R.drawable.bg_logo),
                        contentDescription = null,
                        modifier = Modifier.matchParentSize()
                    )
                }
            }
        }
    }
}



