package com.ppak.firstsmallprojectapplication.ramdomapi

import com.ppak.firstsmallprojectapplication.ramdommodel.RamdomModel
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RamdomApiClient {
    private val BASE_URL = "https://www.themealdb.com/api/json/v1/1/"

    private val ramdomApiInterface: RamdomApiInterface

    init {
        val retrofit=Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            ramdomApiInterface=retrofit.create(RamdomApiInterface::class.java)
    }

    fun getRamdomApi():Call<RamdomModel>{
        return ramdomApiInterface.getRamdom()
    }
}