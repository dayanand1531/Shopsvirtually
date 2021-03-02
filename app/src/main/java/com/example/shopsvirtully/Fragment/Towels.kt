package com.example.shopsvirtully.Fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shopsvirtully.AdapterClass.LatestCollection
import com.example.shopsvirtully.DataModal.LatestCollectionData
import com.example.shopsvirtully.Dialog.FilterClass
import com.example.shopsvirtully.R
import com.example.shopsvirtully.databinding.FilterLayoutBinding
import com.example.shopsvirtully.databinding.FragmentTowelsBinding


class Towels : Fragment() {
    private var _binding:FragmentTowelsBinding?=null
    private val binding get() = _binding!!
    var towelsList=ArrayList<LatestCollectionData>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding= FragmentTowelsBinding.inflate(inflater,container,false)
        var filterbinding= FilterLayoutBinding.bind(binding.root)// binding filter layout
        var view=binding?.root
        context?.let { towels(it,binding.rvTowels) }
        context?.let { FilterClass().sort(it,filterbinding.spSorted) }  // Filter short list
        context?.let { FilterClass().show(it,filterbinding.spShow) }   //filter show no pages at time
        return view
    }
    fun towels(context: Context, collection_recyclervie: RecyclerView){
        towelsList.add(LatestCollectionData(R.drawable.bedsheet,
            "Bedsheets & Cusion",
            "Product Detail \n" +
                    "Bedsheet with four piller",
            "Tsh 85000 ",3.5f))
        towelsList.add(LatestCollectionData(R.drawable.cushion_cover,
            "Bedsheets & Cusion",
            "Product Detail \n" +
                    "Bedsheet with four piller",
            "Tsh 85000 ",3f))
        towelsList.add(LatestCollectionData(R.drawable.new_arrival,
            "Bedsheets & Cusion",
            "Product Detail \n" +
                    "Bedsheet with four piller",
            "Tsh 85000 ",4f))
        var latestCollection= LatestCollection(context, towelsList)
        var layoutManager= LinearLayoutManager(activity)
        layoutManager.orientation= LinearLayoutManager.HORIZONTAL
        collection_recyclervie.layoutManager=layoutManager
        collection_recyclervie.adapter=latestCollection
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }


}