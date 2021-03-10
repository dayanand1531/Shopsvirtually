package com.example.shopsvirtully.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.shopsvirtully.Dialog.ValidationFrom
import com.example.shopsvirtully.R
import com.example.shopsvirtully.databinding.FragmentContactBinding


class Contact : Fragment() {
private  var _binding:FragmentContactBinding?=null
    private val binding get() = _binding!!
    var validationFrom=ValidationFrom()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       _binding= FragmentContactBinding.inflate(inflater,container,false)
        var view=binding.root
        validationFrom.nameValidation(binding.etName,binding.tvNameError)
        validationFrom.signupEmail(binding.etEmail,binding.tvEmailError)
        validationFrom.enquaryValidation(binding.etEnquary,binding.tvEnquaryError)
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }

}