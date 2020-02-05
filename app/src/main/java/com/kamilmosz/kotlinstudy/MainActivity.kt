package com.kamilmosz.kotlinstudy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText

class MainActivity : AppCompatActivity() {

    private lateinit var sendButton: AppCompatButton
    private lateinit var usernameEditText: AppCompatEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sendButton = findViewById(R.id.pass_username_button)
        usernameEditText = findViewById(R.id.username_edittext)

        sendButton.setOnClickListener {
            if (!usernameEditText.text.isNullOrEmpty()) {
                passUsernameToAnotherActivity(usernameEditText.text.toString())
            }
        }
    }

    private fun passUsernameToAnotherActivity(usernameString: String) {
        val intent = Intent(this@MainActivity, ShowUsernameActivity::class.java)
        intent.putExtra("username", usernameString)
        startActivity(intent)
    }
}
