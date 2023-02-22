package com.example.chaitanya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val CalculateBmtButton :Button=findViewById(R.id.user_BMT_Buttons)
//        val calculateBmtButton :Button=findViewById(R.id.)
        val CalculateBmtButton: Button =findViewById(R.id.Calculate_BMT_Button)
        CalculateBmtButton.setOnClickListener {
            Toast.makeText(this,"Button Clicked",Toast.LENGTH_SHORT).show()
        }

        }
    }
