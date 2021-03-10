package com.example.shopsvirtully.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.shopsvirtully.Dialog.ValidationFrom
import com.example.shopsvirtully.R
import com.example.shopsvirtully.databinding.FragmentReviewWriteBinding


class Review_Write : Fragment() {
private var _binding:FragmentReviewWriteBinding?=null
    private val binding get() = _binding!!
    var validationFrom=ValidationFrom()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       _binding= FragmentReviewWriteBinding.inflate(inflater,container,false)
        var view=binding.root

        validationFrom.nameValidation(binding.etNameReview,binding.tvNameErrorReview)
        validationFrom.writeReview(binding.etReivweReview,binding.tvReviewError)
        return view
    }


}