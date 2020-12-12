package com.example.uts_2

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    fun Selesai(view: View) {
        finish()
    }

    override fun finish() {
        super.finish()
        var intentData = Intent()

        intentData.putExtra(TOTAL,1)

        setResult(Activity.RESULT_OK,intentData)
    }
}