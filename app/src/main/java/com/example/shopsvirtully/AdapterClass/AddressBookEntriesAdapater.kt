package com.example.shopsvirtully.AdapterClass

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shopsvirtully.DataModal.AddressBookEntriesData
import com.example.shopsvirtully.R

class AddressBookEntriesAdapater(context: Context, var accountlist:List<AddressBookEntriesData>): RecyclerView.Adapter<AddressBookEntriesAdapater.Viewholder>() {
    class Viewholder(itemView: View) :RecyclerView.ViewHolder(itemView) {
        var heading=itemView.findViewById<TextView>(R.id.tv_heading_account)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.address_book_entries_row_data,parent,false)
        return Viewholder(view)
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        var heading:AddressBookEntriesData=accountlist[position]
        holder?.heading.setText(heading.headling)
    }

    override fun getItemCount(): Int {
        return accountlist.size
    }
}