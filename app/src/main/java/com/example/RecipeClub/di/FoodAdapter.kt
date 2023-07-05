package com.example.RecipeClub.di

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.RecipeClub.data.network.FoodModel

class FoodAdapter:ListAdapter<FoodModel,FoodAdapter.FoodViewHolder>(DiffCallBack){

    override fun onCreateViewHolder(
        parent:ViewGroup,
        viewType: Int,
    ):FoodAdapter.FoodViewHolder{

    }
    override fun onBindViewHolder(holder:FoodAdapter.FoodViewHolder,position:Int){

    }
    class FoodViewHolder(private val binding:):RecyclerView.ViewHolder(binding.root){

    }
}