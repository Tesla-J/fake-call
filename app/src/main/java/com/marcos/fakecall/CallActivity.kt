package com.marcos.fakecall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.View
import android.view.Window
import android.view.WindowManager

import android.widget.ImageButton

import android.graphics.Color

class CallActivity : AppCompatActivity() {

    var mAcceptCall:ImageButton? = null
    var mDenyCall:ImageButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //supportActionBar?.hide()

        setContentView(R.layout.activity_call)

        mAcceptCall = findViewById(R.id.accept_call) as ImageButton
        mDenyCall = findViewById(R.id.deny_call) as ImageButton

        //mAcceptCall!!.setBackgroundColor(Color.GREEN)
        //mDenyCall!!.setBackgroundColor(Color.RED)
    }

    fun onClick(view:View) = this.finish()
}