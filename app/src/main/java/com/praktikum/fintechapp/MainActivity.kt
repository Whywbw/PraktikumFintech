package com.praktikum.fintechapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.myfintechapp.settings.SettingsFragment
import com.praktikum.fintechapp.home.HomeActivity
import com.praktikum.fintechapp.home.HomeFragment
import com.praktikum.fintechapp.profile.ProfileFragment


class MainActivity : AppCompatActivity() {

    private lateinit var btnHome: Button
    private lateinit var btnProfile: Button
    private lateinit var btnSettings: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHome = findViewById(R.id.btn_home)
        btnProfile = findViewById(R.id.btn_profile)
        btnSettings = findViewById(R.id.btn_settings)

        btnHome.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("username", "ganjar")
            startActivity(intent)
        }

        btnHome.setOnClickListener {
            loadFragment(HomeFragment())
        }

        btnSettings.setOnClickListener {
            loadFragment(SettingsFragment())
        }

        btnProfile.setOnClickListener {
            loadFragment(ProfileFragment())
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment)
            .commitNow()
    }
}