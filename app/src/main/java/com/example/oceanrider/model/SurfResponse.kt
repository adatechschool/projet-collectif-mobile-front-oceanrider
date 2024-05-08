package com.example.oceanrider.model


class SurfResponse {
    data class Photo(
        val id: String,
        val width: Int,
        val height: Int,
        val url: String,
        val filename: String,
        val size: Int,
        val type: String,
        val thumbnails: Thumbnails
    )

    data class Thumbnails(
        val small: ThumbnailDetails,
        val large: ThumbnailDetails,
        val full: ThumbnailDetails
    )

    data class ThumbnailDetails(
        val url: String,
        val width: Int,
        val height: Int
    )

    data class Fields(
        val Influencers: List<String>,
        val peakSurfSeasonEnds: String,
        val difficultyLevel: Int,
        val Destination: String,
        val Geocode: String,
        val surfBreak: List<String>,
        val magicSeaweedLink: String,
        val Photos: List<Photo>,
        val peakSurfSeasonBegins: String,
        val destinationStateCountry: String,
        val Address: String
    )

    data class Record(
        val id: String,
        val createdTime: String,
        val fields: Fields
    )

    data class SurfSpotsResponse(
        val records: List<Record>
    )

}