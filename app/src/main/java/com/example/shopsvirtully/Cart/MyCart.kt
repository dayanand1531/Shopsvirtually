package com.example.shopsvirtully.Cart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.shopsvirtully.databinding.FragmentMyCartBinding


class MyCart : Fragment() {
    private var _binding:FragmentMyCartBinding?=null
    private val binding get() = _binding!!
  //  private lateinit var mycartViewModal: MycartViewModal



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       _binding= FragmentMyCartBinding.inflate(inflater,container,false)
        var view=binding.root

      //  mycartViewModal=ViewModelProvider(this).get(MycartViewModal::class.java)
        //inserPorductTdatabase()
        return view
    }

   /* private fun inserPorductTdatabase() {
         val product_imge=MyCartData().productimg
             val product_name=MyCartData().product_name
         val product_quantity=MyCartData().quntity
             val price=MyCartData().price
                 val mycart=Mycart(0,product_imge,product_name,product_quantity,price)
        mycartViewModal.addMycartProduct(mycart)
    }*/
}