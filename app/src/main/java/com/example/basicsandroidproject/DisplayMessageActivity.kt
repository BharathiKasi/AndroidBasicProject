package com.example.basicsandroidproject

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.basicsandroidproject.databinding.ActivityDisplayMessageBinding

class DisplayMessageActivity : AppCompatActivity() {
    private lateinit var mDisplayMessageBinding: ActivityDisplayMessageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mDisplayMessageBinding = DataBindingUtil.setContentView(this,R.layout.activity_display_message)
        val lMessage:String = intent.extras.let {
            it.let {
                it!!.get(Constant.PARAM_1)
            }
        } as String
        mDisplayMessageBinding.MessageTextView.text = lMessage
    }
}