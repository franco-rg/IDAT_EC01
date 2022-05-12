package com.example.ec1grupo5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ec1grupo5.databinding.ActivityQuestionFourBinding
import kotlin.reflect.typeOf

class QuestionFour : AppCompatActivity() {
     private lateinit var binding: ActivityQuestionFourBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionFourBinding.inflate(layoutInflater)
        setContentView(binding.root)
        number_sum()
    }

    fun number_sum(){
        binding.btnCalculateFour.setOnClickListener{
            var number =  binding.tvNumberQfour.text.toString().toInt()
            var sum = 0
            if (number > 0){
                sum = (number * (number + 1)/2)
            }else{
                toast("Ingrese un número valido")
            }

            toast("La suma de los valores es -> ${sum}")
        }
    }

    fun toast(message:String){
        Toast.makeText(this,"$message",Toast.LENGTH_LONG).show()
    }
}