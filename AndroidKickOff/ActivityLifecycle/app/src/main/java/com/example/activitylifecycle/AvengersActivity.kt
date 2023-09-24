package com.example.activitylifecycle

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class AvengersActivity : AppCompatActivity() {

    private var titleName: String? = "Avengers"
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPreferences = getSharedPreferences(getString(R.string.preference_file_name), Context.MODE_PRIVATE)
        setContentView(R.layout.scrollview_example)

        titleName = sharedPreferences.getString("Title", "The Avengers")

        title = titleName
    }
}