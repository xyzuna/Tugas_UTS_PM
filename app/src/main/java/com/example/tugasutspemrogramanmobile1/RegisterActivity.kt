package com.example.tugasutspemrogramanmobile1

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Register : Activity() {

    private lateinit var editNama: EditText
    private lateinit var editEmail: EditText
    private lateinit var editPassword: EditText
    private lateinit var btnDaftar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register) // sesuai dengan nama XML kamu

        editNama = findViewById(R.id.editTextName)
        editEmail = findViewById(R.id.editTextEmail)
        editPassword = findViewById(R.id.editTextPassword)
        btnDaftar = findViewById(R.id.buttonRegister)

        btnDaftar.setOnClickListener {
            val nama = editNama.text.toString()
            val email = editEmail.text.toString()
            val password = editPassword.text.toString()

            if (nama.isNotEmpty() && email.isNotEmpty() && password.isNotEmpty()) {
                Toast.makeText(this, "Registrasi Berhasil!", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, Login::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Mohon lengkapi semua data.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
