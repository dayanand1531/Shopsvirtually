package com.example.shopsvirtully.Cart

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shopsvirtully.R
import org.w3c.dom.Text

class MyCartAdapter(context:Context,var productList: List<MyCartData>): RecyclerView.Adapter<MyCartAdapter.Viewholder>() {
    class Viewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var product_img=itemView.findViewById<ImageView>(R.id.iv_product_img_cart)
        var product_name=itemView.findViewById<TextView>(R.id.tv_product_name)
        var quntity=itemView.findViewById<TextView>(R.id.tv_quantity_cart)
        var price=itemView.findViewById<TextView>(R.id.tv_price_cart)
        var delete=itemView.findViewById<TextView>(R.id.iv_delete_cart)



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        var layoutInflater=LayoutInflater.from(parent.context).inflate(R.layout.fragment_my_cart,parent,false)
        return Viewholder(layoutInflater)

    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        var productList:MyCartData=productList[position]
        holder?.product_img.setImageResource(productList.productimg)
        holder?.product_name.setText(productList.product_name)
        holder?.quntity.setText(productList.quntity)
        holder?.price.setText(productList.price)
        holder?.delete.setOnClickListener(View.OnClickListener {

        })

    }

    override fun getItemCount(): Int {
        return productList.size

    }
}