package com.example.recipe.di

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

import com.example.recipe.data.network.FoodModel
import com.example.recipe.databinding.FoodItemDesignBinding

class FoodAdapter:ListAdapter<FoodModel,FoodAdapter.FoodViewHolder>(DiffCallBack){

    override fun onCreateViewHolder(
        parent:ViewGroup,
        viewType: Int,
    ):FoodAdapter.FoodViewHolder{
        //ViewHolderin tanıtımı
        return FoodViewHolder(FoodItemDesignBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }
    override fun onBindViewHolder(holder:FoodViewHolder,position:Int){

        val food=getItem(position)
        holder.bind(food)
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