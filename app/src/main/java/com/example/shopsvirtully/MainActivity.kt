package com.example.shopsvirtully

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.PopupMenu
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.example.shopsvirtully.Fragment.*
import com.example.shopsvirtully.Fragment.Login
import com.example.shopsvirtully.Fragment.Sign_Up
import com.example.shopsvirtully.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), View.OnClickListener {
 var binding:ActivityMainBinding?=null
    lateinit var tootbar: Toolbar
    lateinit var drawerLayout:DrawerLayout
    lateinit var navigationbar:NavigationView
    lateinit var toggle:ActionBarDrawerToggle
    var  fragment: Fragment?=null
   lateinit var contact:TextView
    lateinit var returns:TextView
    lateinit var sitemap:TextView
    lateinit var myaccount:TextView
    lateinit var orderhistory:TextView
    lateinit var newsletter:TextView
    lateinit var aboutus:TextView
    lateinit var cancellationpolicy:TextView
    lateinit var refund_Policy:TextView
    lateinit var term_Condition:TextView
    lateinit var brand:TextView
     lateinit var special:TextView
     lateinit var sharedPreferences:SharedPreferences
    var myPreferenceKey="loginkey"
    var emailpreferance:String="email"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        tootbar=findViewById(R.id.tootbar)
        drawerLayout=findViewById(R.id.drawer)
        navigationbar=findViewById(R.id.navigationview)
       contact=findViewById(R.id.tv_contact_us)
        returns=findViewById(R.id.tv_returns)
        sitemap=findViewById(R.id.tv_sitemap)
        myaccount=findViewById(R.id.tv_myaccount)
        orderhistory=findViewById(R.id.tv_order_history)
        newsletter=findViewById(R.id.tv_newsletters)
        aboutus=findViewById(R.id.tv_aboutus)
        cancellationpolicy=findViewById(R.id.tv_cancellation_policy)
        refund_Policy=findViewById(R.id.tv_refund_policy)
        term_Condition=findViewById(R.id.tv_termandconditio)
        brand=findViewById(R.id.tv_brands)
        special=findViewById(R.id.tv_special)
        toggle= ActionBarDrawerToggle(this,drawerLayout,
            R.string.open,
            R.string.close)
      drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        toggle.isDrawerIndicatorEnabled=true
        setSupportActionBar(tootbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        supportFragmentManager.beginTransaction().replace(R.id.flcontext,Home()).commit()
        navigationbar.setNavigationItemSelectedListener(object:NavigationView.OnNavigationItemSelectedListener{
            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                menuItemSelectAction(item)
                return true
            }
        })

        binding!!.ivLogo.setOnClickListener(View.OnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.flcontext,Product_return_dialog()).commit()
        })


         contact.setOnClickListener(this)
        returns.setOnClickListener(this)
        sitemap.setOnClickListener(this)
        myaccount.setOnClickListener(this)
        orderhistory.setOnClickListener(this)
        newsletter.setOnClickListener(this)
        aboutus.setOnClickListener(this)
        cancellationpolicy.setOnClickListener(this)
        refund_Policy.setOnClickListener(this)
        term_Condition.setOnClickListener(this)
        brand.setOnClickListener(this)
        special.setOnClickListener(this)
        binding!!.ivLogin.setOnClickListener(this)

    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menu_home -> {
            drawerLayout.openDrawer(GravityCompat.START)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    fun menuItemSelectAction(menuItem: MenuItem){


        when(menuItem.itemId){
            R.id.menu_home ->{
                fragment=Home()

            }
            R.id.menu_bedsheets ->{
                fragment=Bedsheets()
            }
            R.id.menu_hotel_lenin ->{
                fragment=HotalLenin()
            }
            R.id.menu_new_arrival -> {
                fragment=New_Arrivals()
            }
            R.id.menu_comfort -> {
                fragment=Comforters()
            }
            R.id.menu_cusion -> {
                fragment=Cushion_Covers()
            }
            R.id.menu_towels -> {
                fragment=Towels()
            }
            R.id.menu_skincare -> {
                fragment=Skin_care()
            }
            R.id.menu_contact -> {
                fragment=Contact()
            }
            R.id.menu_decorater -> {
                fragment=Decoraters()
            }
            R.id.call ->{
                intent=Intent(Intent.ACTION_DIAL)
                intent.setData(Uri.parse("tel:+255688301818"))
                startActivity(intent)
            }
            R.id.wishlist ->{
                Toast.makeText(applicationContext,"Wish List",Toast.LENGTH_LONG).show()
            }
            else -> {
                fragment=Home()
            }
        }
        supportFragmentManager.beginTransaction().replace(R.id.flcontext, fragment!!).commit()
        menuItem.setCheckable(true)
        setTitle(menuItem.title)
        drawerLayout.closeDrawers()


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.right_menu,menu)
        return true
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.tv_contact ->{
                fragment=Contact_us_dialog()
            }
            R.id.tv_returns ->{
                fragment=Product_return_dialog()
            }
            R.id.tv_sitemap ->{
                fragment= Sitemap()
            }
            R.id.tv_myaccount ->{
                fragment=Account()
            }
            R.id.tv_order_history->{
                Toast.makeText(applicationContext,"Order History Empity",Toast.LENGTH_LONG).show()
            }
            R.id.tv_newsletters ->{
                fragment=Newsletter()
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
            R.id.tv_termandconditio ->{
                fragment=Termandcondition()
            }
            R.id.tv_brands ->{
                Toast.makeText(applicationContext,"Brand  Empity",Toast.LENGTH_LONG).show()
            }
            R.id.tv_special ->{
                Toast.makeText(applicationContext,"Special Empity",Toast.LENGTH_LONG).show()
            }

            R.id.iv_login ->{
                loginMenu()

            }
            R.id.tv_contact ->{}
        }

        fragment?.let {
            supportFragmentManager?.beginTransaction()?.replace(R.id.flcontext,
                it)?.commit()
        }

    }

    fun loginMenu(){
        var popupMenu=PopupMenu(this, binding?.ivLogin)

        if (isLogin()){

            popupMenu.menuInflater.inflate(R.menu.after_login,popupMenu.menu)
            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
                when(item.itemId){
                    R.id.menu_hi -> {
                        Toast.makeText(this,"Hi",Toast.LENGTH_LONG).show()

                    }
                    R.id.menu_download -> {
                        Toast.makeText(this,"Empity Download",Toast.LENGTH_LONG).show()

                    }
                    R.id.menu_transation -> {
                        Toast.makeText(this,"Empity Transations",Toast.LENGTH_LONG).show()
                    }
                    R.id.menu_order_history -> {
                        Toast.makeText(this,"Empity Order history",Toast.LENGTH_LONG).show()
                    }
                    R.id.menu_myaccount -> {
                      fragment=Account()
                    }
                    R.id.menu_logout -> {
                    Toast.makeText(this,"Logout sucessfully",Toast.LENGTH_LONG).show()
                    }

                }
                fragment?.let {
                    supportFragmentManager.beginTransaction().replace(R.id.flcontext,
                        it).commit()}
                true
            })
            popupMenu.show()

        }
        else{
            popupMenu.menuInflater.inflate(R.menu.before_login,popupMenu.menu)
            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->

                when(item.itemId){
                    R.id.menu_login ->{
                        fragment=Login()

                    }
                    R.id.menu_register ->{
                       fragment=Sign_Up()
                    }

                }
                fragment?.let {
                    supportFragmentManager.beginTransaction().replace(R.id.flcontext,
                        it).commit()
                }

                true
            })
            popupMenu.show()

        }



    }

    fun isLogin():Boolean {
        sharedPreferences=getSharedPreferences(myPreferenceKey, Context.MODE_PRIVATE)
        return sharedPreferences.getString(emailpreferance,null)!=null
    }


}