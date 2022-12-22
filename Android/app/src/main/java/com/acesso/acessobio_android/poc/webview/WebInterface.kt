package com.acesso.acessobio_android.poc.webview

import android.webkit.JavascriptInterface

class WebInterface(private val callback: (String) -> Unit) {

    @JavascriptInterface
    fun showImage(base64Image: String) = callback.invoke(base64Image)
}