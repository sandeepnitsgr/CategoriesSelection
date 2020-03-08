package com.tkpd.categoriesselection.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tkpd.categoriesselection.data.datamodel.PizzaData
import com.tkpd.categoriesselection.data.repository.VariantsRepository

class VariantViewModel : ViewModel(){

    private lateinit var pizzaData : MutableLiveData<PizzaData>

    init {
        val variantRepository = VariantsRepository()
        pizzaData = variantRepository.getVariants()
    }

    fun getData(): MutableLiveData<PizzaData> = pizzaData


}