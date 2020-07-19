package com.codingwithme.mvvmuserregistration.ui.authentication

interface AuthListener {
    fun success(message:String)
    fun failure(message:String)
}