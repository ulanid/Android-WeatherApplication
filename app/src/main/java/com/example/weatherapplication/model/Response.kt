package com.example.weatherapplication.model

import com.google.gson.annotations.SerializedName

data class CurrentWeatherResponse(

	@field:SerializedName("current")
	val current: Current? = null,

	@field:SerializedName("location")
	val location: Location? = null
)

data class Condition(

	@field:SerializedName("icon")
	val icon: String? = null,

	@field:SerializedName("text")
	val text: String? = null
)

data class Location(

	@field:SerializedName("localtime")
	val localtime: String? = null,

	@field:SerializedName("country")
	val country: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("region")
	val region: String? = null,

	@field:SerializedName("tz_id")
	val tzId: String? = null
)

data class Current(

	@field:SerializedName("last_updated")
	val lastUpdated: String? = null,

	@field:SerializedName("temp_c")
	val tempC: Double? = null,

	@field:SerializedName("temp_f")
	val tempF: Double? = null,

	@field:SerializedName("condition")
	val condition: Condition? = null
)
