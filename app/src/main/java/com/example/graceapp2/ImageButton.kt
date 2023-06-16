package com.example.graceapp2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class ImageButton : AppCompatActivity() {

    lateinit var number1:EditText
    lateinit var number2:EditText
    lateinit var image:ImageButton
    lateinit var image2:ImageButton
    lateinit var image3:ImageButton
    lateinit var image4:ImageButton

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_button)

        number1=findViewById(R.id.num1)
        number2=findViewById(R.id.num2)
        image=findViewById(R.id.img1)
        image2=findViewById(R.id.img2)
        image3=findViewById(R.id.img3)
        image4=findViewById(R.id.img4)




        image.setOnClickListener {
            if (number1.toString().isEmpty()||number2.toString().isEmpty()){
                Toast.makeText(applicationContext,"Enter both numbers!",Toast.LENGTH_LONG).show()
            }
            else{
                var num1=Integer.parseInt(number1.text.toString())
                var num2=Integer.parseInt(number2.text.toString())
                Toast.makeText(applicationContext,"Sum of two numbers is "+(num1+num2),Toast.LENGTH_LONG).show()
            }
        }

        image2.setOnClickListener {
            if (number1.toString().isEmpty()||number2.toString().isEmpty()){
                Toast.makeText(applicationContext,"Enter both numbers!",Toast.LENGTH_LONG).show()
            }
            else{
                var num1=Integer.parseInt(number1.text.toString())
                var num2=Integer.parseInt(number2.text.toString())
                Toast.makeText(applicationContext,"Difference of two numbers is "+(num1-num2),Toast.LENGTH_LONG).show()
            }
        }

        image3.setOnClickListener {
            if (number1.toString().isEmpty()||number2.toString().isEmpty()){
                Toast.makeText(applicationContext,"Enter both numbers!",Toast.LENGTH_LONG).show()
            }
            else{
                var num1=Integer.parseInt(number1.text.toString())
                var num2=Integer.parseInt(number2.text.toString())
                Toast.makeText(applicationContext,"Multiplication of two numbers is "+(num1*num2),Toast.LENGTH_LONG).show()
            }
        }

        image4.setOnClickListener {
            if (number1.toString().isEmpty()||number2.toString().isEmpty()){
                Toast.makeText(applicationContext,"Enter both numbers!",Toast.LENGTH_LONG).show()
            }
            else{
                var num1=Integer.parseInt(number1.text.toString())
                var num2=Integer.parseInt(number2.text.toString())
                Toast.makeText(applicationContext,"Division of two numbers is "+(num1/num2),Toast.LENGTH_LONG).show()
            }
        }
    }
}