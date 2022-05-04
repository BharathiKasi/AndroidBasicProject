package com.example.basicsandroidproject

import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.basicsandroidproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mMainActivityBinding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        mMainActivityBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

    }

    fun sendMessage(pView:View){
       val lString = mMainActivityBinding.EditText.text.toString()
        println("isEmpty is ${lString.isEmpty()}")
        println("isBlank is ${lString.isBlank()}")
        println("isNullOrEmpty is ${lString.isNullOrEmpty()}")
        if (lString.length>0){
            var lIntent = Intent(this,DisplayMessageActivity::class.java)
            lIntent.putExtra(Constant.PARAM_1,lString)
            startActivity(lIntent)

        }
    }
}