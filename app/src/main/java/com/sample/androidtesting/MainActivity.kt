package com.sample.androidtesting

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val textContent by lazy<TextView> { findViewById(R.id.text_container) }
    private val wordCount by lazy<TextView> { findViewById(R.id.word_count) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text = textContent.text
        wordCount.text = StringUtil.countNoOfWords(text).toString()
    }


}