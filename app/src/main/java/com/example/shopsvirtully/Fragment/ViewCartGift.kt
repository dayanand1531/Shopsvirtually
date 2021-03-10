package com.example.shopsvirtully.Fragment

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.transition.AutoTransition
import android.transition.TransitionManager
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shopsvirtully.AdapterClass.ViewCartTableAdapter
import com.example.shopsvirtully.DataModal.ViewCartTableModel
import com.example.shopsvirtully.Dialog.ValidationFrom
import com.example.shopsvirtully.R
import com.example.shopsvirtully.databinding.FragmentViewcartgiftBinding


class ViewCartGift : Fragment() {
    private var _binding:FragmentViewcartgiftBinding?=null
    private val binding get() = _binding!!
    var validationFrom=ValidationFrom()
    var productlist=ArrayList<ViewCartTableModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding= FragmentViewcartgiftBinding.inflate(inflater,container,false)
        var view=binding.root

        context?.let { cartTable(it,binding.rvTable) }

        validationFrom.checOutCoupon(binding.etCouponCode,binding.tvCouponError)  //validation
        validationFrom.checOutGiftCertifiCatecode(binding.etGiftcerification,binding.tvGiftcertifitacteError) //validation

        binding.uperStep2.setOnClickListener(View.OnClickListener {
            if (binding.lowerStep2.visibility==View.VISIBLE){
                TransitionManager.beginDelayedTransition(binding.cardview, AutoTransition())
                binding.lowerStep2.visibility=View.GONE


            }
            else{
                TransitionManager.beginDelayedTransition(binding.cardview, AutoTransition())
                binding.lowerStep2.visibility=View.VISIBLE
                binding.clEstlower.visibility=View.GONE
                binding.clLowerCardgift.visibility=View.GONE
                binding.lowerStep2.setBackgroundColor(ContextCompat.getColor(requireContext(),R.color.teal_200))

            }
        })

        binding.clEstUper.setOnClickListener(View.OnClickListener {
            if (binding.clEstlower.visibility==View.VISIBLE){
                TransitionManager.beginDelayedTransition(binding.cvEstimate,AutoTransition())
                binding.clEstlower.visibility=View.GONE



            }
            else{
                TransitionManager.beginDelayedTransition(binding.cvEstimate,AutoTransition())
                binding.clEstlower.visibility=View.VISIBLE
                binding.clLowerCardgift.visibility=View.GONE
                binding.lowerStep2.visibility=View.GONE
                binding.clEstUper.setBackgroundColor(ContextCompat.getColor(requireContext(),R.color.teal_200))

            }
        })

        binding.clUsergift.setOnClickListener(View.OnClickListener {
            if (binding.clLowerCardgift.visibility==View.VISIBLE){
                TransitionManager.beginDelayedTransition(binding.cvUsergift,AutoTransition())
                binding.clLowerCardgift.visibility=View.GONE


            }
            else{
                TransitionManager.beginDelayedTransition(binding.cvUsergift,AutoTransition())
                binding.clLowerCardgift.visibility=View.VISIBLE
                binding.clEstlower.visibility=View.GONE
                binding.lowerStep2.visibility=View.GONE
                binding.clUsergift.setBackgroundColor(ContextCompat.getColor(requireContext(),R.color.teal_200))

            }
        })
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