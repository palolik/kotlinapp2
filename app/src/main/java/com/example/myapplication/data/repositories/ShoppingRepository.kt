package com.example.myapplication.data.repositories

import com.example.myapplication.data.db.ShoppingDatabase

class ShoppingRepository(
    private val db: ShoppingDatabase
) {
    suspend fun upsert(item: com.example.myapplication.ShoppingItem) = db.getShoppingDao().upsert(item)

    suspend fun delete(item: com.example.myapplication.ShoppingItem) = db.getShoppingDao().delete(item)

    fun getAllShoppingItems() = db.getShoppingDao().getAllShoppingItems()
}