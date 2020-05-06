package com.cr7.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnsubmit.setOnClickListener { kehalaman2() }

       }

    private fun kehalaman2() {
        val intent = Intent(this, halaman2::class.java)
        startActivity(intent)
    }

}


