package com.example.activitylifecycle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class AvengersActivity : AppCompatActivity() {

    var titleName: String? = "Avengers"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.scrollview_example)

        if (intent != null){
            intent.getStringArrayExtra("Name")
        }

        title = titleName
    }
}