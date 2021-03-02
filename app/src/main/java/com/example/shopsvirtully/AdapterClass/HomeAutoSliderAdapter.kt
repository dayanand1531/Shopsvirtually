package com.example.shopsvirtully.AdapterClass

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageButton
import android.widget.ImageView
import com.example.shopsvirtully.DataModal.HomeAutoSlider
import com.example.shopsvirtully.R
import com.smarteist.autoimageslider.SliderViewAdapter

class HomeAutoSliderAdapter(context: Context,var list: MutableList<HomeAutoSlider>):
    SliderViewAdapter<HomeAutoSliderAdapter.Holder>() {
    class Holder(itemView: View?) : SliderViewAdapter.ViewHolder(itemView) {
     var  img= itemView?.findViewById<ImageView>(R.id.im_autoslider)

    }

    override fun onCreateViewHolder(parent: ViewGroup?): HomeAutoSliderAdapter.Holder {
        var view=LayoutInflater.from(parent?.context).inflate(R.layout.home_auto_slider_row_data,parent,false)
       return Holder(view);
    }

    override fun onBindViewHolder(viewHolder: Holder?, position: Int) {
        var img:HomeAutoSlider=list[position]
        viewHolder?.img?.setImageResource(img.image)

    }

    override fun getCount(): Int {
       return list.size
    }


}