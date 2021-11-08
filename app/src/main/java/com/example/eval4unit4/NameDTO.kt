package com.example.eval4unit4

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class NameDTO(

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("first")
	val first: String? = null,

	@field:SerializedName("last")
	val last: String? = null
)