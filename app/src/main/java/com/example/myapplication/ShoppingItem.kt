package com.example.myapplication
// this bage defines
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shopping_items")
data class ShoppingItem(
    @ColumnInfo(name = "item_name")
    var name:String,
    @ColumnInfo(name = "item_ammount")
    var amount:String
){
    @PrimaryKey(autoGenerate = true)
    var id: Int? =null
}