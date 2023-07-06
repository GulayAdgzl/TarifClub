package com.example.recipe.domain

import com.example.recipe.data.network.FoodModel
import com.squareup.moshi.Json

data class FoodResponse (
    @Json(name ="meals") var foods:List<FoodModel>,
    var succee:Int
)