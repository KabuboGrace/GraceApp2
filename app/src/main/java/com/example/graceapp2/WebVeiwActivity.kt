package com.example.graceapp2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button

class WebVeiwActivity : AppCompatActivity() {
    lateinit var web: WebView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_veiw)
        web= findViewById(R.id.web)
            web.webViewClient= WebViewClient()
            web.loadUrl("https://www.planetware.com/tourist-attractions/kenya-ken.htm")
            web.settings.javaScriptEnabled=true
            web.settings.setSupportZoom(true)
    }
}



