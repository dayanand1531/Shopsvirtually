package com.example.shopsvirtully.Fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shopsvirtully.AdapterClass.AddressBookEntriesAdapater
import com.example.shopsvirtully.DataModal.AddressBookEntriesData
import com.example.shopsvirtully.databinding.FragmentAccountBinding
import java.util.ArrayList


class Account : Fragment() {
  private var _binding:FragmentAccountBinding?=null
    private val binding get()=_binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding= FragmentAccountBinding.inflate(inflater,container,false)
        var view=binding.root

        return view
    }


}