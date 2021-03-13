package com.example.shopsvirtully.AdapterClass

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shopsvirtully.DataModal.LatestCollectionData
import com.example.shopsvirtully.R

class LatestCollection(var context: Context,var latestcollectionList: MutableList<LatestCollectionData>): RecyclerView.Adapter<LatestCollection.ViewHolder>() {
   // private lateinit var mycartViewModal: MycartViewModal
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var img=itemView.findViewById<ImageView>(R.id.iv_collection_img)
        var title=itemView.findViewById<TextView>(R.id.tv_collectiontypes)
        var discription=itemView.findViewById<TextView>(R.id.tv_discription_latest_collection)
        var ratingBar=itemView.findViewById<RatingBar>(R.id.rb_latest_collection)
        var price=itemView.findViewById<TextView>(R.id.tv_price_latest_collection)
        var addtoCart=itemView.findViewById<Button>(R.id.btn_add_cart_collection)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LatestCollection.ViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.latset_colection_resourec_data,parent,false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: LatestCollection.ViewHolder, position: Int) {

        var latestCollection:LatestCollectionData=latestcollectionList[position]
        holder?.img.setImageResource(latestCollection.image)
        holder?.title.setText(latestCollection.title)
        holder?.discription.setText(latestCollection.discription)
        holder?.price.setText(latestCollection.price)
        holder?.ratingBar.rating=latestCollection.ratingBar


    }

    override fun getItemCount(): Int {
        return latestcollectionList.size

    }
}