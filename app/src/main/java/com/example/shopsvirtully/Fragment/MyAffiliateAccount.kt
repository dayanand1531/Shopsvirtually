package com.example.shopsvirtully.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.shopsvirtully.Dialog.ValidationFrom
import com.example.shopsvirtully.R
import com.example.shopsvirtully.databinding.FragmentMyAffiliateAccountBinding


class MyAffiliateAccount : Fragment() {
private var _binding:FragmentMyAffiliateAccountBinding?=null
    private val binding get() = _binding!!
    var validationFrom=ValidationFrom()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentMyAffiliateAccountBinding.inflate(inflater,container,false)
        var view=binding.root
        validationFrom.chequePayeevalidation(binding.etChequePayeeName,binding.tvChequePayError)
        validationFrom.chequePayeEmail(binding.etPaypalEmail,binding.tvErrorPaypalEmail)
        validationFrom.bankname(binding.etBankname,binding.tvBanknameError)
        validationFrom.branchNumber(binding.etBranchnumber,binding.tvBranchnumberError)
        validationFrom.swiftCode(binding.etSwiftCode,binding.tvSwiftcodeError)
        validationFrom.accountName(binding.etAccountName,binding.tvAccountNameErorr)
        validationFrom.accountNumber(binding.etAccountNumber,binding.tvAccountNumberError)

        binding.rbCheque.setOnClickListener(View.OnClickListener {
            binding.llPayeename.visibility=View.VISIBLE
            binding.llPayemail.visibility=View.GONE
            binding.clBankdetail.visibility=View.GONE
        })
        binding.rbPaypal.setOnClickListener(View.OnClickListener {
            binding.llPayeename.visibility=View.GONE
            binding.llPayemail.visibility=View.VISIBLE
            binding.clBankdetail.visibility=View.GONE
        })
        binding.rbBankTransfer.setOnClickListener(View.OnClickListener {
            binding.llPayeename.visibility=View.GONE
            binding.llPayemail.visibility=View.GONE
            binding.clBankdetail.visibility=View.VISIBLE
        })

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }


}