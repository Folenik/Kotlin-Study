package com.kamilmosz.kotlinstudy

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import com.kamilmosz.kotlinstudy.Objects.User

class ShowUsernameActivity : AppCompatActivity() {

    private lateinit var usernameTextView: AppCompatTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_username)

        val intent: Intent = getIntent()

        usernameTextView = findViewById(R.id.username_textview)

        if (intent.hasExtra("username")) {
            usernameTextView.text = intent.getStringExtra("username")
            createUser(intent.getStringExtra("username"))
        }
    }

    private fun createUser(userName: String) {
        var newUser = User().apply { username = userName  }
        Log.i("Nowy użytkownik:", newUser.username)
    }
}
