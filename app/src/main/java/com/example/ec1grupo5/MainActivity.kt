package com.example.ec1grupo5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ec1grupo5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
//    private lateinit var binding: ActivityMainBinding
//   binding = ActivityMainBinding.inflate(layoutInflater)
// setContentView(binding.root)
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        btn_click()
    }

    fun btn_click(){
        binding.btnOne.setOnClickListener{
            startActivity(Intent(this@MainActivity, QuestionOne::class.java))
        }
        binding.btnTwo.setOnClickListener{
            startActivity(Intent(this@MainActivity, QuestionTwo::class.java))
        }
        binding.btnThree.setOnClickListener{
            startActivity(Intent(this@MainActivity, QuestionThree::class.java))
        }
        binding.btnFour.setOnClickListener{
            startActivity(Intent(this@MainActivity, QuestionFour::class.java))
        }
    }


}