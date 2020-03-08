package com.tkpd.categoriesselection.data.api

import com.tkpd.categoriesselection.data.datamodel.PizzaData
import retrofit2.Call
import retrofit2.http.GET


interface PizzaApi {
    @GET("bins/3b0u2")
    fun getData(): Call<PizzaData>
}