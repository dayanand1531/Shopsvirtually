package com.example.shopsvirtully.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.shopsvirtully.Dialog.ValidationFrom
import com.example.shopsvirtully.R
import com.example.shopsvirtully.databinding.FragmentChangePasswordBinding


class ChangePassword : Fragment() {
    private var _binding:FragmentChangePasswordBinding?=null
    private val binding get() = _binding!!
    var validationFrom=ValidationFrom()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       _binding= FragmentChangePasswordBinding.inflate(inflater,container,false)
        var view =binding.root

        validationFrom.signupPassword(binding.etPasswordChangepassword,binding.tvErrorPasswordSignup)
        validationFrom.signupconfirmPassword(binding.etConfirmPasswordChangepassword,binding.tvErrorConfirmPassword)
        return view
    }


}