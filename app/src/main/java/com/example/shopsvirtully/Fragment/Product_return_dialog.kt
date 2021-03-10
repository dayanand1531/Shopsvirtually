package com.example.shopsvirtully.Fragment

import android.app.DatePickerDialog
import android.app.DatePickerDialog.OnDateSetListener
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.DatePicker
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import com.example.shopsvirtully.Dialog.ValidationFrom
import com.example.shopsvirtully.R
import com.example.shopsvirtully.databinding.ProductReturnDialogBinding
import java.text.SimpleDateFormat
import java.util.*

class Product_return_dialog:Fragment() {
private var _binding:ProductReturnDialogBinding?=null
  private val binding get() = _binding!!
    var validationFrom=ValidationFrom()
    lateinit var datepicker:DatePickerDialog

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding=ProductReturnDialogBinding.inflate(inflater, container, false)
        var view=binding.root
      validationFrom.signupfirstname(binding.etFirstNameReturn,binding.tvErrorFirst)
        validationFrom.signuplastname(binding.etLastNameReturn,binding.tvLastnameErrorReturn)
        validationFrom.signupEmail(binding.etEmailReturn,binding.tvErrorEmailReturn)
        validationFrom.signuptelephone(binding.etTelephoneReturn,binding.tvTelephoneErrorReturn)
        validationFrom.orderID(binding.tvOrderId,binding.tvOrderIdError)
        validationFrom.product_Name(binding.etProductName,binding.etProductNameError)
        validationFrom.productCode(binding.etProductCode,binding.tvProductCodeError)
        validationFrom.quantity(binding.etQuantity,binding.tvQuantityError)

        validationFrom.signupfirstname(binding.etFirstNameReturn,binding.tvErrorFirst)
        validationFrom.signupfirstname(binding.etFirstNameReturn,binding.tvErrorFirst)
        defaultDate(binding.tvOrderDate)
        binding.ivDatePicker.setOnClickListener(View.OnClickListener {
            datePicker()
        })


    return view
    }

    @RequiresApi(Build.VERSION_CODES.N)
    fun datePicker(){
        val calendar=Calendar.getInstance()
        var year=calendar.get(Calendar.YEAR)
        var month=calendar.get(Calendar.MONTH)
        var day=calendar.get(Calendar.DAY_OF_MONTH)
        datepicker= DatePickerDialog(requireContext(),DatePickerDialog.OnDateSetListener{ view, year, month, dayOfMonth ->
            var monthes=month+1
         binding.tvOrderDate.setText(""+dayOfMonth+"/"+monthes+"/"+year)
        },year,month,day)

        datepicker.show()
    }

    fun defaultDate(date:TextView){
       var dates=DatePicker(requireContext())
        var day=dates.dayOfMonth
        var month=dates.month+1
        var year=dates.year

        date.setText(""+day+"/"+month+"/"+year)

    }
}