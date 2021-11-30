package com.muhammadfajrulwafa07.a211androidh

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HasilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)

        val nama = intent.getStringExtra("nama")
        val email = intent.getStringExtra("email")
        val noHandphone = intent.getStringExtra("noHandphone")
        val tanggalLahir = intent.getStringExtra("tanggalLahir")
        val jarak = intent.getStringExtra("jarak")

        val namaTextView = findViewById<TextView>(R.id.namaTextView)
        val emailTextView = findViewById<TextView>(R.id.emailTextView)
        val noHandphoneTextView = findViewById<TextView>(R.id.noHandphoneTextView)
        val tanggalLahirTextView = findViewById<TextView>(R.id.tanggalLahirTextView)
        val jarakTextView = findViewById<TextView>(R.id.jarakTextView)

        namaTextView.setText(nama)
        emailTextView.setText(email)
        noHandphoneTextView.setText(noHandphone)
        tanggalLahirTextView.setText(tanggalLahir)
        jarakTextView.setText(jarak.toString())
    }
}