package com.kamilmosz.kotlinstudy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView

class ShowUsernameActivity : AppCompatActivity() {

    private lateinit var usernameTextView: AppCompatTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_username)

        val intent: Intent = getIntent()

        usernameTextView = findViewById(R.id.username_textview)

        if (intent.hasExtra("username")) {
            usernameTextView.text = intent.getStringExtra("username")
        }
    }
}
