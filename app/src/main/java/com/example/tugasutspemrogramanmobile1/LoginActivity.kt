package com.example.tugasutspemrogramanmobile1

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login : Activity() {

    private lateinit var editEmail: EditText
    private lateinit var editPassword: EditText
    private lateinit var btnLogin: Button
    private lateinit var btnToRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        editEmail = findViewById(R.id.editEmail)
        editPassword = findViewById(R.id.editPassword)
        btnLogin = findViewById(R.id.btnLogin)
        btnToRegister = findViewById(R.id.btnRegister)

        btnLogin.setOnClickListener {
            val email = editEmail.text.toString()
            val pass = editPassword.text.toString()

            // Pengecekan login
            if (email == "admin@gmail.com" && pass == "1234") {
                val intent = Intent(this@Login, ListChatActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this@Login, "Login gagal! Coba lagi.", Toast.LENGTH_SHORT).show()
            }
        }

        btnToRegister.setOnClickListener {
            val intent = Intent(this@Login, Register::class.java)
            startActivity(intent)
        }
    }
}
