package com.example.recipe.domain

import com.example.recipe.model.FoodModel
import com.squareup.moshi.Json

data class FoodResponse (
    @Json(name ="harrypotter") var foods:List<FoodModel>,
    var succeess:Int
)