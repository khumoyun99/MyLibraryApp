package com.example.mylibrary

import android.content.Context
import android.widget.Toast

object ToasterMessage {

    fun show(context:Context,string: String){
        Toast.makeText(context, string, Toast.LENGTH_SHORT).show()
    }



}