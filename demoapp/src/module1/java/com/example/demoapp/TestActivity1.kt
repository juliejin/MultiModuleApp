package com.example.demoapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.module1.Fragment1

class TestActivity1: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test_activity_1)

        val fragmentMain = Fragment1()
        supportFragmentManager.beginTransaction().replace(
            R.id.container, fragmentMain,
            Fragment1::class.java.name
        ).addToBackStack(null).commit()
    }
}