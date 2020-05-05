package com.cr7.project

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.content.res.Configuration
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_halaman2.*
import kotlinx.android.synthetic.main.activity_main.*

class halaman2 : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman2)

        //edit nama kehalaman3

        //edit profil
        btn_ep.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        //melakukan panggilan
        btn_dial.setOnClickListener {
            val number = txttel.text.toString()
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + Uri.encode(number)))
            startActivity(intent)
        }
        //tombol profil pembuat
        btn_pembuat.setOnClickListener {
            intent = Intent(this, abot::class.java)
            startActivity(intent)
        }
        datahalaman1()
    }
    //dapat data halaman1(biodata diri)
    private fun datahalaman1(){
        var intent = intent
        //dapat data berdasarkan nama
        val name = intent.getStringExtra("nama")
        val email = intent.getStringExtra("email")
        val gender = intent.getStringExtra("gender")
        val telp = intent.getStringExtra("telp")
        val alamat = intent.getStringExtra("alamat")



        //tempat yang inigin diisi
        val txt = findViewById<TextView>(R.id.txtNama)
        val jenis = findViewById<TextView>(R.id.txtkelamin)
        val em = findViewById<TextView>(R.id.txtemail)
        val hp = findViewById<TextView>(R.id.txttel)
        val address = findViewById<TextView>(R.id.txtaddress)

        //isi tempat tersebut
        txt.text = name
        jenis.text = gender
        em.text = email
        hp.text = telp
        address.text = alamat

    }







}
