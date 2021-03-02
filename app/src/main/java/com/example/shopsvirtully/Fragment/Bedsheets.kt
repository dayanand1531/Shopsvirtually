package com.example.shopsvirtully.Fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Spinner
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shopsvirtully.AdapterClass.LatestCollection
import com.example.shopsvirtully.DataModal.LatestCollectionData
import com.example.shopsvirtully.Dialog.FilterClass
import com.example.shopsvirtully.R
import com.example.shopsvirtully.databinding.BottombarBinding
import com.example.shopsvirtully.databinding.FilterLayoutBinding
import com.example.shopsvirtully.databinding.FragmentBedsheetsBinding


class Bedsheets : Fragment() {
    var bedsheetslist=ArrayList<LatestCollectionData>()

private var _binding:FragmentBedsheetsBinding?=null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding= FragmentBedsheetsBinding.inflate(inflater,container,false)
        val view=binding.root
        var placeholder=FilterLayoutBinding.bind(binding.root)  //Binding view Filter layout
        var bottombarBinding=BottombarBinding.bind(binding.root) //bottam binding root

        context?.let { bedsheetsCollection(it,binding.rvBedsheets) } // Method call for Bedsheets Recyclerview
        context?.let { FilterClass().sort(it,placeholder.spSorted) }  // Filter short list
        context?.let { FilterClass().show(it,placeholder.spShow) }   // Filter show no of page and item in view
        bottombarBinding.tvOrderHistory.setOnClickListener(View.OnClickListener {
            var fragment=Account()
            fragmentManager?.beginTransaction()?.replace(R.id.flcontext,fragment)?.commit()!!
        })

        return view
    }

    override fun onDestroyView() {
        _binding=null
        super.onDestroyView()
    }

    fun bedsheetsCollection(context: Context, collection_recyclervie: RecyclerView){
        bedsheetslist.add(LatestCollectionData(R.drawable.bedsheet,
            "Bedsheets & Cusion",
            "Product Detail \n" +
                    "Bedsheet with four piller",
            "Tsh 85000 ",3.5f))
        bedsheetslist.add(LatestCollectionData(R.drawable.cushion_cover,
            "Bedsheets & Cusion",
            "Product Detail \n" +
                    "Bedsheet with four piller",
            "Tsh 85000 ",3f))
        bedsheetslist.add(LatestCollectionData(R.drawable.new_arrival,
            "Bedsheets & Cusion",
            "Product Detail \n" +
                    "Bedsheet with four piller",
            "Tsh 85000 ",4f))
        var latestCollection= LatestCollection(context,bedsheetslist)
        var layoutManager= GridLayoutManager(activity,2)
        /*layoutManager.orientation= LinearLayoutManager.HORIZONTAL*/
        collection_recyclervie.layoutManager=layoutManager
        collection_recyclervie.adapter=latestCollection

    }

}