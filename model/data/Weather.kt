package com.example.wapp.model.data

import android.os.Parcelable

@Parcelize
data class Weather(
    val city: City = getDefaultCity(),
    val temperature: Int = 0,
    val feelsLike: Int = 0,
) : Parcelable

fun getDefaultCity() = City("Москва", 55.5578, 37.61729)