package com.example.tugasutspemrogramanmobile1

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class ListChatActivity : AppCompatActivity() {

    private lateinit var listView: ListView
    private lateinit var editTextComment: EditText
    private lateinit var buttonSend: Button
    private lateinit var adapter: ArrayAdapter<String>
    private lateinit var dataChat: ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.listchat)

        listView = findViewById(R.id.listViewChat)
        editTextComment = findViewById(R.id.editTextComment)
        buttonSend = findViewById(R.id.buttonSend)

        // Data awal dalam ArrayList agar bisa dimodifikasi
        dataChat = arrayListOf(
            "Budi: Keren Banget?",
            "Siti: Ajarin dong >_<",
            "Sisca: Kamu Hebat Buangeetzz",
            "Viola: Karyanya Beuh Banget dehhhhh",
            "Raihan: Ajarin dong puh SEPUH.",
            "Rizki: ANJAY!",
            "Bombom: Ini Yang saya Cari !!",
            "Andi: CETEK ITUMAH GUE JUGA BISA, BISA LIHAT :v",
            "Rina: ihhhhhhhhhh Ihhhhhh"
        )

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, dataChat)
        listView.adapter = adapter

        buttonSend.setOnClickListener {
            val comment = editTextComment.text.toString().trim()

            if (comment.isNotEmpty()) {
                dataChat.add("Saya: $comment")  // Tambah komentar baru
                adapter.notifyDataSetChanged()  // Update tampilan ListView
                editTextComment.text.clear()    // Kosongkan input
                listView.smoothScrollToPosition(dataChat.size - 1) // Scroll ke bawah
            } else {
                Toast.makeText(this, "Komentar tidak boleh kosong", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
