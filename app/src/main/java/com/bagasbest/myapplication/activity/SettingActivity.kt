package com.bagasbest.myapplication.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bagasbest.myapplication.databinding.ActivitySettingBinding

class SettingActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySettingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Tentang Developer"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)




    }


    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}