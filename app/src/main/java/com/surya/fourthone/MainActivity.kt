package com.surya.fourthone

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.surya.fourthone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var count = 0
        binding.btnCounter.setOnClickListener {
            count++
            binding.tvCount.text = "Let's Count Together: $count"
            }
        var count1 = 0
        binding.btnCounter1.setOnClickListener {
            count1--
            binding.tvCount1.text = "Let's Count Together: $count1"

        }
    }
}