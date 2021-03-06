package com.example.climatyweather.model

import com.example.climatyweather.rest.WeatherRetrofitConfig

class MainRepository(private val retrofitService: WeatherRetrofitConfig) {

    fun fetchCity(city: String) = retrofitService.fetchCity(city)

    fun fetchLocationPhone(lat: String, lon: String) = retrofitService.fetchLocationPhone(lat, lon)
}