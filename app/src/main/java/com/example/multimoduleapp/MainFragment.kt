package com.example.multimoduleapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.module1.Fragment1
import com.example.module2.Fragment2
import com.example.multimoduleapp.databinding.FragmentMainBinding

class MainFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        val binding = FragmentMainBinding.inflate(inflater)
        binding.button1.setOnClickListener {
            val fragment1 = Fragment1()
            activity?.supportFragmentManager?.beginTransaction()?.replace(
                R.id.container, fragment1,
                Fragment1::class.java.name
            )?.addToBackStack(null)?.commit()
        }

        binding.button2.setOnClickListener {
            val fragment2 = Fragment2()
            activity?.supportFragmentManager?.beginTransaction()?.replace(
                R.id.container, fragment2,
                Fragment2::class.java.name
            )?.addToBackStack(null)?.commit()
        }
        return binding.root
    }
}