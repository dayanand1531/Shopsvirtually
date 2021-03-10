package com.example.shopsvirtully.Dialog

import android.text.Editable
import android.text.TextWatcher
import android.util.Patterns
import android.view.View
import android.widget.EditText
import android.widget.TextSwitcher
import android.widget.TextView
import com.example.shopsvirtully.Fragment.ChangePassword

class ValidationFrom {
lateinit var passwordtx:String
    fun loginemail(email:EditText,emailerror: TextView){
        email.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                validationEmail(email,emailerror)
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })

    }
    fun loginPassword(password: EditText,passworderror: TextView){
        password.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
               validationPassword(password,passworderror)
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
    }

   /* fun loginpassword(password: EditText,passworderror: TextView){
        password.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
               validationPassword(passwordtx,passworderror)
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
    }*/

    fun signupfirstname(firstname: EditText,firstnameerror: TextView){
        firstname.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
               validationFirstname(firstname,firstnameerror)
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
    }

    fun signuplastname(firstname: EditText,firstnameerror: TextView){
        firstname.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                validationlastname(firstname,firstnameerror)
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
    }

    fun signupEmail(firstname: EditText,firstnameerror: TextView){
        firstname.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                validationEmail(firstname,firstnameerror)
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
    }

    fun signuptelephone(firstname: EditText,firstnameerror: TextView){
        firstname.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                validationTelephone(firstname,firstnameerror)
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
    }

    fun signupconfirmPassword(firstname: EditText,firstnameerror: TextView){
        firstname.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                validationConfirmPassword(firstname,firstnameerror)
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
    }
    fun signupPassword(firstname: EditText,firstnameerror: TextView){
        firstname.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                validationPassword(firstname,firstnameerror)
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
    }



    fun checOutCoupon(firstname: EditText,firstnameerror: TextView){
        firstname.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                validationCoupon(firstname,firstnameerror)
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
    }

    fun checOutGiftCertifiCatecode(firstname: EditText,firstnameerror: TextView){
        firstname.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                validationGiftCertificate(firstname,firstnameerror)
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
    }

    fun checkoutCompany(firstname: EditText,firstnameerror: TextView){
        firstname.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                validationCompany(firstname,firstnameerror)
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
    }
    fun checOutaddress(firstname: EditText,firstnameerror: TextView){
        firstname.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                validationAddressOne(firstname,firstnameerror)
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
    }

    fun checOutCity(firstname: EditText,firstnameerror: TextView){
        firstname.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                validationCity(firstname,firstnameerror)
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
    }

    fun nameValidation(firstname: EditText,firstnameerror: TextView){
        firstname.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                validationYourName(firstname,firstnameerror)
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
    }

    fun enquaryValidation(firstname: EditText,firstnameerror: TextView){
        firstname.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                validationEnquary(firstname,firstnameerror)
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
    }

    fun chequePayeevalidation(firstname: EditText,firstnameerror: TextView){
        firstname.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                validationChequePayeerName(firstname,firstnameerror)
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
    }

    fun chequePayeEmail(firstname: EditText,firstnameerror: TextView){
        firstname.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                validationPaypalEmail(firstname,firstnameerror)
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
    }

    fun bankname(firstname: EditText,firstnameerror: TextView){
        firstname.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                validationBankName(firstname,firstnameerror)
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
    }

    fun branchNumber(firstname: EditText,firstnameerror: TextView){
        firstname.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                validationBranchNumber(firstname,firstnameerror)
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
    }

    fun swiftCode(firstname: EditText,firstnameerror: TextView){
        firstname.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                validationSWIFTCode(firstname,firstnameerror)
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
    }

    fun accountName(firstname: EditText,firstnameerror: TextView){
        firstname.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                validationAccountName(firstname,firstnameerror)
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
    }

    fun accountNumber(firstname: EditText,firstnameerror: TextView){
        firstname.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                validationAccountNumber(firstname,firstnameerror)
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
    }

    fun writeReview(firstname: EditText,firstnameerror: TextView){
        firstname.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                validationReview(firstname,firstnameerror)
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
    }

    fun product_Name(firstname: EditText,firstnameerror: TextView){
        firstname.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                validationProduct_Name(firstname,firstnameerror)
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
    }
    fun productCode(firstname: EditText,firstnameerror: TextView){
        firstname.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                validationProductCode(firstname,firstnameerror)
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
    }
    fun orderID(firstname: EditText,firstnameerror: TextView){
        firstname.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                validationOrderId(firstname,firstnameerror)
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
    }
    fun quantity(firstname: EditText,firstnameerror: TextView){
        firstname.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                validationQuantity(firstname,firstnameerror)
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
    }

    fun validationEmail( email:EditText,emailerror:TextView):Boolean {
        var emails = email.text.toString().trim()
        if (emails.isEmpty()) {
            emailerror.visibility = View.VISIBLE
            emailerror.text = "* Please enter valid e-mail."
            return false
        } else if (!Patterns.EMAIL_ADDRESS.matcher(emails).matches()) {
            emailerror.visibility = View.VISIBLE
            emailerror.text = "* Please enter valid e-mail."

            return false
        } else {
            emailerror.visibility = View.GONE
            emailerror.text = ""
            return true

        }
    }
    fun validationPassword( password:EditText,passworderror:TextView):Boolean {
           passwordtx=password.text.toString().trim()
        if (passwordtx.isEmpty()) {
           passworderror.visibility = View.VISIBLE
           passworderror.text = "* Please enter Password."
            return false
        } else if (passwordtx.trim().length<5) {
            passworderror.visibility = View.VISIBLE
            passworderror.text = "* Password must be five characters."

            return false
        } else {
           passworderror.visibility = View.GONE
           passworderror.text = ""
            return true

        }
    }
    fun validationFirstname( firstname:EditText,firstnameerror:TextView):Boolean {
        var firstnames = firstname.text.toString().trim()
        if (firstnames.isEmpty()) {
           firstnameerror.visibility = View.VISIBLE
           firstnameerror.text = "* Please enter First Name."
            return false
        } else if (firstnames.trim().length<2) {
           firstnameerror.visibility = View.VISIBLE
           firstnameerror.text = "* First Name at least three characters."

            return false
        } else {
           firstnameerror.visibility = View.GONE
           firstnameerror.text = ""
            return true

        }
    }

    fun validationlastname( firstname:EditText,firstnameerror:TextView):Boolean {
        var firstnames = firstname.text.toString().trim()
        if (firstnames.isEmpty()) {
            firstnameerror.visibility = View.VISIBLE
            firstnameerror.text = "* Please enter Last Name."
            return false
        } else if (firstnames.trim().length<2) {
            firstnameerror.visibility = View.VISIBLE
            firstnameerror.text = "* Last Name at least three characters."

            return false
        } else {
            firstnameerror.visibility = View.GONE
            firstnameerror.text = ""
            return true

        }
    }

    fun validationTelephone( telephone:EditText,telephoneerror:TextView):Boolean {
        var telephones = telephone.text.toString().trim()
        if (telephones.isEmpty()) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* Please enter Telephone Number."
            return false
        } else if (telephones.trim().length<2) {
             telephoneerror.visibility = View.VISIBLE
             telephoneerror.text = "* Telephone Number at least three characters."

            return false
        } else {
             telephoneerror.visibility = View.GONE
             telephoneerror.text = ""
            return true

        }
    }

    fun validationCompany( telephone:EditText,telephoneerror:TextView):Boolean {
        var telephones = telephone.text.toString().trim()
        if (telephones.isEmpty()) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* Please enter Company Name."
            return false
        } else if (telephones.trim().length<2) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* Company Name at least three characters."

            return false
        } else {
            telephoneerror.visibility = View.GONE
            telephoneerror.text = ""
            return true

        }
    }
    fun validationTexID( telephone:EditText,telephoneerror:TextView):Boolean {
        var telephones = telephone.text.toString().trim()
        if (telephones.isEmpty()) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* Please enter Tex Id."
            return false
        } else if (telephones.trim().length<2) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* Tex Id at least three characters."

            return false
        } else {
            telephoneerror.visibility = View.GONE
            telephoneerror.text = ""
            return true

        }
    }

    fun validationChequePayeerName( telephone:EditText,telephoneerror:TextView):Boolean {
        var telephones = telephone.text.toString().trim()
        if (telephones.isEmpty()) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* Please enter Cheque Payee Name."
            return false
        } else if (telephones.trim().length<2) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* Cheque Payee Name at least three characters."

            return false
        } else {
            telephoneerror.visibility = View.GONE
            telephoneerror.text = ""
            return true

        }
    }
    fun validationPaypalEmail( email:EditText,emailerror:TextView):Boolean {
        var emails = email.text.toString().trim()
        if (emails.isEmpty()) {
            emailerror.visibility = View.VISIBLE
            emailerror.text = "* Please enter valid PayPal Email Account."
            return false
        } else if (!Patterns.EMAIL_ADDRESS.matcher(emails).matches()) {
            emailerror.visibility = View.VISIBLE
            emailerror.text = "* Please enter valid PayPal Email Account."

            return false
        } else {
            emailerror.visibility = View.GONE
            emailerror.text = ""
            return true

        }
    }

    fun validationBankName( telephone:EditText,telephoneerror:TextView):Boolean {
        var telephones = telephone.text.toString().trim()
        if (telephones.isEmpty()) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* Please enter Bank Name."
            return false
        } else if (telephones.trim().length<2) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* Bank Name at least three characters."

            return false
        } else {
            telephoneerror.visibility = View.GONE
            telephoneerror.text = ""
            return true

        }
    }

    fun validationBranchNumber( telephone:EditText,telephoneerror:TextView):Boolean {
        var telephones = telephone.text.toString().trim()
        if (telephones.isEmpty()) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* Please enter Branch digit."
            return false
        } else if (telephones.trim().length<2) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* Branch Number at least three digit."

            return false
        } else {
            telephoneerror.visibility = View.GONE
            telephoneerror.text = ""
            return true

        }
    }

    fun validationSWIFTCode( telephone:EditText,telephoneerror:TextView):Boolean {
        var telephones = telephone.text.toString().trim()
        if (telephones.isEmpty()) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* Please enter SWIFT Code."
            return false
        } else if (telephones.trim().length<2) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* SWIFT Code at least three characters."

            return false
        } else {
            telephoneerror.visibility = View.GONE
            telephoneerror.text = ""
            return true

        }
    }

    fun validationAccountName( telephone:EditText,telephoneerror:TextView):Boolean {
        var telephones = telephone.text.toString().trim()
        if (telephones.isEmpty()) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* Please enter Account Name."
            return false
        } else if (telephones.trim().length<2) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* Account Name at least three characters."

            return false
        } else {
            telephoneerror.visibility = View.GONE
            telephoneerror.text = ""
            return true

        }
    }

    fun validationAccountNumber( telephone:EditText,telephoneerror:TextView):Boolean {
        var telephones = telephone.text.toString().trim()
        if (telephones.isEmpty()) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* Please enter Account Number."
            return false
        } else if (telephones.trim().length<2) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* Account Number at least three digit."

            return false
        } else {
            telephoneerror.visibility = View.GONE
            telephoneerror.text = ""
            return true

        }
    }

    fun validationCoupon( telephone:EditText,telephoneerror:TextView):Boolean {
        var telephones = telephone.text.toString().trim()
        if (telephones.isEmpty()) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* Please enter coupon."
            return false
        } else if (telephones.trim().length<2) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* Coupon at least three characters."

            return false
        } else {
            telephoneerror.visibility = View.GONE
            telephoneerror.text = ""
            return true

        }
    }

    fun validationPostcode( telephone:EditText,telephoneerror:TextView):Boolean {
        var telephones = telephone.text.toString().trim()
        if (telephones.isEmpty()) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* Please enter Post Code."
            return false
        } else if (telephones.trim().length<2) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* Post Code at least three digit."

            return false
        } else {
            telephoneerror.visibility = View.GONE
            telephoneerror.text = ""
            return true

        }
    }

    fun validationGiftCertificate ( telephone:EditText,telephoneerror:TextView):Boolean {
        var telephones = telephone.text.toString().trim()
        if (telephones.isEmpty()) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* Please enter gift certificate. "
            return false
        } else if (telephones.trim().length<2) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* Gift certificate  at least three characters."

            return false
        } else {
            telephoneerror.visibility = View.GONE
            telephoneerror.text = ""
            return true

        }
    }
    fun validationAddressOne ( telephone:EditText,telephoneerror:TextView):Boolean {
        var telephones = telephone.text.toString().trim()
        if (telephones.isEmpty()) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* Please enter Address."
            return false
        } else if (telephones.trim().length<2) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* Address  at least three characters."

            return false
        } else {
            telephoneerror.visibility = View.GONE
            telephoneerror.text = ""
            return true

        }
    }

    fun validationCity ( telephone:EditText,telephoneerror:TextView):Boolean {
        var telephones = telephone.text.toString().trim()
        if (telephones.isEmpty()) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* Please enter city."
            return false
        } else if (telephones.trim().length<2) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* City  at least three character."

            return false
        } else {
            telephoneerror.visibility = View.GONE
            telephoneerror.text = ""
            return true

        }
    }

    fun validationConfirmPassword ( password:EditText,telephoneerror:TextView):Boolean {
        var telephones = password.text.toString().trim()
        if (telephones.trim().isEmpty()) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* Please enter confirm password."
            return false
        } else if (!telephones.equals(passwordtx)) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* Password must be same as above password."

            return false
        } else {
            telephoneerror.visibility = View.GONE
            telephoneerror.text = ""
            return true

        }
    }

    fun validationYourName ( telephone:EditText,telephoneerror:TextView):Boolean {
        var telephones = telephone.text.toString().trim()
        if (telephones.isEmpty()) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* Please enter your name."
            return false
        } else if (telephones.trim().length<2) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* Name at least three character."

            return false
        } else {
            telephoneerror.visibility = View.GONE
            telephoneerror.text = ""
            return true

        }
    }

    fun validationEnquary ( telephone:EditText,telephoneerror:TextView):Boolean {
        var telephones = telephone.text.toString().trim()
        if (telephones.isEmpty()) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* Write your query."
            return false
        } else if (telephones.trim().length<2) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* Query at least three character."

            return false
        } else {
            telephoneerror.visibility = View.GONE
            telephoneerror.text = ""
            return true

        }
    }

    fun validationReview ( telephone:EditText,telephoneerror:TextView):Boolean {
        var telephones = telephone.text.toString().trim()
        if (telephones.isEmpty()) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* Write your review."
            return false
        } else if (telephones.trim().length<2) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* Review at least three character."

            return false
        } else {
            telephoneerror.visibility = View.GONE
            telephoneerror.text = ""
            return true

        }
    }

    fun validationOrderId ( telephone:EditText,telephoneerror:TextView):Boolean {
        var telephones = telephone.text.toString().trim()
        if (telephones.isEmpty()) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* Please enter order id."
            return false
        } else if (telephones.trim().length<2) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* Order id at least three character."

            return false
        } else {
            telephoneerror.visibility = View.GONE
            telephoneerror.text = ""
            return true

        }
    }
    fun validationProduct_Name ( telephone:EditText,telephoneerror:TextView):Boolean {
        var telephones = telephone.text.toString().trim()
        if (telephones.isEmpty()) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* Enter product name."
            return false
        } else if (telephones.trim().length<2) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* Product name at least three character."

            return false
        } else {
            telephoneerror.visibility = View.GONE
            telephoneerror.text = ""
            return true

        }
    }
    fun validationProductCode ( telephone:EditText,telephoneerror:TextView):Boolean {
        var telephones = telephone.text.toString().trim()
        if (telephones.isEmpty()) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* Please enter product code."
            return false
        } else if (telephones.trim().length<2) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* Product code at least three character."

            return false
        } else {
            telephoneerror.visibility = View.GONE
            telephoneerror.text = ""
            return true

        }
    }
    fun validationQuantity ( telephone:EditText,telephoneerror:TextView):Boolean {
        var telephones = telephone.text.toString().trim()
        if (telephones.isEmpty()) {
            telephoneerror.visibility = View.VISIBLE
            telephoneerror.text = "* Enter product quantity."
            return false
        } else {
            telephoneerror.visibility = View.GONE
            telephoneerror.text = ""
            return true

        }
    }


}