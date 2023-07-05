package com.example.RecipeClub.data.network


import com.example.RecipeClub.domain.FoodResponse
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET


//Base url olmak zorunda
//https://www.themealdb.com/api/json/v1/1/categories.php
//https://api.spoonacular.com/
private const val BASE_URL="https://www.themealdb.com"
private val moshi=Moshi.Builder().add(KotlinJsonAdapterFactory()).build()


//Retrofit veri akışını sağlar
private val retrofit= Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

interface RecipeApiServices{
    //@GET("/recipes/complexSearch")
    @GET("api/json/v1/1/list.php?i=list")
    suspend fun getFood():FoodResponse

}

