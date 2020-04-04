package com.onexsoftech.kotlindemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.* // this import for directly use view id's in business code

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //******************First Example***********************//
        //here i use btnClickMsg which is id of Button view in activity_main.xml file
        //here i directly use setOnClickListener method of Button View
        btnClick.setOnClickListener {
            Toast.makeText(this,"I am Clicked!",Toast.LENGTH_SHORT).show()
        }
        //********************Second Exmaple*********************//
        //Here we are getting value from edit text and displaying it on Toast message
        //first we get text value from edit text (ed_message)
        //val msg=ed_message.text.toString()  //in kotlin there is no concept of getter/setter
        //On Show Message button click we showing message typed on EditText
        /*btnShowMsg.setOnClickListener {
            Toast.makeText(this,"Your message:$msg",Toast.LENGTH_LONG).show()
        }*/

        //*********************third Exmple**********************//
        //Here we are getting value from edit text and passing that value to next Activity using intent
        //first we get string valur from edit text(ed_message)
        val msg=ed_message.text.toString()
        btnShowMsg.setOnClickListener {
            val intent=Intent(this,SecondActivity::class.java)// here in second parameter we use kotlin Reflection
            intent.putExtra("message",msg)
            startActivity(intent)
        }
    }
}
