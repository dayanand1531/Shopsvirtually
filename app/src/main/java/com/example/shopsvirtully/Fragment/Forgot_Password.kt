package com.example.shopsvirtully.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.shopsvirtully.Dialog.ValidationFrom
import com.example.shopsvirtully.R
import com.example.shopsvirtully.databinding.FragmentForgotPasswordBinding


class Forgot_Password : Fragment() {
    private var _binding:FragmentForgotPasswordBinding?=null
    private val binding get() = _binding!!
    var validationFrom= ValidationFrom()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentForgotPasswordBinding.inflate(inflater,container,false)
        var view=binding.root
        validationFrom.loginemail(binding!!.etEmailForgotpassword, binding!!.tvErrorForgotForemail)
        return view
    }


}