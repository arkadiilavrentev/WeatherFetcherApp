package com.example.weatherfetcherapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class WeatherActivity : AppCompatActivity() {

    private val weatherPresenter = WeatherPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)

        val TvTemperature = findViewById<TextView>(R.id.tvTemperature)
        TvTemperature.text = weatherPresenter.getWeather(UUID.randomUUID().toString())
    }
}