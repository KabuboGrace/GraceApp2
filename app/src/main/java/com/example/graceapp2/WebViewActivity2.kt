package com.example.graceapp2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class WebViewActivity2 : AppCompatActivity() {
    lateinit var web2:WebView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view2)

        web2= findViewById(R.id.web2)


        web2.webViewClient= WebViewClient()
        web2.loadUrl("https://www.google.com/maps")
        web2.settings.javaScriptEnabled=true
        web2.settings.setSupportZoom(true)

    }
}