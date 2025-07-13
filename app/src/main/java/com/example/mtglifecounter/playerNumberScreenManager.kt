package com.example.mtglifecounter

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color


// PARA DOS BOTONES (ARRIBA Y ABAJO)
@SuppressLint("UnusedBoxWithConstraintsScope")
@Composable
fun TwoButtons() {
    BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
        val halfHeight = maxHeight / 2


        LifeCounterButton( //BOTON DE ARRIBA
            modifier = Modifier
                .align(Alignment.TopCenter)
                .fillMaxWidth()
                .rotate(180f)
                .height(halfHeight),
            bgPhotoId = R.drawable.bg_2players_p1
        )
        LifeCounterButton( //BOTON DE ABAJO
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .height(halfHeight),
            bgPhotoId = R.drawable.bg_2players_p2
        )
    }
}
// PARA TRES BOTONES DOS ARRIBA UNO ABAJO
@SuppressLint("UnusedBoxWithConstraintsScope")
@Composable
fun ThreeButtons() {
    BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
        val halfWidth = maxWidth / 2
        val halfHeight = maxHeight / 2

        LifeCounterButton( //BOTON DE ARRIBA (IZQUIERDA)
            modifier = Modifier
                .align(Alignment.TopStart)
                .rotate(180f)
                .size(halfWidth, halfHeight),
            bgPhotoId = R.drawable.bg_3players_p1
        )
        LifeCounterButton( //BOTON DE ARRIBA (DERECHA)
            modifier = Modifier
                .align(Alignment.TopEnd)
                .rotate(180f)
                .size(halfWidth, halfHeight),
            bgPhotoId = R.drawable.bg_3players_p3
        )
        LifeCounterButton( //BOTON DE ABAJO
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .size(maxWidth, halfHeight),
            bgPhotoId = R.drawable.bg_3players_p2
        )
    }
}
// PARA CUATRO BOTONES 2 ARRIBA DOS ABAJO
@SuppressLint("UnusedBoxWithConstraintsScope")
@Composable
fun FourButtons() {
    BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
        val halfWidth = maxWidth / 2
        val halfHeight = maxHeight / 2

        LifeCounterButton( //BOTON DE ARRIBA (IZQUIERDA)
            modifier = Modifier
                .size(halfWidth, halfHeight)
                .rotate(180f)
                .align(Alignment.TopStart),
            bgPhotoId = R.drawable.bg_4players_p1
        )
        LifeCounterButton( //BOTON DE ARRIBA (DERECHA)
            modifier = Modifier
                .size(halfWidth, halfHeight)
                .rotate(180f)
                .align(Alignment.TopEnd),
            bgPhotoId = R.drawable.bg_4players_p2
        )
        LifeCounterButton( //BOTON DE ABAJO (IZQUIERDA)
            modifier = Modifier
                .size(halfWidth, halfHeight)
                .align(Alignment.BottomStart),
            bgPhotoId = R.drawable.bg_4players_p3
        )
        LifeCounterButton( //BOTON DE ABAJO (DERECHA)
            modifier = Modifier
                .size(halfWidth, halfHeight)
                .align(Alignment.BottomEnd),
            bgPhotoId = R.drawable.bg_4players_p4
        )
    }
}