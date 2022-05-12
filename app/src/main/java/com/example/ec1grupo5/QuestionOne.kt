package com.example.ec1grupo5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ec1grupo5.databinding.ActivityQuestionOneBinding

class QuestionOne : AppCompatActivity() {
    private lateinit var binding: ActivityQuestionOneBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionOneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        weekly_salary()
    }

    fun weekly_salary() {
        binding.btnCalculateWorkHours.setOnClickListener{
            var salary = 0
            var hours = binding.tvHourWork.text.toString().toInt()
            var salary_x_hours = 0
            var salary_x_hours_extra = 0

            if (hours <= 40) {
                salary_x_hours = 16
                salary = hours * salary_x_hours
                toast("Su salario es  $salary")

            } else if (hours > 40) {
                salary_x_hours = 16
                salary_x_hours_extra = 20
                var hours_extra = hours - 40
                salary = (hours_extra * salary_x_hours_extra) + (salary_x_hours * hours)
                toast("Su salario es  $salary, horas extra $salary_x_hours_extra")

            }
        }
    }

    fun toast(message: String) {
        Toast.makeText(this, "$message", Toast.LENGTH_LONG).show()
    }
}