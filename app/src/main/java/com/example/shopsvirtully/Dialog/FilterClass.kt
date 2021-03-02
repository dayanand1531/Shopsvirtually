package com.example.shopsvirtully.Dialog

import android.content.Context
import android.view.View
import android.widget.*

class FilterClass() {
    var sortby=arrayOf("Defaults","Name ( A - Z )","Name ( Z - A )","Price ( Low > High )","Price ( High > Low )"
        ,"Rating ( Highest )","Rating ( Lowest )",
    "Model ( A - Z )","Model ( Z - A )")
    var show= arrayOf(15,25,50,75,100)
    fun sort( context: Context, spinner: Spinner){
    var arrayAdapter = ArrayAdapter<Any?>(context,android.R.layout.simple_spinner_item,sortby)
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
       spinner.adapter=arrayAdapter

        spinner.onItemSelectedListener=object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(context,"Position"+parent?.getItemAtPosition(position),Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }
    }

    fun show(context: Context,showpage:Spinner){
        var arrayAdapter=ArrayAdapter<Any?>(context,android.R.layout.simple_spinner_item,show)
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        showpage.adapter=arrayAdapter
        showpage.onItemSelectedListener=object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
               Toast.makeText(context,"Position"+parent?.getItemAtPosition(position),Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }
    }
}