package com.onexsoftech.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.* // this import for directly use view id's in business code

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //here i use btnClickMsg which is id of Button view in activity_main.xml file
        //here i directly use setOnClickListener method of Button View
        btnClickMsg.setOnClickListener {
            Toast.makeText(this,"I am Clicked!",Toast.LENGTH_SHORT).show()
        }
    }
}
