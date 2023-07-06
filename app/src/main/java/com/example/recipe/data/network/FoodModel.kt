package com.example.recipe.data.network

import com.squareup.moshi.Json

data class FoodModel (
        val idCategory:Int,
        val strCategory:String,
        @Json (name = "strCategoryThumb") val strCategoryThumb:String,
        val strCategoryDescription:String
)