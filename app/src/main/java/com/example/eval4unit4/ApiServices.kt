package com.example.eval4unit4

import retrofit2.Call
import retrofit2.http.GET

interface ApiServices {

    @GET("/api/")
    fun getUserDetails():Call<ResponseDTO>

}