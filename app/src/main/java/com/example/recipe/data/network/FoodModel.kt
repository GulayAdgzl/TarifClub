package com.example.recipe.data.network

import com.squareup.moshi.Json

data class FoodModel (
        val id:Int,
        val name:String,
        @Json (name = "image_url") val imageUrl:String,
        val house:String
)