package com.example.recipe.ui.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.recipe.data.network.FoodApi
import com.example.recipe.data.network.FoodModel
import kotlinx.coroutines.launch


enum class RecipesApiStatus {
    LOADING,
    ERROR,
    DONE
}
enum class  FoodApiFilter( val filterWord:String){
    SHOW_GRY(filterWord = "Gry"),
    SHOW_HUFF(filterWord = "Huff"),
    SHOW_RAVEN(filterWord = "Raven"),
    SHOW_SLY(filterWord = "Sly")

}
class ListViewModel: ViewModel() {

    //Veri çekme aşamasındaki statelerimi kontrol-güncel tutma
    private val _status=MutableLiveData<RecipesApiStatus>()
    val status: LiveData<RecipesApiStatus>
      get()=_status

    private val _foods=MutableLiveData<List<FoodModel>>()
    val foods:LiveData<List<FoodModel>>
      get()=_foods

    // for Detail
    private val _navigateToSelectedFood=MutableLiveData<FoodModel?>()
    val navigateToSelectedFood:LiveData<FoodModel?>
       get() = _navigateToSelectedFood

    init {
        getFood()
    }
    //Tüm karakterleri çağırmak için kullandığım kısım
    private fun getFood() {
        viewModelScope.launch {
            _status.value=RecipesApiStatus.LOADING

            try {
                _foods.value=FoodApi.retrofitService.getFood().foods
                _status.value=RecipesApiStatus.DONE
            }catch (e:Exception){
                _status.value=RecipesApiStatus.ERROR
                _foods.value=ArrayList()
            }
        }
    }
     fun filterFood(filter:FoodApiFilter){
        viewModelScope.launch{
            _status.value=RecipesApiStatus.LOADING
            try {
                _foods.value=FoodApi.retrofitService.filterFood(filter.filterWord).foods
                _status.value=RecipesApiStatus.DONE
            }catch (e:Exception){
                _status.value=RecipesApiStatus.ERROR
                _foods.value=ArrayList()
            }


        }
    }
    //for detail
    fun displayFoodDetail(foodModel:FoodModel){
        _navigateToSelectedFood.value=foodModel

    }
//Veri gönderimi tamamlandı uyarısı ve bu gönderinin içerisi boşalt
    fun displayFoodDetailComplete(){
        _navigateToSelectedFood.value=null

    }
}