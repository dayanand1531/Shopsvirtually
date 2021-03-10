package com.example.shopsvirtully.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.shopsvirtully.Dialog.ValidationFrom
import com.example.shopsvirtully.R
import com.example.shopsvirtully.databinding.FragmentEditeAddcountBinding


class EditeAddcount : Fragment() {
    private var _binding:FragmentEditeAddcountBinding?=null
    private val binding get() = _binding!!
var validationFrom=ValidationFrom()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       _binding= FragmentEditeAddcountBinding.inflate(inflater,container,false)
        var view =binding.root
           validationFrom.signupfirstname(binding.etFirstnameEditaccount,binding.tvErrorFirstName)
        validationFrom.signuplastname(binding.etLastNameEditaccount,binding.tvErrorLastName)
        validationFrom.signupEmail(binding.etEmailEditAccount,binding.tvErrorEmailSignup)
        validationFrom.signuptelephone(binding.etTelephoneEditaccount,binding.tvErrorTelephone)
        return view
    }

}