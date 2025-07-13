package com.example.mtglifecounter

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun LifeCounterButton(modifier: Modifier = Modifier, bgPhotoId: Int) {
    var life by remember { mutableIntStateOf(40) }
    fun addLife(){
        life++
    }
    fun subtractLife(){
        life--
    }

    Column(modifier = modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .weight(0.75f)
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = bgPhotoId),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.matchParentSize()
            )
            Column(modifier = Modifier.fillMaxSize()) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .clickable { addLife() }
                )
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .clickable { subtractLife() }
                )
            }
            Text(
                text = "$life",
                modifier = Modifier.
                    align(Alignment.Center),
                fontSize = 100.sp,
                color = Color.White
            )
        }

        SpellsCastCounter(
            modifier = Modifier
                .weight(0.0833f)
                .fillMaxWidth()
        )
        PoisonCounters(
            modifier = Modifier
                .weight(0.0833f)
                .fillMaxWidth()
        )
        EnergyCounters(
            modifier = Modifier
                .weight(0.0833f)
                .fillMaxWidth()
        )
    }
}

@Composable
fun SpellsCastCounter(modifier: Modifier = Modifier) {
    var numberCast by remember { mutableIntStateOf(0) }
    Box(
        modifier = modifier
    ) {
        Image(
            painter = painterResource(id = R.drawable.donqui),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        )
    }

}
@Composable
fun PoisonCounters(modifier: Modifier = Modifier) {
    var numberPoison by remember { mutableIntStateOf(0) }
    Box(
        modifier = modifier
    ) {
        Image(
            painter = painterResource(id = R.drawable.bg_poisoncounters),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.matchParentSize()
        )
        Row() {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .clickable { numberPoison-- }
            )
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .clickable { numberPoison++ }
            )
        }
        Row(modifier = Modifier.align(Alignment.Center)) {
            Image(
                painter = painterResource(id = R.drawable.icon_poisoncounter),
                contentDescription = "Icono Poison Counters",
                modifier = Modifier.size(30.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "$numberPoison",
                fontSize = 30.sp,
                color = Color.Black
            )
        }
    }
}
@Composable
fun EnergyCounters(modifier: Modifier = Modifier) {
    var numberEnergy by remember { mutableIntStateOf(0) }

    Box(modifier = modifier) {
        Image(
            painter = painterResource(id = R.drawable.bg_energycounters),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.matchParentSize()
        )
        Row(modifier = Modifier.fillMaxSize()) {
            // Zona 1: -10
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .clickable { numberEnergy -= 10 }
            )
            // Zona 2: -1
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .clickable { numberEnergy -= 1 }
            )
            // Zona 3: +1
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .clickable { numberEnergy += 1 }
            )
            // Zona 4: +10
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .clickable { numberEnergy += 10 }
            )
        }
        Row(modifier = Modifier.align(Alignment.Center)) {
            Image(
                painter = painterResource(id = R.drawable.icon_energycounter),
                contentDescription = "Icono Poison Counters",
                modifier = Modifier.size(30.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "$numberEnergy",
                fontSize = 30.sp,
                color = Color.Black
            )
        }
    }
}