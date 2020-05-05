package com.cr7.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.*
import kotlinx.android.synthetic.main.activity_halaman2.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val namaet = findViewById<EditText>(R.id.edtnama)
        val jeniset = findViewById<EditText>(R.id.edtjenis)
        val emailet = findViewById<EditText>(R.id.edtemail)
        val telpet = findViewById<EditText>(R.id.edttelp)
        val alamatet = findViewById<EditText>(R.id.edtalamat)

        //ketika tombol save ditekan
        btnsubmit.setOnClickListener {
            //dapat dari inputan user
            var nama = edtnama.text.toString()
            var email = edtemail.text.toString()
            var gender = edtjenis.text.toString()
            var telp = edttelp.text.toString()
            var alamat = edtalamat.text.toString()

            //intent pindah halaman
            intent = Intent(this, halaman2::class.java)

            //nama untuk mengirim data ke halaman ke 2, dan untuk diambil

            intent.putExtra("nama", nama)
            intent.putExtra("email", email)
            intent.putExtra("gender", gender)
            intent.putExtra("telp", telp)
            intent.putExtra("alamat", alamat)


            startActivity(intent)
        }


    }
}







