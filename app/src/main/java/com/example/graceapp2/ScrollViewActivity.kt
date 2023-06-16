package com.example.graceapp2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ScrollViewActivity : AppCompatActivity() {

     lateinit var next: TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scroll_view)

        next = findViewById(R.id.button22)

        next.setOnClickListener {
            var mynext1 = Intent(this, ListViewActivity::class.java)
            startActivity(mynext1)
        }
    }
}