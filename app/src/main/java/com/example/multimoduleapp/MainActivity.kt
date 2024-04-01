package com.example.multimoduleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.module1.Fragment1
import com.example.module2.Fragment2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentMain = MainFragment()
        supportFragmentManager.beginTransaction().replace(
            R.id.container, fragmentMain,
            MainFragment::class.java.name
        ).addToBackStack(null).commit()
    }
}