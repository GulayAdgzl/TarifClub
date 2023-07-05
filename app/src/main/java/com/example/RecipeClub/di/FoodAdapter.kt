package com.example.RecipeClub.di

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.RecipeClub.data.network.FoodModel
import com.example.RecipeClub.databinding.FoodItemDesignBinding

class FoodAdapter:ListAdapter<FoodModel,FoodAdapter.FoodViewHolder>(DiffCallBack){

    override fun onCreateViewHolder(
        parent:ViewGroup,
        viewType: Int,
    ):FoodAdapter.FoodViewHolder{

    }
    override fun onBindViewHolder(holder:FoodAdapter.FoodViewHolder,position:Int){

    }
    class FoodViewHolder(private val binding:FoodItemDesignBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(food:FoodModel){
            binding.foodModel=food
            binding.executePendingBindings()
        }
    }
    //Static yapı-Her yerden ulaşılabilir yapı
    companion object DiffCallBack:DiffUtil.ItemCallback<FoodModel>(){
        override fun areItemsTheSame(oldItem: FoodModel, newItem: FoodModel): Boolean {
            return oldItem.idCategory==newItem.idCategory
        }

        override fun areContentsTheSame(oldItem: FoodModel, newItem: FoodModel): Boolean {
            return oldItem==newItem
        }

    }
}