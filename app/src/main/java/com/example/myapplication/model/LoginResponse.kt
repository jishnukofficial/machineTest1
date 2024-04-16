package com.example.myapplication.model

import com.google.gson.annotations.SerializedName

// LoginResponse data class
data class LoginResponse(
    @SerializedName("message")
    val message: String // Assuming your login response contains a message
)