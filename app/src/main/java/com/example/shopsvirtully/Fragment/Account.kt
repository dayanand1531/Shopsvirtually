package com.example.shopsvirtully.Fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shopsvirtully.AdapterClass.AddressBookEntriesAdapater
import com.example.shopsvirtully.DataModal.AddressBookEntriesData
import com.example.shopsvirtully.R
import com.example.shopsvirtully.databinding.FragmentAccountBinding
import java.util.ArrayList


class Account : Fragment(),View.OnClickListener {
  private var _binding:FragmentAccountBinding?=null
    private val binding get()=_binding!!
  var fragment:Fragment?=null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding= FragmentAccountBinding.inflate(inflater,container,false)
        var view=binding.root
        binding.tvEditAccount.setOnClickListener(this)
        binding.tvPassword.setOnClickListener(this)
        binding.tvAddressBookMyaccount.setOnClickListener(this)
        binding.tvWishList.setOnClickListener(this)
        binding.tvOrderHistoryMyaccount.setOnClickListener(this)
        binding.tvDownloadMyaccount.setOnClickListener(this)
        binding.tvRewardPoint.setOnClickListener(this)
        binding.tvReturnsMyaccount.setOnClickListener(this)
        binding.tvTransaction.setOnClickListener(this)
        binding.tvPaymentProfile.setOnClickListener(this)
        binding.tvAffilateAccount.setOnClickListener(this)
        binding.tvNewsletter.setOnClickListener(this)
       /* binding.tvEditAccount.setOnClickListener(this)
        binding.tvEditAccount.setOnClickListener(this)
        binding.tvEditAccount.setOnClickListener(this)
        binding.tvEditAccount.setOnClickListener(this)
        binding.tvEditAccount.setOnClickListener(this)*/

        return view
    }

    override fun onClick(v: View?) {
       when(v?.id){
           R.id.tv_edit_account ->{
               fragment=EditeAddcount()
           }
           R.id.tv_password ->{
               fragment=ChangePassword()
           }
           R.id.tv_address_book_myaccount ->{
            Toast.makeText(context,"Empity",Toast.LENGTH_LONG).show()
           }
           R.id.tv_wish_list ->{
               Toast.makeText(context,"Empity",Toast.LENGTH_LONG).show()
           }
           R.id.tv_order_history_myaccount ->{
               Toast.makeText(context,"Empity",Toast.LENGTH_LONG).show()
           }
           R.id.tv_download_myaccount ->{
               Toast.makeText(context,"Empity",Toast.LENGTH_LONG).show()
           }
           R.id.tv_reward_point ->{
               Toast.makeText(context,"Empity",Toast.LENGTH_LONG).show()
           }
           R.id.tv_returns_myaccount ->{
               fragment=Product_return_dialog()
           }
           R.id.tv_transaction ->{
               Toast.makeText(context,"Empity",Toast.LENGTH_LONG).show()
           }
           R.id.tv_payment_profile ->{
               Toast.makeText(context,"Empity",Toast.LENGTH_LONG).show()
           }
           R.id.tv_affilate_account ->{
               fragment=MyAffiliateAccount()
           }
           R.id.tv_newsletters ->{
               fragment=Newsletter()
           }
          /* R.id.tv_edit_account ->{
               fragment=EditeAddcount()
           }
           R.id.tv_edit_account ->{
               fragment=EditeAddcount()
           }*/



       }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }


}