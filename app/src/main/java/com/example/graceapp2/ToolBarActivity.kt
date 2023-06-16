package com.example.graceapp2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ToolBarActivity : AppCompatActivity() {

    lateinit var home23:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tool_bar)

        home23 = findViewById(R.id.home1)

        home23.setOnClickListener {
            var dash = Intent(this,DashboardActivity::class.java)
            startActivity(dash)
        }
    }
}