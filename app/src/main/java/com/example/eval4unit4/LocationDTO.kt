package com.example.eval4unit4

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class LocationDTO(

	@field:SerializedName("street")
	val street: StreetDTO? = null,

	@field:SerializedName("city")
	val city: String? = null,

	@field:SerializedName("state")
	val state: String? = null,

	@field:SerializedName("country")
	val country: String? = null,

	@field:SerializedName("postcode")
	val postcode: Int? = null,

	@field:SerializedName("coordinates")
	val coordinates: CoordinatesDTO? = null,

	@field:SerializedName("timezone")
	val timezone: TimezoneDTO? = null
)