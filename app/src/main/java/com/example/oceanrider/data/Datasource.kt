package com.example.oceanrider.data

import com.example.oceanrider.R
import com.example.oceanrider.model.Spot

class Datasource {
    fun loadSpots() : List<Spot> {
        return listOf<Spot>(
            Spot(R.string.spot1),
            Spot(R.string.spot2)
        )
    }
}