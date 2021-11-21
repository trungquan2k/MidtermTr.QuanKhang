package com.example.jetrandomfood.data.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.jetrandomfood.R

@Entity(tableName="FoodDb")
data class FoodDbModel(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Long?,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "image") val image: Int

) {
//    companion object {
//    val DEFAULT_FOODS = listOf(
//        FoodDbModel(1, "Bánh mì", "150000", R.drawable.banhmi),
//        FoodDbModel(2, "Bánh bao", "120000", R.drawable.banhbao),
//        FoodDbModel(3, "Bún bò", "140000", R.drawable.bunbo),
//        FoodDbModel(4, "Bún rêu", "50000", R.drawable.bunreu),
//        FoodDbModel(5, "Mỳ quảng", "500000", R.drawable.miquang),
//        FoodDbModel(6, "Cơm tấm", "30000", R.drawable.comtam),
//        FoodDbModel(7, "Hủ tiếu", "120000", R.drawable.hutieu),
//        FoodDbModel(8, "Phở", "100000", R.drawable.pho),
//        FoodDbModel(9, "Xôi xéo", "90000", R.drawable.xoi),
//        FoodDbModel(10, "Sườn xào chua ngọt", "125000", R.drawable.suon_xao),
//        FoodDbModel(11, "Gà", "90000", R.drawable.ga),
//        FoodDbModel(12, "Bánh cuốn", "125000", R.drawable.banhcuong),
//    )
        companion object {
            val DEFAULT_FOODS = listOf(
                FoodDbModel(1, "Bánh mì",  R.drawable.banhmi),
                FoodDbModel(2, "Bánh bao",  R.drawable.banhbao),
                FoodDbModel(3, "Bún bò", R.drawable.bunbo),
                FoodDbModel(4, "Bún rêu",  R.drawable.bunreu),
                FoodDbModel(5, "Mỳ quảng",  R.drawable.miquang),
                FoodDbModel(6, "Cơm tấm",  R.drawable.comtam),
                FoodDbModel(7, "Hủ tiếu",  R.drawable.hutieu),
                FoodDbModel(8, "Phở",  R.drawable.pho),
                FoodDbModel(9, "Xôi xéo",  R.drawable.xoi),
                FoodDbModel(10, "Sườn xào chua ngọt",  R.drawable.suon_xao),
                FoodDbModel(11, "Gà",  R.drawable.ga),
                FoodDbModel(12, "Bánh cuốn",  R.drawable.banhcuong),
            )
}
}