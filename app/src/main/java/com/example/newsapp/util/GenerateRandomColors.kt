package com.example.newsapp.util

import androidx.compose.ui.graphics.Color
import kotlin.random.Random

class GenerateRandomColors {
    fun getRandomColor(): Color {
        val red = Random.nextInt(128, 256)
        val green = Random.nextInt(128, 256)
        val blue = Random.nextInt(128, 256)

        return Color(red, green, blue)
    }

}