package com.example.RecipeClub.di

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.RecipeClub.data.network.FoodModel

@BindingAdapter("listData")
fun bindRecyclerView(recyclerView: RecyclerView,data:List<FoodModel>){
    val adapter=recyclerView.adapter as FoodAdapter
    adapter.submitList(data)
}