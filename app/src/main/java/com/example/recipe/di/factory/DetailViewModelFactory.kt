package com.example.recipe.di.factory

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.recipe.model.FoodModel
import com.example.recipe.ui.detail.DetailViewModel
import java.lang.IllegalArgumentException

class DetailViewModelFactory(private val foodModel: FoodModel, private val application: Application):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DetailViewModel::class.java))
            return DetailViewModel(foodModel,application) as T
        throw IllegalArgumentException("Unknown ViewModel class ")
    }
}