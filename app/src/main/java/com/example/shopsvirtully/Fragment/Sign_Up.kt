package com.example.shopsvirtully.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.shopsvirtully.Dialog.ValidationFrom
import com.example.shopsvirtully.R
import com.example.shopsvirtully.databinding.FragmentSignUpBinding


class Sign_Up : Fragment() {
private var _binding:FragmentSignUpBinding?=null
    private val binding get() = _binding!!
    var validationFrom= ValidationFrom()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentSignUpBinding.inflate(inflater,container,false)
        var view=binding.root

        validationFrom.signupfirstname(binding!!.etFirstName, binding!!.tvErrorFirstName)
        validationFrom.signuplastname(binding!!.etLastName, binding!!.tvErrorLastName)
        validationFrom.signupEmail(binding!!.etEmailSignup, binding!!.tvErrorEmailSignup)
        validationFrom.signuptelephone(binding!!.etTelephone, binding!!.tvErrorTelephone)
        validationFrom.signupconfirmPassword(binding!!.etConfirmPassword, binding!!.tvErrorConfirmPassword)
        validationFrom.signupPassword(binding!!.etPasswordSignup, binding!!.tvErrorPasswordSignup)

        binding?.btnContinue?.setOnClickListener(View.OnClickListener {
            fragmentManager?.beginTransaction()?.replace(R.id.flcontext,ViewCartGift())?.commit()
        })

        return view

    }

}