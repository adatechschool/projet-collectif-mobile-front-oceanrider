package com.example.oceanrider.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.oceanrider.R
import com.example.oceanrider.model.Spot
import com.squareup.picasso.Picasso

class ItemAdapter(
    private val context: Context,
    private val dataset: List<Spot>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val surfBreak: TextView = view.findViewById(R.id.textView_surfBreak)
        val address: TextView = view.findViewById(R.id.textView_address)
        val photos: ImageView = view.findViewById(R.id.imageView_photos)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.surfBreak.text = item.surfBreak
        holder.address.text = item.address
        Picasso.get().load(item.photos).into(holder.photos)
    }
}