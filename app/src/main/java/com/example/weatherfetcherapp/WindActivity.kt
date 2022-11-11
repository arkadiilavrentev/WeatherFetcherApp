package com.example.weatherfetcherapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WindActivity : AppCompatActivity() {

    private val windPresenter = WindPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wind)

        val TvWind = findViewById<TextView>(R.id.tvWind)
        TvWind.text = windPresenter.getWind("Ветер есть, но мы его не замечаем")

        val BtnWindBack = findViewById<Button>(R.id.btnWeatherBack)
        BtnWindBack.setOnClickListener {
            Intent(this, WeatherActivity::class.java).also(::startActivity)
        }
    }

}