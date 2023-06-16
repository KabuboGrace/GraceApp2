package com.example.graceapp2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListViewActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        var names = arrayOf(
            "Laurine",
            "Daniel",
            "Tony",
            "Grace",
            "Angela",
            "Laurine",
            "Daniel",
            "Tony",
            "Grace",
            "Angela",
            "Laurine",
            "Daniel",
            "Tony",
            "Grace",
            "Angela",
            "Laurine",
            "Daniel",
            "Tony",
            "Grace",
            "Angela",
            "Laurine",
            "Daniel",
            "Tony",
            "Grace",
            "Angela",
            "Laurine",
            "Daniel",
            "Tony",
            "Grace",
            "Angela",
            "Laurine",
            "Daniel",
            "Tony",
            "Grace",
            "Angela",
            "Laurine",
            "Daniel",
            "Tony",
            "Grace",
            "Angela",
            "Laurine",
            "Daniel",
            "Tony",
            "Grace",
            "Angela",
            "Laurine",
            "Daniel",
            "Tony",
            "Grace",
            "Angela"
        )

        var myadapter = ArrayAdapter(this, R.layout.list_item, names)

        var mylist: ListView = findViewById(R.id.list)
        mylist.setAdapter(myadapter)
    }
}
