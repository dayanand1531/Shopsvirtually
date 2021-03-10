package com.example.shopsvirtully.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.shopsvirtully.Dialog.ValidationFrom
import com.example.shopsvirtully.R
import com.example.shopsvirtully.databinding.FragmentAddAddressBinding


class AddAddress : Fragment() {
    private var _binding:FragmentAddAddressBinding?=null
    private val binding get() = _binding!!
    var validationFrom=ValidationFrom()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding= FragmentAddAddressBinding.inflate(inflater,container,false)
        var view =binding.root

        validationFrom.signupfirstname(binding.etFirstNameAddress,binding.tvErrorFirstName)
        validationFrom.signuplastname(binding.etLastnameAddress,binding.tvErrorLastName)
        validationFrom.checOutaddress(binding.etAddress1Address,binding.tvErrorAddress1Address)
        validationFrom.checOutCity(binding.etCityAddress,binding.tvErrorCityAddress)

        /*validationFrom.signupfirstname(binding.etFirstNameAddress,binding.tvErrorFirstName)
        validationFrom.signupfirstname(binding.etFirstNameAddress,binding.tvErrorFirstName)
        validationFrom.signupfirstname(binding.etFirstNameAddress,binding.tvErrorFirstName)*/

        return view

    }


}