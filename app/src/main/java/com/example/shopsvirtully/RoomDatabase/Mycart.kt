package com.example.shopsvirtully.RoomDatabase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="MyCart")
open class Mycart(
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    @ColumnInfo(name="product_img") val product_img:Int,
    @ColumnInfo(name="product_name") val product_name:String,
    @ColumnInfo(name="product_quantity") val product_quantity:Int,
    @ColumnInfo(name="product_price") val product_price:Int
) {
}