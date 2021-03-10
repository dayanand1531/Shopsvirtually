package com.example.shopsvirtully.Fragment

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import com.example.shopsvirtully.Dialog.ValidationFrom
import com.example.shopsvirtully.R
import com.example.shopsvirtully.databinding.FragmentLoginBinding


class Login : Fragment(),View.OnClickListener {
    private var _binding:FragmentLoginBinding?=null
    private val binding get() = _binding!!
    lateinit var email:EditText
    lateinit var emailerror:TextView
   var fragment:Fragment?=null
    var validationFrom=ValidationFrom()
    var myPreferenceKey="loginkey"
    var emailpreferance:String="email"
    lateinit var password:String
    lateinit var sharedPreferences: SharedPreferences


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      _binding= FragmentLoginBinding.inflate(inflater,container,false)
        var view =binding.root

        sharedPreferences= this.activity?.getSharedPreferences(myPreferenceKey,Context.MODE_PRIVATE)!!
        emailpreferance= sharedPreferences.getString(emailpreferance,null).toString()
        password= sharedPreferences.getString("password",null).toString()
        email=view.findViewById<EditText>(R.id.et_email_login)
        emailerror=view.findViewById<TextView>(R.id.tv_error_login)
      /*  if(isLogin()){
           fragment=Home()
            fragmentManager?.beginTransaction()?.replace(R.id.flcontext,Home())?.commit()
        }*/

        ValidationFrom().loginemail(email,emailerror)
        validationFrom.loginPassword(binding.etPassword,binding.tvErrorPassword)
        binding.btnResgiter.setOnClickListener(this)
        binding.btnLogin.setOnClickListener(this)
        binding.tvForgetPassword.setOnClickListener(this)

        return view
    }

    fun isLogin():Boolean {

        sharedPreferences= this.activity?.getSharedPreferences(myPreferenceKey, Context.MODE_PRIVATE)!!
        return sharedPreferences?.getString(emailpreferance,null)!=null
    }

    override fun onClick(v: View?) {
        when(v){
            binding.btnLogin ->{
                if (!(validationFrom.validationEmail(binding.etEmailLogin,binding.tvErrorLogin))&&
                    !(validationFrom.validationPassword(binding.etPassword,binding.tvErrorPassword))){
                   val   editor:SharedPreferences.Editor= sharedPreferences.edit()
                    editor.putString(emailpreferance,binding.etEmailLogin.text.toString() )
                    editor.putString("password",binding.etPassword.text.toString())
                    editor.commit()
                    return
                }
                fragment=Home()

            }

            binding.btnResgiter ->{
               fragment=com.example.shopsvirtully.Fragment.Sign_Up()
            }
            binding.tvForgetPassword ->{

               fragment=com.example.shopsvirtully.Fragment.Forgot_Password()

            }
        }
        fragment?.let { fragmentManager?.beginTransaction()?.replace(R.id.flcontext, it)?.commit() }
    }


}