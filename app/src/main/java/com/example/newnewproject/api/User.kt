package com.example.newnewproject.api

import com.google.gson.annotations.SerializedName

data class User(
    val id: Long,
    @SerializedName("first_name")
    val firstName: String,
    @SerializedName("last_name")
    val lastName: String,
    val email: String,
    val avatar: String,
)
