package com.example.shopsvirtully.Fragment

import android.app.AlertDialog
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shopsvirtully.AdapterClass.*
import com.example.shopsvirtully.DataModal.*
import com.example.shopsvirtully.R
import com.example.shopsvirtully.databinding.BottombarBinding
import com.example.shopsvirtully.databinding.FragmentHomeBinding
import com.smarteist.autoimageslider.SliderView


class Home : Fragment() {
    private var _binding:FragmentHomeBinding?=null
    private val binding get() = _binding!!

    var list=ArrayList<HomeAutoSlider>()
    var offerlist=ArrayList<OfferData>()
    var category=ArrayList<CategoryData>()
    var latestcollectionlist=ArrayList<LatestCollectionData>()
    var sikecarelist=ArrayList<SkinCare_Data>()
    var decoraterlist=ArrayList<DecoraterData>()
    lateinit var offerr_recyclerview:RecyclerView
    lateinit var category_recyclerview:RecyclerView
    lateinit var collection_recyclerview:RecyclerView
    lateinit var skincare_recyclerview:RecyclerView
    lateinit var decorater_recyclerview:RecyclerView

    lateinit var aboutus:TextView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding= FragmentHomeBinding.inflate(inflater,container,false)  //View binding
        var view=binding.root //view binding
        var bottombarBinding=BottombarBinding.bind(binding.root)
        list.add(HomeAutoSlider(R.drawable.badsheet_red))
        list.add(HomeAutoSlider(R.drawable.white))
        list.add(HomeAutoSlider(R.drawable.ic_launcher_background))
        list.add(HomeAutoSlider(R.drawable.ic_launcher_foreground))



        var homeAutoSliderAdapter= context?.let { HomeAutoSliderAdapter(it,list) }
        var slider=view.findViewById<SliderView>(R.id.slider_view_home)

        offerr_recyclerview=view.findViewById(R.id.rv_offer)
        category_recyclerview=view.findViewById(R.id.rv_category)
        collection_recyclerview=view.findViewById(R.id.rv_latest_collection)
        skincare_recyclerview=view.findViewById(R.id.rv_skincare)
        decorater_recyclerview=view.findViewById(R.id.rv_decorater)
        aboutus=view.findViewById(R.id.tv_aboutus)
        var retunploicy=view.findViewById<TextView>(R.id.tv_refund_policy)

