package com.example.recipe.ui.detail

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.recipe.model.FoodModel

class DetailViewModel (food: FoodModel, app:Application):AndroidViewModel(app){
    private val _selectedFood=MutableLiveData<FoodModel>()
    val selectedFood:LiveData<FoodModel>
       get()=_selectedFood

    init {
        _selectedFood.value=food
    }
}