package com.example.shopsvirtully.AdapterClass

import android.content.ClipData
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shopsvirtully.DataModal.ViewCartTableModel
import com.example.shopsvirtully.R
import com.example.shopsvirtully.databinding.ViewCartItemDataBinding
import com.example.shopsvirtully.databinding.ViewCatHeaderBinding

class ViewCartTableAdapter(context: Context,var productlist:ArrayList<ViewCartTableModel>): RecyclerView.Adapter<ViewCartTableAdapter.ViewHolder>() {

  var header=0
    var item=1
    class ViewHolder(var binding:ViewCartItemDataBinding) : RecyclerView.ViewHolder(binding.root) {
      /*  var image=itemView.findViewById<TextView>(R.id.tv_image)
        var images=itemView.findViewById<ImageView>(R.id.iv_image)
        var product_name=itemView.findViewById<TextView>(R.id.tv_product_name)
        var model=itemView.findViewById<TextView>(R.id.tv_model)
        var quentity=itemView.findViewById<TextView>(R.id.tv_quentity)
        var unitprice=itemView.findViewById<TextView>(R.id.tv_unitprice)
        var total=itemView.findViewById<TextView>(R.id.tv_total)*/

    }

    class Holder(var binding1:ViewCatHeaderBinding):RecyclerView.ViewHolder(binding1.root){

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {
        var view=LayoutInflater.from(parent.context)
      /*  if (viewType==header){
             view=LayoutInflater.from(parent.context)
            var binding1=ViewCatHeaderBinding.inflate(view)

        }
     else {*/
   // var view=LayoutInflater.from(parent.context)
        var binding=ViewCartItemDataBinding.inflate(view)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var productlist:ViewCartTableModel=productlist[position]

     /*   if (holder instanceof ViewHolder){
            holder?.binding.tvImage.setText("Image")
            holder?.binding.tvProductName.setText("Product Name")
            holder?.binding.tvModel.setText("Modal")
            holder?.binding.tvQuentity.setText("Quentity")
            holder?.binding.tvUnitprice.setText("Unit Price")
            holder?.binding.tvTotal.setText("Total")
        }
        else{*/
            holder?.binding.ivImage.setImageResource(productlist.image)
            holder?.binding.tvProductName.setText(productlist.product_name)
            holder?.binding.tvModel.setText(productlist.model)
            holder?.binding.tvQuentity.setText(productlist.qunity)
            holder?.binding.tvUnitprice.setText(productlist.unit_price)
            holder?.binding.tvTotal.setText(productlist.total)


    }

    override fun getItemCount(): Int {
        return productlist.size

    }

}