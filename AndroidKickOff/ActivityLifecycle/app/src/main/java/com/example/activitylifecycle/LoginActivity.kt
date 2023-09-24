package com.example.activitylifecycle

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var etMobileNumber: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnLogin: Button
    private lateinit var txtForgotPassword: TextView
    private lateinit var txtRegister: TextView
    private val validMobileNumber = "0123456789"
    private val validPassword = arrayOf("tony","steve","bruce","thanos")

    private lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPreferences = getSharedPreferences(getString(R.string.preference_file_name), Context.MODE_PRIVATE)

        val isLoggedIn = sharedPreferences.getBoolean("isLoggedIn", false)

        setContentView(R.layout.activity_login)

        if (isLoggedIn) {
            val intent = Intent(this@LoginActivity, AvengersActivity::class.java)
            startActivity(intent)
            finish()
        }

        setContentView(R.layout.activity_login)

        title = "Log In"

        etMobileNumber = findViewById(R.id.etMobileNumber)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
        txtForgotPassword = findViewById(R.id.txtForgotPassword)
        txtRegister = findViewById(R.id.txtRegister)

        btnLogin.setOnClickListener{

            val mobileNumber = etMobileNumber.text.toString()
            val password = etPassword.text.toString()

            val nameOfAvenger: String

            val intent = Intent(this@LoginActivity, AvengersActivity::class.java)

            if ((mobileNumber == validMobileNumber)){
                when (password) {
                    validPassword[0] -> {
                        nameOfAvenger = "Iron Man"
                        savePreference(nameOfAvenger)
                        startActivity(intent)
                    }
                    validPassword[1] -> {
                        nameOfAvenger = "Captain America"
                        savePreference(nameOfAvenger)
                        startActivity(intent)
                    }
                    validPassword[2] -> {
                        nameOfAvenger = "The Hulk"
                        savePreference(nameOfAvenger)
                        startActivity(intent)
                    }
                    validPassword[3] -> {
                        nameOfAvenger = "The Avengers"
                        savePreference(nameOfAvenger)
                        startActivity(intent)
                    }
                }
            } else {
                Toast.makeText(
                    this@LoginActivity,
                    "Invalid Username or Password",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }

    override fun onPause() {
        super.onPause()
        finish()
    }

    private fun savePreference(title: String){
        sharedPreferences.edit().putBoolean("isLoggedIn", true).apply()
        sharedPreferences.edit().putString("Title", title).apply()
    }
}