package com.riteh.autoshare.responses.weather.forecast

data class Weather(
    val description: String,
    val icon: String,
    val id: Int,
    val main: String
)