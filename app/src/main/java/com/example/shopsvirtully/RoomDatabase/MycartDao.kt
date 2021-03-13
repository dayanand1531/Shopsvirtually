package com.example.shopsvirtully.RoomDatabase

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.shopsvirtully.Cart.MyCartData

@Dao
interface MycartDao {
      @Insert(onConflict = OnConflictStrategy.REPLACE)
     fun addProduct(mycartdata: Mycart)

      @Query("Select * from MyCart")
      fun readCart():List<Mycart>
}