        bottombarBinding.tvCancellationPolicy.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {
                cancellationPolicy()
            }
        })

        aboutus.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {
            aboutUs()
            }
        })

        retunploicy.setOnClickListener(object :View.OnClickListener {
            override fun onClick(v: View?) {
                fragmentManager?.beginTransaction()?.replace(R.id.flcontext,ViewCartGift())?.commit()
            }

        })



       // slider?.autoCycleDirection(SliderView.LAYOUT_DIRECTION_LTR)
        homeAutoSliderAdapter?.let { slider.setSliderAdapter(it) }
       // slider?.scrollTimeInSec(3)
       // slider.isAutoCycle(true)
        slider.startAutoCycle()

        context?.let { offerData(offerr_recyclerview, it) } //offer
        context?.let { categoySlider(it,category_recyclerview) } //category
        context?.let { latestCollection(it,collection_recyclerview) }  //bedsheet collection
        skin_Care(context,skincare_recyclerview)
        decorater(context,decorater_recyclerview)
        return view
    }

    fun offerData(recyclerView: RecyclerView,context: Context){
        offerlist.add(OfferData(R.drawable.shippingcar,"Free Shipping","From $99.00"))
        offerlist.add(OfferData(R.drawable.money, "Money Guarantee", "30 days back"))
        offerlist.add(OfferData(R.drawable.payment,"Payment Method","Secure System"))
        offerlist.add(OfferData(R.drawable.support,"Online Support","24 hours on day"))
        offerlist.add(OfferData(R.drawable.safe,"100% Safe","Secure Shopping"))
        var offerAdapater=OfferAdapater(context,offerlist)
       /* recyclerView.hasFixedSize(true)*/
        var layoutManager=LinearLayoutManager(activity)
         layoutManager.orientation=LinearLayoutManager.HORIZONTAL
        recyclerView.layoutManager=layoutManager
        recyclerView.adapter=offerAdapater
    }

    fun categoySlider(context: Context, category_recyclerview: RecyclerView) {
        category.add(CategoryData(R.drawable.bedsheet,R.string.bedsheet))
        category.add(CategoryData(R.drawable.hotel_lenin,R.string.hotel_lenin))
        category.add(CategoryData(R.drawable.new_arrival,R.string.new_arrival))
        category.add(CategoryData(R.drawable.comforters,R.string.continu))
        category.add(CategoryData(R.drawable.cushion_cover,R.string.cushion))
        category.add(CategoryData(R.drawable.towels,R.string.towels))
        category.add(CategoryData(R.drawable.skin_care,R.string.skin))
        category.add(CategoryData(R.drawable.decoraters,R.string.decorater))
        var categoryAdapter= CategoryAdapter(context,category)
        var layoutManager=LinearLayoutManager(activity)
        layoutManager.orientation=LinearLayoutManager.HORIZONTAL
        category_recyclerview.layoutManager=layoutManager
        category_recyclerview.adapter=categoryAdapter

    }

    fun latestCollection(context: Context,collection_recyclervie:RecyclerView){
        latestcollectionlist.add(LatestCollectionData(R.drawable.bedsheet,
            "Bedsheets & Cusion",
            "Product Detail \n" +
                    "Bedsheet with four piller",
        "Tsh 85000 ",3.5f))
        latestcollectionlist.add(LatestCollectionData(R.drawable.cushion_cover,
            "Bedsheets & Cusion",
            "Product Detail \n" +
                    "Bedsheet with four piller",
            "Tsh 85000 ",3f))
        latestcollectionlist.add(LatestCollectionData(R.drawable.new_arrival,
            "Bedsheets & Cusion",
            "Product Detail \n" +
                    "Bedsheet with four piller",
            "Tsh 85000 ",4f))
        var latestCollection=LatestCollection(context,latestcollectionlist)
        var layoutManager=LinearLayoutManager(activity)
        layoutManager.orientation=LinearLayoutManager.HORIZONTAL
        collection_recyclervie.layoutManager=layoutManager
        collection_recyclervie.adapter=latestCollection
    }

    fun skin_Care(context: Context?, skincare_recyclerview: RecyclerView) {
        sikecarelist.add(SkinCare_Data(R.drawable.skin_care,
            "Skin care 100% natural",
        "This is good frodus \neassy to use",
        "Tsd 12000",4.0f))
        sikecarelist.add(SkinCare_Data(R.drawable.cushion_cover,
            "Skin care and Body care",
            "This is good your skin \nno sideeffect to use",
            "Tsd 15000",3.0f))
        var skincareAdapter= context?.let { SkinCare_Adapter(it,sikecarelist) }
        var layoutManager=LinearLayoutManager(activity)
        layoutManager.orientation=LinearLayoutManager.HORIZONTAL
        skincare_recyclerview.layoutManager=layoutManager
        skincare_recyclerview.adapter=skincareAdapter

    }

    fun decorater(context: Context?, decorater_recyclerview: RecyclerView) {
        decoraterlist.add(DecoraterData(R.drawable.decoraters,
            "Decoration Product",
            "This product is for decorate\n" +
                    "Create you inter",
        1.2f,"Tsd 50000"))
        decoraterlist.add(DecoraterData(R.drawable.skin_care,
            "Decoration Product",
            "This product is for decorate\n" +
                    "Create you inter",
            1.2f,"Tsd 50000"))
        var decoraterAdapater= context?.let { DecoraterAdapater(it,decoraterlist) }
        var layoutManager=LinearLayoutManager(activity)
        layoutManager.orientation=LinearLayoutManager.HORIZONTAL
        decorater_recyclerview.layoutManager=layoutManager
        decorater_recyclerview.adapter=decoraterAdapater

    }

    fun aboutUs(){
        var dialog:AlertDialog.Builder=AlertDialog.Builder(context)
        var view=layoutInflater.inflate(R.layout.aboutus_dialog,null)
        dialog.setView(view)
        var alertdialog=dialog.create()
        alertdialog.show()

    }
    fun cancellationPolicy(){
        var dialog:AlertDialog.Builder=AlertDialog.Builder(context)
        var view=layoutInflater.inflate(R.layout.cancellation_policy_dialog,null)
        dialog.setView(view)
        var alertdialog=dialog.create()
        alertdialog.show()

    }
    fun refundPloicy(){
        var dialog:AlertDialog.Builder=AlertDialog.Builder(context)
        var view=layoutInflater.inflate(R.layout.refund_policy_dialog,null)
        dialog.setView(view)
        var alertdialog=dialog.create()
        alertdialog.show()

    }


}