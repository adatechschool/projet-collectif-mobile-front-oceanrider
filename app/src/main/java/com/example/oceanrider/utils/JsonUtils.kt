package com.example.oceanrider.utils

import android.content.Context
import com.example.oceanrider.model.Spot
import org.json.JSONObject
import java.io.IOException

class JsonUtils {
    fun parseJSONFromAssets(context: Context, fileName: String): List<Spot>? {
        val spotsList = mutableListOf<Spot>()
        val json: String?
        return try {
            // Ouvrir le fichier JSON
            val inputStream = context.assets.open(fileName)

            // Lire le contenu du fichier en tant que chaîne JSON
            json = inputStream.bufferedReader().use { it.readText() }

            // Parser la chaîne JSON en un objet JSONObject
            val jsonObject = JSONObject(json)
            val recordsArray = jsonObject.getJSONArray("records")

            // Parcourir les éléments du tableau
            for (i in 0 until recordsArray.length()) {
                val spotObject = recordsArray.getJSONObject(i)
                val surfBreak = spotObject.getString("Surf Break")
                val address = spotObject.getString("Address")
                val photos = spotObject.getString("photos")
                spotsList.add(Spot(surfBreak, address, photos))
            }

            spotsList // Retourner la liste des spots

        } catch (e: IOException) {
            e.printStackTrace()
            null
        }
    }
}