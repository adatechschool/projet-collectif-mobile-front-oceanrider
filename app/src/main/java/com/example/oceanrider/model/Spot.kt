package com.example.oceanrider.model

import kotlinx.serialization.Serializable

@Serializable
data class Spot (val surfBreak: String, val address: String, val photos: String) {

}