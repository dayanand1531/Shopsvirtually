package com.example.shopsvirtully.RoomDatabase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Mycart::class],version = 1,exportSchema = false)
abstract class  MyCartDatabase:RoomDatabase() {
  //  abstract fun myCartDao():MycartDao

    companion object{
       /* @Volatile
        private var INSTANCE:MyCartDatabase?=null*/
        fun getdatabase(context: Context):MyCartDatabase{
            return Room.databaseBuilder(context,MyCartDatabase::class.java,"Ecart")
                .build()
        }
    }

    abstract  fun getMycartdao():MycartDao

}