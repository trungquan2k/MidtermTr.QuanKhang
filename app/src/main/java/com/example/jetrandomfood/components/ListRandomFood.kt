package com.example.jetrandomfood.components


import android.widget.Toast

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.jetrandomfood.data.database.model.FoodDbModel
import com.example.jetrandomfood.ui.screen.ListDataRoom


import kotlin.random.Random


@Composable
fun ListRanDomFoods(){
    val foods= FoodDbModel.DEFAULT_FOODS
    // Get random id of 1 product in data
    val getFoodId=Random.nextInt(0,foods.size-1)
    // toast
    val context = LocalContext.current
    // check if get any id in data  list

    if(getFoodId != null){
        Column(){
            val randomFood= foods[getFoodId]
            ListDataRoom(food = randomFood)
        }
    }else{
        Toast.makeText(
            context,
            "Nothing",
            Toast.LENGTH_LONG,
        ).show()
    }
}


// Đây là trường hợp cho random nhiều dữ liệu
//    val getFoodID = List(2) { Random.nextInt(0,foods.size-1) }
//    if (getFoodID.size != null) {
//        Column() {
//            LazyColumn(modifier = Modifier.padding(10.dp)) {
//                items(getFoodID.size) { itemIndex ->
//                    // Create a variable that stores query objects by random id
//                    val randomElement = foods[getFoodID[itemIndex]]
//                    ListDataRoom(food = randomElement)
//                }
//            }
//        }
//    } else {
//        Toast.makeText(
//            context,
//            "Nothing",
//            Toast.LENGTH_LONG,
//        ).show()
//    }