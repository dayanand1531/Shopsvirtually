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
import com.example.shopsvirtully.DataModal.BedSheetCollection_Data
import com.example.shopsvirtully.DataModal.LatestCollectionData
import com.example.shopsvirtully.R

class BedSheetsCollection_Adapter(context: Context,var bedsheetcollection:ArrayList<BedSheetCollection_Data>): RecyclerView.Adapter<BedSheetsCollection_Adapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var img=itemView.findViewById<ImageView>(R.id.iv_collection_img)
        var title=itemView.findViewById<TextView>(R.id.tv_collectiontypes)
        var discription=itemView.findViewById<TextView>(R.id.tv_discription_latest_collection)
        var ratingBar=itemView.findViewById<RatingBar>(R.id.rb_latest_collection)
        var price=itemView.findViewById<TextView>(R.id.tv_price_latest_collection)
        var addtoCart=itemView.findViewById<Button>(R.id.btn_add_cart_collection)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view= LayoutInflater.from(parent.context).inflate(R.layout.latset_colection_resourec_data,parent,false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var bedsheetcollectionData: BedSheetCollection_Data =bedsheetcollection[position]
        holder?.img.setImageResource( bedsheetcollectionData.image)
        holder?.title.setText( bedsheetcollectionData.title)
        holder?.discription.setText( bedsheetcollectionData.discription)
        holder?.price.setText( bedsheetcollectionData.price)
        holder?.ratingBar.rating= bedsheetcollectionData.ratingBar

    }

    override fun getItemCount(): Int {
        return bedsheetcollection.size

    }
}