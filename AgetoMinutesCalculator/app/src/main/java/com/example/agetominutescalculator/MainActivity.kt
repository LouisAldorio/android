package com.example.agetominutescalculator

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDatePicker.setOnClickListener {view ->
            clickDatePicker(view)
        }
    }

    fun clickDatePicker(view : View){
        val myCalender = Calendar.getInstance()
        val year = myCalender.get(Calendar.YEAR)
        val month = myCalender.get(Calendar.MONTH)
        val day = myCalender.get(Calendar.DAY_OF_MONTH)

        val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, selectedYear, selectedMonth, selectedDayOfMonth ->
            var stringCurrentDate = "$day/${month+1}/$year"
            val selectedDate = "$selectedDayOfMonth/${selectedMonth+1}/$selectedYear"
            tvSelectedDate.text = selectedDate

            //converting string to date to subtract it
            var sdf = SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH)
            var theBirthDate = sdf.parse(selectedDate)
            var currentDate = sdf.parse(stringCurrentDate)

            //subtract the time
            var diff = (currentDate.time - theBirthDate.time) / 60000

            tvSelectedDateInMinute.text = diff.toString()

        }, year,month,day)

        dpd.datePicker.maxDate = Date().time - 86400000
        dpd.show()
    }
}