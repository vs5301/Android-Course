package com.example.assignment_androidkickoff

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ForgotPasswordActivity : AppCompatActivity() {

    private lateinit var etMobileNumber: EditText
    private lateinit var etEmail: EditText
    private lateinit var btnNext: Button

    // Create an Intent to navigate to the blank screen activity (replace BlankScreenActivity::class.java with the actual activity)
    private lateinit var intent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        btnNext.setOnClickListener {

            etMobileNumber = findViewById(R.id.etMobileNumber)
            etEmail = findViewById(R.id.etPassword)

            val mobileNumber = etMobileNumber.text.toString()
            val email = etEmail.text.toString()

            intent = Intent(this@ForgotPasswordActivity, HomeActivity::class.java)
            // Pass user inputs to the next activity using Intent extras
            intent.putExtra("MobileNumber", mobileNumber)
            intent.putExtra("EmailAddress", email)

            // Start the next activity
            startActivity(intent)
        }

    }
}