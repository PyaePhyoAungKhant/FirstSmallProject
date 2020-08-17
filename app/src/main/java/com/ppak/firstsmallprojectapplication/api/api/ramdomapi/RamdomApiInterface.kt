package com.ppak.firstsmallprojectapplication.ramdomapi

import com.ppak.firstsmallprojectapplication.ramdommodel.RamdomModel
import retrofit2.Call
import retrofit2.http.GET

interface RamdomApiInterface {
    @GET("random.php")
    fun getRamdom(): Call<RamdomModel>
}