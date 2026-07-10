package com.vrxos

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val web = WebView(this)

        web.webViewClient = WebViewClient()
        web.settings.javaScriptEnabled = true

        web.loadUrl(
            "file:///android_asset/index.html"
        )

        setContentView(web)
    }
}
