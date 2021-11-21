package com.example.jetrandomfood.domain


const val NEW_FOOD_ID = -1L
const val IMAGE=1
/**
 * Model class that represents one Note
 */
data class FoodModel(
    val id: Long = NEW_FOOD_ID,
    val name: String = "",
    val image: Int = IMAGE,
)
