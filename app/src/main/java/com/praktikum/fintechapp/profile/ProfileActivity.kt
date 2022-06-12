package com.praktikum.fintechapp.profile

import com.praktikum.fintechapp.R


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        title = "Menu Profile"
        val name = findViewById<TextView>(R.id.tvnama)
        val nim = findViewById<TextView>(R.id.tvnim)
        val mail = findViewById<TextView>(R.id.tvemail)
        val nope = findViewById<TextView>(R.id.tvhp)
        val jk = findViewById<TextView>(R.id.tvjk)
        val prodi = findViewById<TextView>(R.id.tvprodi)
        val org = findViewById<TextView>(R.id.tvorg)
        val status = findViewById<TextView>(R.id.tvstatus)

        val bukabundle = intent.extras
        if (bukabundle != null) {
            name.setText(bukabundle.getString("nama"))
            nim.setText(bukabundle.getString("nim"))
            mail.setText(bukabundle.getString("mail"))
            nope.setText(bukabundle.getString("nope"))
            jk.setText(bukabundle.getString("jkel"))
            prodi.setText(bukabundle.getString("prodi"))
            org.setText(bukabundle.getString("org"))
            status.setText(bukabundle.getString("status"))
        }
    }
}