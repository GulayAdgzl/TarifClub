package com.example.RecipeClub.domain

import com.example.RecipeClub.data.network.FoodModel
import com.squareup.moshi.Json

data class FoodResponse (
    @Json(name ="meals") var foods:List<FoodModel>,
    var succee:Int
)