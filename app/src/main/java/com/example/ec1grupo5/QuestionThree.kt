package com.example.ec1grupo5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ec1grupo5.databinding.ActivityQuestionThreeBinding

class QuestionThree : AppCompatActivity() {
    private lateinit var binding: ActivityQuestionThreeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionThreeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        calculate_minutes()
    }

    fun calculate_minutes() {
        binding.btnCalculateThree.setOnClickListener {
            var seconds = binding.tvNumberQthree.text.toString().toInt()
            var minutes = 0
            if (seconds > 0) {
                minutes = seconds / 60
            } else {
                toast("Ingrese un número valido")
            }
            toast("Minutos -> ${minutes}")
        }
    }
    fun toast(message: String) {
        Toast.makeText(this, "$message", Toast.LENGTH_LONG).show()
    }
}