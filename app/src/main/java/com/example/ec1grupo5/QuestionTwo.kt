package com.example.ec1grupo5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ec1grupo5.databinding.ActivityQuestionTwoBinding

class QuestionTwo : AppCompatActivity() {
      private lateinit var binding: ActivityQuestionTwoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        grade_point_average()
    }

    fun grade_point_average(){
        binding.btnCalculateTwo.setOnClickListener{
            var n_one = binding.tvScoreOne.text.toString().toFloat()
            var n_two = binding.tvScoreTwo.text.toString().toFloat()
            var n_three = binding.tvScoreThree.text.toString().toFloat()
            var n_four = binding.tvScoreFour.text.toString().toFloat()
            var list_number = arrayOf( n_one, n_two, n_three, n_four)
            var min_value = list_number.minOrNull()

            if(n_one == min_value){
                toast("Nota eliminada ${min_value}, Promedio ${number_average(n_two,n_three,n_four)}")
            } else if(n_two == min_value){
                toast("Nota eliminada ${min_value}, Promedio ${number_average(n_one,n_three,n_four)}")
            } else if (n_three == min_value){
                toast("Nota eliminada ${min_value}, Promedio ${number_average(n_two,n_one,n_four)}")
            } else if (n_four == min_value){
                toast("Nota eliminada ${min_value}, Promedio ${number_average(n_two,n_three,n_one)}")

            }

        }

    }
    fun number_average(n1:Float ,n2:Float,n3:Float):Float{
        var average = (n1 + n2 + n3) / 3
        return average
    }

    fun toast(message: String) {
        Toast.makeText(this, "$message", Toast.LENGTH_LONG).show()
    }
}