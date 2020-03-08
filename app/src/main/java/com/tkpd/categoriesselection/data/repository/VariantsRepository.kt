package com.tkpd.categoriesselection.data.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.tkpd.categoriesselection.data.api.PizzaApi
import com.tkpd.categoriesselection.data.api.RetrofitService
import com.tkpd.categoriesselection.data.datamodel.PizzaData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class VariantsRepository {

    private val variantApi : PizzaApi = RetrofitService.createService(PizzaApi::class.java)

    fun getVariants(): MutableLiveData<PizzaData> {
        val variantData = MutableLiveData<PizzaData>()

        variantApi.getData().enqueue(object : Callback<PizzaData>{
            override fun onFailure(call: Call<PizzaData>, t: Throwable) {
                variantData.value = PizzaData()
            }

            override fun onResponse(call: Call<PizzaData>, response: Response<PizzaData>) {
                if (response.isSuccessful) {
                    variantData.value = response.body()
                }
            }
        })
        return variantData
    }
}