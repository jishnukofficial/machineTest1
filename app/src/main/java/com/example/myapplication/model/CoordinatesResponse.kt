package com.example.myapplication.model

import com.google.gson.annotations.SerializedName

data class CoordinatesResponse(
    @SerializedName("from")
    val from: Coordinate,
    @SerializedName("to")
    val to: Coordinate
)

data class Coordinate(
    @SerializedName("lat")
    val latitude: Double,
    @SerializedName("lng")
    val longitude: Double
)
