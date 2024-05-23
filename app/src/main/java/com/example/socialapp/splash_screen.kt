package com.example.socialapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Toast

import com.example.socialapp.databinding.ActivitySplashScreenBinding

class splash_screen : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        supportActionBar?.hide()
        binding=ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Handler(Looper.getMainLooper()).postDelayed(Runnable {
            startActivity(Intent(this,signup::class.java))
            binding.idani.playAnimation()
            finish()
            Toast.makeText(this,"WELCOME", Toast.LENGTH_SHORT).show()
        },6000)
    }
}