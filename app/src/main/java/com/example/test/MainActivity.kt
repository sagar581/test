package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.library.Utils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val temp =Utils()
        temp.showIt()
    }


}