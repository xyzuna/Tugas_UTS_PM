package com.example.tugasutspemrogramanmobile1

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashScreen : Activity() {

    private val SPLASH_DURATION = 3000L // 3 detik

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splashscreen)

        // Handler untuk delay sebelum pindah ke LoginActivity
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
            finish() // tutup Splash agar tak bisa kembali
        }, SPLASH_DURATION)
    }
}
