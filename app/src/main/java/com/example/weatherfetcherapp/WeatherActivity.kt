package com.example.weatherfetcherapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class WeatherActivity : AppCompatActivity() {

    private val weatherPresenter = WeatherPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)

        val TvTemperature = findViewById<TextView>(R.id.tvTemperature)
        TvTemperature.text = weatherPresenter.getTemperature("Температура пока не радует)")

        val btnWeatherBack = findViewById<Button>(R.id.btnMain)
        btnWeatherBack.setOnClickListener {
            Intent(this, MainActivity::class.java).also(::startActivity)
        }

        val btnWeatherForward = findViewById<Button>(R.id.btnWind)
        btnWeatherForward.setOnClickListener {
            Intent(this, WindActivity::class.java).also(::startActivity)
        }
    }
}