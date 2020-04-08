package com.onexsoftech.kotlindemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_next.*

class NextActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        btnResultBack.setOnClickListener {
            val result:String=ed_result_msg.text.toString()
            val intent=Intent()
            intent.putExtra("result",result)
            setResult(2,intent)
            finish()
        }
    }
}
