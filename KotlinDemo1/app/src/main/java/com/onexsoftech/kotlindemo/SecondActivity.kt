package com.onexsoftech.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //in the second Activity we get the message string from Main Activity and Simply displayed as Toast
        //first we get the not nullable Bundle
        val bundle:Bundle?=intent.extras   //As intent.extras method gives Nullable object. So to avoid null pointer Exception in kotlin use '?'
        val msg:String?=bundle!!.getString("message") // As bundle is nullable here use '!!' assertion operator
        Toast.makeText(this,"$msg",Toast.LENGTH_SHORT).show()
    }
}
