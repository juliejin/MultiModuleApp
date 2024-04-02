package com.example.demoapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.module2.Fragment2

class TestActivity2: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test_activity_2)

        val fragmentMain = Fragment2()
        supportFragmentManager.beginTransaction().replace(
            R.id.container, fragmentMain,
            Fragment2::class.java.name
        ).addToBackStack(null).commit()
    }
}