package com.example.eval4unit4

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class TimezoneDTO(

	@field:SerializedName("offset")
	val offset: String? = null,

	@field:SerializedName("description")
	val description: String? = null
)