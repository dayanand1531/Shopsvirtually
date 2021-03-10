package com.example.shopsvirtully.Fragment

import android.os.Bundle
import android.transition.AutoTransition
import android.transition.TransitionManager
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import com.example.shopsvirtully.Dialog.ValidationFrom
import com.example.shopsvirtully.databinding.FragmentCheckOutBinding



class Check_out : Fragment() {
    private var _binging:FragmentCheckOutBinding?=null
    private val binding get() = _binging!!
     var validationFrom=ValidationFrom()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
      _binging= FragmentCheckOutBinding.inflate(inflater,container,false)

        var view =binding.root

        binding.rgStep2.setOnCheckedChangeListener(object :RadioGroup.OnCheckedChangeListener {
            override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
                val radiobutton=checkedId
                var radiobuttonid=group?.checkedRadioButtonId

            }

        })

        binding.rbExistingaddressStep2.setOnClickListener(View.OnClickListener {
            binding.clAddress.visibility=View.GONE
            binding.spStep2.visibility=View.VISIBLE

        })

        binding.rbNewaddressStep2.setOnClickListener(View.OnClickListener {
            binding.clAddress.visibility=View.VISIBLE
            binding.spStep2.visibility=View.GONE
        })

        binding.rbExistingaddressStep3.setOnClickListener(View.OnClickListener {
            binding.clAddress2.visibility=View.GONE
            binding.spStep3.visibility=View.VISIBLE
        })

        binding.rbNewaddressStep3.setOnClickListener(View.OnClickListener {
            binding.clAddress2.visibility=View.VISIBLE
            binding.spStep3.visibility=View.GONE
        })
        binding.btnStep2Continue.setOnClickListener(View.OnClickListener {
            if (binding.lowerStep3.visibility==View.VISIBLE){
                TransitionManager.beginDelayedTransition(binding.cardview,AutoTransition())
                binding.lowerStep3.visibility=View.GONE
            }
            else{
                TransitionManager.beginDelayedTransition(binding.cardview,AutoTransition())
                binding.lowerStep3.visibility=View.VISIBLE
                binding.lowerStep2.visibility=View.GONE

            }
        })
        binding.btnStep3.setOnClickListener(View.OnClickListener {
            if (binding.clStep4Lower.visibility==View.VISIBLE){
                TransitionManager.beginDelayedTransition(binding.cardview,AutoTransition())
                binding.clStep4Lower.visibility=View.GONE
            }
            else{
                TransitionManager.beginDelayedTransition(binding.cardview,AutoTransition())
                binding.clStep4Lower.visibility=View.VISIBLE
                binding.lowerStep3.visibility=View.GONE

            }
        })
        binding.btnStep4.setOnClickListener(View.OnClickListener {
            if (binding.clLowerStep5.visibility==View.VISIBLE){
                TransitionManager.beginDelayedTransition(binding.cardview,AutoTransition())
                binding.clLowerStep5.visibility=View.GONE
            }
            else{
                TransitionManager.beginDelayedTransition(binding.cardview,AutoTransition())
                binding.clLowerStep5.visibility=View.VISIBLE
                binding.clStep4Lower.visibility=View.GONE

            }
        })
        binding.btnContinuStep5.setOnClickListener(View.OnClickListener {
            if (binding.lowerStep6.visibility==View.VISIBLE){
                TransitionManager.beginDelayedTransition(binding.cardview,AutoTransition())
                binding.lowerStep6.visibility=View.GONE
            }
            else{
                TransitionManager.beginDelayedTransition(binding.cardview,AutoTransition())
                binding.lowerStep6.visibility=View.VISIBLE
                binding.clLowerStep5.visibility=View.GONE

            }
        })


        binding.uperStep2.setOnClickListener(View.OnClickListener {
            if (binding.lowerStep2.visibility==View.VISIBLE){
                TransitionManager.beginDelayedTransition(binding.cardview,AutoTransition())
                binding.lowerStep2.visibility=View.GONE
            }
            else{
                TransitionManager.beginDelayedTransition(binding.cardview,AutoTransition())
                binding.lowerStep2.visibility=View.VISIBLE
                binding.clLowerStep5.visibility=View.GONE
                binding.lowerStep3.visibility=View.GONE
                binding.lowerStep6.visibility=View.GONE
                binding.clStep4Lower.visibility=View.GONE

            }
        })
       // step 2 validation
       validationFrom.signupfirstname(binding.etFirstNameStep2,binding.tvErrorFirstNameStep2)
        validationFrom.signuplastname(binding.etLastnameStep2,binding.tvErrorLastNameStep2)
        validationFrom.checkoutCompany(binding.etCompanyStep2,binding.tvCompanyErrorStep2)
        validationFrom.checOutaddress(binding.etAddress1Step2,binding.tvErrorAddressStep2)
        validationFrom.checOutCity(binding.erCityStep2,binding.tvErrorCityStep2)

        //step 3 validation
        validationFrom.signupfirstname(binding.etFirstnameStep3,binding.tvErrorFirstName)
        validationFrom.signuplastname(binding.etLastnameStep3,binding.tvErrorLastNameStep3)
        validationFrom.checkoutCompany(binding.etCompanyStep3,binding.tvCompanyError)
        validationFrom.checOutaddress(binding.etAddressStep3,binding.tvErrorAddressStep3)
        validationFrom.checOutCity(binding.etCityStep3,binding.tvErrorCityStep3)
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binging=null
    }

}