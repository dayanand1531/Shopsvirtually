package com.example.shopsvirtully.Fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shopsvirtully.AdapterClass.ViewCartTableAdapter
import com.example.shopsvirtully.DataModal.ViewCartTableModel
import com.example.shopsvirtully.R
import com.example.shopsvirtully.databinding.FragmentViewcartgiftBinding


class ViewCartGift : Fragment() {
    private var _binding:FragmentViewcartgiftBinding?=null
    private val binding get() = _binding!!
   public var productlist=ArrayList<ViewCartTableModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding= FragmentViewcartgiftBinding.inflate(inflater,container,false)
        var view=binding.root

        context?.let { cartTable(it,binding.rvTable) }
        return  view
    }

    fun cartTable(context: Context,recyclerView: RecyclerView){
        var viewCartTableAdapter=ViewCartTableAdapter(context,productlist)
        productlist.add(ViewCartTableModel(R.drawable.payment,
            null.toString(),"bedsheet","Single","65788","Tsgh120","jdkjdk78"))
        var layoutManager=LinearLayoutManager(activity)
        recyclerView.layoutManager=layoutManager
        recyclerView.adapter=viewCartTableAdapter
    }


}