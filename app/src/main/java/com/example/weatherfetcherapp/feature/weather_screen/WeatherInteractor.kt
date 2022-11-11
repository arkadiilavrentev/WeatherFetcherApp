package com.example.weatherfetcherapp.feature.weather_screen

import com.example.weatherfetcherapp.feature.weather_screen.data.WeatherRepo

class WeatherInteractor(private val weatherRepo: WeatherRepo) {

    fun getWeather(): String {
        return weatherRepo.getTemperature()
    }
}