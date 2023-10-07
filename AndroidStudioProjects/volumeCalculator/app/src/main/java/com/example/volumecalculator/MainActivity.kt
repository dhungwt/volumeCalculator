package com.example.volumecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.volumecalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.calculateButton.setOnClickListener {
            val radius = binding.radiusInput.text.toString().toDoubleOrNull() ?: 0.0
            val height = binding.heightInput.text.toString().toDoubleOrNull() ?: 0.0
            val volume = calculateCylinderVolume(radius, height)
            binding.result.text = " $volume"
        }
    }

    private fun calculateCylinderVolume(radius: Double, height: Double): Double {
        return Math.PI * radius * radius * height
    }
}
