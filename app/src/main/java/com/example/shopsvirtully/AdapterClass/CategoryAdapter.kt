package com.example.shopsvirtully.AdapterClass

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.shopsvirtully.DataModal.CategoryData
import com.example.shopsvirtully.R

class CategoryAdapter(context: Context,var categorylist:ArrayList<CategoryData>): RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
       var category_img=itemView.findViewById<ImageView>(R.id.iv_category)
        var title=itemView.findViewById<TextView>(R.id.tv_categoryname)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryAdapter.ViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.shop_by_categories,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoryAdapter.ViewHolder, position: Int) {
        var categoryData:CategoryData=categorylist[position]
        holder?.category_img.setImageResource(categoryData.category_image)
        holder?.title.setText(categoryData.category_name)
    }

    override fun getItemCount(): Int {
        return categorylist.size
    }
}