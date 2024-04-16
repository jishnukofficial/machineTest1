package com.example.myapplication

import com.example.myapplication.model.LoginResponse
import okhttp3.Credentials
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Repository {

    private val apiService: ApiService

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("http://127.0.0.1:5000/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        apiService = retrofit.create(ApiService::class.java)
    }

    fun login(username: String, password: String): Call<LoginResponse> {
        // Assuming `apiService` is an instance of ApiService
        return apiService.login(username, password)
    }

}
