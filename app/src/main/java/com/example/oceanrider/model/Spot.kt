package com.example.oceanrider.model

import kotlinx.serialization.Serializable

@Serializable
data class Spot(
    val id: String,
    val createdTime: String,
    val fields: Fields
)