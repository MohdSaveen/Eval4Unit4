package com.example.eval4unit4

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class IdDTO(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("value")
	val value: String? = null
)