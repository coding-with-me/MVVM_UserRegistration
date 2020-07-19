package com.codingwithme.mvvmuserregistration.ui.authentication

import android.view.View
import androidx.lifecycle.ViewModel

class AuthenticationViewModel : ViewModel() {

    var fullName :String? = null
    var email :String? = null
    var userName :String? = null
    var password :String? = null

    var authListener:AuthListener? = null



    fun loginUser(view: View){

        if (userName.isNullOrEmpty() || password.isNullOrEmpty()){
            authListener!!.failure("Invalid username or password")
        }else{
            authListener!!.success("success")
        }
    }

    fun registerUser(view: View){
        if (userName.isNullOrEmpty() || password.isNullOrEmpty() || fullName.isNullOrEmpty() || email.isNullOrEmpty()){
            authListener!!.failure("Invalid full name or email or username or password")
        }else{
            authListener!!.success("success")
        }
    }


}