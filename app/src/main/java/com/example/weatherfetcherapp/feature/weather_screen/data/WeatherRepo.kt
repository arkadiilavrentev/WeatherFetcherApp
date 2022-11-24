package com.example.weatherfetcherapp.feature.weather_screen.data

interface WeatherRepo  {
    suspend fun getTemperature(): String
}