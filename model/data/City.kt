package com.example.wapp.model.data

import android.os.Parcelable

@Parcelize
data class City(
    val city: String,
    val lat: Double,
    val lon: Double
) : Parcelable

