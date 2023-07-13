package com.example.recipe.data.network

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.parcelize.Parcelize


@Parcelize
data class FoodModel (
        val id:Int,
        val name:String,
        @Json (name = "image_url") val imageUrl:String,
        val house:String
):Parcelable