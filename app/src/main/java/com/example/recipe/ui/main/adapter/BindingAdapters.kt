package com.example.recipe.ui.main.adapter

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.recipe.R
import com.example.recipe.model.FoodModel
import com.example.recipe.ui.list.RecipesApiStatus

@BindingAdapter("listData")
fun bindRecyclerView(recyclerView: RecyclerView,data:List<FoodModel>?){
    val adapter=recyclerView.adapter as FoodAdapter
    adapter.submitList(data)
}
@BindingAdapter("foodApiStatus")
fun bindStatus(statusImageView: ImageView, status:RecipesApiStatus?){
    when(status){
        RecipesApiStatus.LOADING->{
            statusImageView.visibility= View.VISIBLE
            statusImageView.setImageResource(R.drawable.loading_animation)
        }
        RecipesApiStatus.DONE ->{
            statusImageView.visibility= View.GONE
        }
        else->{
            statusImageView.visibility=View.VISIBLE
            statusImageView.setImageResource(R.drawable.connect_error)
        }

    }
}
@BindingAdapter("imageUrl")
fun bindImage(imageView: ImageView,imageUrl:String?){
    imageUrl?.let {
        Glide.with(imageView.context).load(imageUrl).apply(
            RequestOptions().placeholder(R.drawable.loading_animation).error(R.drawable.broken)
            ).into(imageView)
    }
}