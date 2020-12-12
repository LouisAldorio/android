package com.example.uts_2

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var reqCode : Int = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Beli(view: View) {
        val intent = Intent(this,SecondActivity::class.java)
        startActivityForResult(intent,reqCode)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode ==reqCode && resultCode == Activity.RESULT_OK){
            var totalData = data?.getStringExtra(TOTAL)

            total.text = totalData.toString()
        }
    }
}