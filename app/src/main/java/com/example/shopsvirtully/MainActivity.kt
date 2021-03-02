package com.example.shopsvirtully

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.example.shopsvirtully.Fragment.*
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    lateinit var tootbar: Toolbar
    lateinit var drawerLayout:DrawerLayout
    lateinit var navigationbar:NavigationView
    lateinit var toggle:ActionBarDrawerToggle
    var  fragment: Fragment?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tootbar=findViewById(R.id.tootbar)
        drawerLayout=findViewById(R.id.drawer)
        navigationbar=findViewById(R.id.navigationview)

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
            else -> {
                fragment=Home()
            }
        }
        supportFragmentManager.beginTransaction().replace(R.id.flcontext, fragment!!).commit()
        menuItem.setCheckable(true)
        setTitle(menuItem.title)
        drawerLayout.closeDrawers()


    }
}