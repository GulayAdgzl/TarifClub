package com.example.recipe.data.network


import com.example.recipe.domain.FoodResponse
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
//Base url olmak zorunda
//https://www.themealdb.com/api/json/v1/1/categories.php
//https://api.spoonacular.com/
private const val BASE_URL="https://canerture.com/api/harrypotterapp/"
private val moshi=Moshi.Builder().add(KotlinJsonAdapterFactory()).build()


//Retrofit veri akışını sağlar
private val retrofit= Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

interface FoodApiServices{
    @GET("all_data.php")
    suspend fun getFood():FoodResponse

}
object FoodApi{
    val retrofitService:FoodApiServices by lazy { retrofit.create(FoodApiServices::class.java)}
}

