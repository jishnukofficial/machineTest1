package com.example.myapplication

import com.example.myapplication.model.CoordinatesResponse
import com.example.myapplication.model.LoginResponse
import okhttp3.Credentials

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {
   // @POST("login")
   /* fun login(@Body credentials: Credentials): Call<LoginResponse>
*/

    @FormUrlEncoded
    @POST("login")
    fun login(
        @Field("username") username: String,
        @Field("password") password: String
    ): Call<LoginResponse>
    @GET("coordinates")
    fun getCoordinates(): Call<CoordinatesResponse>
}
