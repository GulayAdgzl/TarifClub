package com.example.RecipeClub.ui.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.RecipeClub.domain.FoodModel


enum class RecipesApiStatus {
    LOADING,
    ERROR,
    DONE
}
class ListViewModel: ViewModel() {

    //Veri çekme aşamasındaki statelerimi kontrol-güncel tutma
    private val _status=MutableLiveData<RecipesApiStatus>()
    val status: LiveData<RecipesApiStatus>
      get()=_status

    private val _foods=MutableLiveData<List<FoodModel>>()
    val food:LiveData<List<FoodModel>>
    get()=_foods
}