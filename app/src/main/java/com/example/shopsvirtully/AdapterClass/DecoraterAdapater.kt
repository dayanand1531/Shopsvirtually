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
import com.example.shopsvirtully.DataModal.DecoraterData
import com.example.shopsvirtully.DataModal.LatestCollectionData
import com.example.shopsvirtully.R

class DecoraterAdapater(var context: Context,var decoraterProduct:ArrayList<DecoraterData>): RecyclerView.Adapter<DecoraterAdapater.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var img=itemView.findViewById<ImageView>(R.id.iv_collection_img)
        var title=itemView.findViewById<TextView>(R.id.tv_collectiontypes)
        var discription=itemView.findViewById<TextView>(R.id.tv_discription_latest_collection)
        var ratingBar=itemView.findViewById<RatingBar>(R.id.rb_latest_collection)
        var price=itemView.findViewById<TextView>(R.id.tv_price_latest_collection)
        var addtoCart=itemView.findViewById<Button>(R.id.btn_add_cart_collection)

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DecoraterAdapater.ViewHolder {
        var view= LayoutInflater.from(parent.context).inflate(R.layout.latset_colection_resourec_data,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: DecoraterAdapater.ViewHolder, position: Int) {
        var latestCollection: DecoraterData=decoraterProduct[position]
        holder?.img.setImageResource(latestCollection.img)
        holder?.title.setText(latestCollection.title)
        holder?.discription.setText(latestCollection.description)
        holder?.price.setText(latestCollection.price)
        holder?.ratingBar.rating=latestCollection.ratingbar

    }

    override fun getItemCount(): Int {
        return decoraterProduct.size
    }
}