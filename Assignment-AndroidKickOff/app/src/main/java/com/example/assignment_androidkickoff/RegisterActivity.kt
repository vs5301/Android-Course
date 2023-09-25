package com.example.assignment_androidkickoff

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class RegisterActivity : AppCompatActivity() {

    private lateinit var etName: EditText
    private lateinit var etEmail: EditText
    private lateinit var etMobileNumber: EditText
    private lateinit var etDeliveryAddress: EditText
    private lateinit var etPassword: EditText
    private lateinit var etConfirmPassword: EditText
    private lateinit var registerButton: Button

    private lateinit var intent: Intent

    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPreferences = getSharedPreferences(getString(R.string.user_details), Context.MODE_PRIVATE)

        setContentView(R.layout.activity_register)

        registerButton.setOnClickListener{

            etName = findViewById(R.id.etName)
            etEmail = findViewById(R.id.etEmail)
            etMobileNumber = findViewById(R.id.etMobileNumber)
            etDeliveryAddress = findViewById(R.id.etAddress)
            etPassword = findViewById(R.id.etPassword)
            etConfirmPassword = findViewById(R.id.etConfirmPassword)

            val name = etName.text.toString()
            val email = etEmail.text.toString()
            val mobileNumber = etMobileNumber.text.toString()
            val deliveryAddress = etDeliveryAddress.text.toString()
            val password = etPassword.text.toString()

            intent = Intent(this@RegisterActivity, HomeActivity::class.java)
            intent.putExtra("Name", name)
            intent.putExtra("Email", email)
            intent.putExtra("MobileNumber", mobileNumber)
            intent.putExtra("DeliveryAddress", deliveryAddress)
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