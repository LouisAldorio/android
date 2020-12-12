package com.example.mysimplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var lastNumeric : Boolean = false
    var lastDot : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onDigit(view : View){
        tvInput.append((view as Button).text)
        lastNumeric = true
    }

    fun Clear(view : View){
        tvInput.text = ""
        lastDot = false
        lastNumeric = false
    }

    fun OnDecimalPoint(view : View){
        if(lastNumeric && !lastDot){
            tvInput.append(".")
            lastDot = true
            lastNumeric = false
        }
    }

    fun onOperator(view :View){
        if(lastNumeric && !isOperatorAdded(tvInput.text.toString())){
            tvInput.append((view as Button).text)
            lastNumeric = false
            lastDot = false
        }
    }

    private fun isOperatorAdded(value : String) : Boolean{
        return if(value.startsWith("-")){
            false
        }else{
            value.contains("/") || value.contains("*") || value.contains("+") || value.contains("-")
        }
    }
}