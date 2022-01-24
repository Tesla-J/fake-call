package com.marcos.fakecall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.View

import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view:View){
        val intent = Intent(applicationContext, CallActivity::class.java)
        startActivity(intent)
    }
}