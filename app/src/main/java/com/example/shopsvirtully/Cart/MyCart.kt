package com.example.shopsvirtully.Cart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.shopsvirtully.R
import com.example.shopsvirtully.databinding.FragmentMyCartBinding


class MyCart : Fragment() {
    private var _binding:FragmentMyCartBinding?=null
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       _binding= FragmentMyCartBinding.inflate(inflater,container,false)
        var view=binding.root
        return view
    }
}