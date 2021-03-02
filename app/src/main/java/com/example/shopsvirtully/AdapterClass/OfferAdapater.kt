package com.example.shopsvirtully.AdapterClass

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shopsvirtully.DataModal.OfferData
import com.example.shopsvirtully.R

class OfferAdapater(context: Context,var offer:ArrayList<OfferData>):RecyclerView.Adapter<OfferAdapater.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var offerimg=itemView.findViewById<ImageView>(R.id.iv_offer)
        var upertxt=itemView.findViewById<TextView>(R.id.tv_upertext)
        var lowertxt=itemView.findViewById<TextView>(R.id.tv_lower)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OfferAdapater.ViewHolder {
        var layoutInflater=LayoutInflater.from(parent?.context).inflate(R.layout.offer_row_data_home,parent,false)
        return ViewHolder(layoutInflater)
    }

    override fun onBindViewHolder(holder: OfferAdapater.ViewHolder, position: Int) {
        var offer:OfferData=offer[position]
        holder?.offerimg.setImageResource(offer.img)
        holder?.lowertxt.setText(offer.lowertxt)
        holder?.upertxt.setText(offer.upertxt)
    }

    override fun getItemCount(): Int {
        return offer.size

    }
}