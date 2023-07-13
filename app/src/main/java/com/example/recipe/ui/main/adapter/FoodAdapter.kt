package com.example.recipe.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.recipe.model.FoodModel
import com.example.recipe.databinding.FoodItemDesignBinding

class FoodAdapter:ListAdapter<FoodModel, FoodAdapter.FoodViewHolder>(DiffCallBack){

    //detail for
    var onClick:(FoodModel)->Unit ={}

    override fun onCreateViewHolder(
        parent:ViewGroup,
        viewType: Int,
    ): FoodViewHolder {
        //ViewHolderin tanıtımı
        return FoodViewHolder(FoodItemDesignBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }
    override fun onBindViewHolder(holder: FoodViewHolder, position:Int){

        val food=getItem(position)
        holder.bind(food,onClick)
    }
    class FoodViewHolder(private val binding:FoodItemDesignBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(food: FoodModel, onClick:(FoodModel)->Unit ={}){
            binding.foodModel=food
            //view in oluşturma işlemi hızlandırma desteği
            binding.executePendingBindings()

            binding.root.setOnClickListener {
                onClick(food)
            }
        }
    }
    //Static yapı-Her yerden ulaşılabilir yapı
    companion object DiffCallBack:DiffUtil.ItemCallback<FoodModel>(){
        override fun areItemsTheSame(oldItem: FoodModel, newItem: FoodModel): Boolean {
            return oldItem.id==newItem.id
        }

        override fun areContentsTheSame(oldItem: FoodModel, newItem: FoodModel): Boolean {
            return oldItem==newItem
        }

    }
}