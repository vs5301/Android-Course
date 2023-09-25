package com.example.assignment_androidkickoff

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {

    private lateinit var etMobileNumber: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnLogin: Button

    private lateinit var sharedPreferences: SharedPreferences

    private lateinit var intent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPreferences = getSharedPreferences(getString(R.string.user_details), Context.MODE_PRIVATE)

        val isLoggedIn = sharedPreferences.getBoolean("isLoggedIn", false)

        setContentView(R.layout.activity_login)

        if (isLoggedIn){
            intent = Intent(this@LoginActivity, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

        setContentView(R.layout.activity_login)

        title = "Log In"

        etMobileNumber = findViewById(R.id.etMobileNumber)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener{

            val mobileNumber = etMobileNumber.text.toString()
            val password = etPassword.text.toString()

            intent = Intent(this@LoginActivity, HomeActivity::class.java)
            intent.putExtra("MobileNumber", mobileNumber)
            intent.putExtra("Password", password)

            savePreference()
            startActivity(intent)
        }
    }

    override fun onPause() {
        super.onPause()
        finish()
    }

    private fun savePreference(){
        sharedPreferences.edit().putBoolean("isLoggedIn", true).apply()
    }
}