package com.emonics.gromart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnSignIn).setOnClickListener {
            Intent(this, SignInActivity::class.java).also {
                startActivity(it)
            }
        }

        findViewById<Button>(R.id.btnSignUp).setOnClickListener {
            Intent(this, SignUpActivity::class.java).also{
                startActivity(it)
            }
        }
    }
}