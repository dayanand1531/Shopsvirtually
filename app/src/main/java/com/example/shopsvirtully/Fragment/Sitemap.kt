package com.example.shopsvirtully.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.shopsvirtully.R
import com.example.shopsvirtully.databinding.FragmentSitemapBinding


class Sitemap : Fragment(),View.OnClickListener {
  private var _binding:FragmentSitemapBinding?=null
     val binding get() = _binding!!
    var fragment:Fragment?=null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding= FragmentSitemapBinding.inflate(layoutInflater,container,false)
        var view=binding.root

        binding.tvBedsheet.setOnClickListener(this)
        binding.tvHotalLenine.setOnClickListener(this)
        binding.tvNewArrival.setOnClickListener(this)
        binding.tvComforter.setOnClickListener(this)
        binding.tvCushionCover.setOnClickListener(this)
        binding.tvTowels.setOnClickListener(this)
        binding.tvSkinCare.setOnClickListener(this)
        binding.tvLuxurySkinCare.setOnClickListener(this)
        binding.tvDecoration.setOnClickListener(this)
        binding.tvMosquitosNets.setOnClickListener(this)
        binding.tvCurtain.setOnClickListener(this)
        binding.tvSpecialSitemap.setOnClickListener(this)
        binding.tvMyaccountSitemap.setOnClickListener(this)
        binding.tvAccountInformation.setOnClickListener(this)
        binding.tvPasswordChange.setOnClickListener(this)
        binding.tvAddressBook.setOnClickListener(this)
        binding.tvOrderHistorySitemap.setOnClickListener(this)
        binding.tvDownload.setOnClickListener(this)
        binding.tvViewCart.setOnClickListener(this)
        binding.tvCheckout.setOnClickListener(this)
        binding.tvSearch.setOnClickListener(this)
        binding.tvAboutUs.setOnClickListener(this)
        binding.tvCancellationPolicySitemap.setOnClickListener(this)
        binding.tvRefundPolicySiteMap.setOnClickListener(this)
        binding.tvTermAndCondition.setOnClickListener(this)
        binding.tvContactSiteMap.setOnClickListener(this)


        return view
    }

    override fun onClick(v: View?) {

        when(v?.id){
            R.id.tv_bedsheet ->{
                fragment=Bedsheets()
            }
            R.id.tv_hotal_lenine ->{
                fragment=HotalLenin()
            }
            R.id.tv_new_arrival ->{
                fragment=New_Arrivals()
            }
            R.id.tv_comforter ->{
                fragment=Comforters()
            }
            R.id.tv_cushion_cover ->{
                fragment=Cushion_Covers()
            }
            R.id.tv_towels ->{
                fragment=Towels()
            }
            R.id.tv_skin_care ->{
                fragment=Skin_care()
            }
            R.id.tv_luxury_skin_care ->{
                Toast.makeText(context,"Empity",Toast.LENGTH_LONG).show()
            }
            R.id.tv_decoration ->{
                fragment=Decoraters()
            }
            R.id.tv_mosquitos_nets ->{
                Toast.makeText(context,"Empity",Toast.LENGTH_LONG).show()
            }
            R.id.tv_curtain ->{
                Toast.makeText(context,"Empity",Toast.LENGTH_LONG).show()
            }
            R.id.tv_special ->{
                Toast.makeText(context,"Empity",Toast.LENGTH_LONG).show()
            }
            R.id.tv_myaccount_sitemap ->{
                fragment=Account()
            }
            R.id.tv_account_information ->{
                fragment=Account()
            }
            R.id.tv_password_change ->{
                fragment=ChangePassword()
            }
            R.id.tv_address_book ->{
                fragment= AddAddress()
            }
            R.id.tv_view_cart ->{
                fragment=ViewCartGift()
            }
            R.id.tv_checkout ->{
                Toast.makeText(context,"Empity",Toast.LENGTH_LONG).show()
            }
            R.id.tv_search ->{
                Toast.makeText(context,"Empity",Toast.LENGTH_LONG).show()
            }
            R.id.tv_aboutus ->{
                fragment=About_us_dialog()
            }
            R.id.tv_cancellation_policy ->{
                fragment=Cancellation_policy_dialog()
            }
            R.id.tv_refund_policy ->{
                fragment=Refund_Policy_Dialog()
            }
            R.id.tv_term_and_condition ->{
                fragment=Termandcondition()
            }
            R.id.tv_contact_site_map ->{
                fragment=Contact_us_dialog()

            }
        }



    }


    override fun onDestroyView() {
        super.onDestroyView()
          _binding=null
    }


}