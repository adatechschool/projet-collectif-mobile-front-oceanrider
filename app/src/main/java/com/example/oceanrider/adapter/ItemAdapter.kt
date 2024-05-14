package com.example.oceanrider.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.oceanrider.R
import com.example.oceanrider.model.SurfResponse

class ItemAdapter(    private val context: Context,
                      private var spots: List<SurfResponse.Record>,
                      private val onButtonClick: (SurfResponse.Record) -> Unit
) : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val difficulty: TextView = itemView.findViewById(R.id.textView_difficulty)
        val destination: TextView = itemView.findViewById(R.id.textView_destination)
        val destinationStateCountry : TextView = itemView.findViewById(R.id.textView_country)
        val buttonSecond: Button = itemView.findViewById(R.id.button_second)
//        val photoUrl: ImageView = itemView.findViewById(R.id.imageView_photos)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val record = spots[position]
        val fields = record.fields
        holder.destination.text = fields.destination
        holder.destinationStateCountry.text = fields.destinationStateCountry
        holder.difficulty.text = "Difficulté : " + fields.difficultyLevel.toString()
        holder.buttonSecond.setOnClickListener {
            onButtonClick(record)
        }


//        if (fields.photos.isNotEmpty()) {
//            Glide.with(context)
//                .load(fields.photos[0].url)
//                .into(holder.photoUrl)
//        }
    }

    override fun getItemCount(): Int {
        return spots.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun updateData(newSpotsList: List<SurfResponse.Record>) {
        spots = newSpotsList // Mettez à jour la liste de spots dans votre adaptateur
        notifyDataSetChanged() // Notifiez à l'adaptateur que les données ont changé et que l'affichage doit être rafraîchi
    }

}