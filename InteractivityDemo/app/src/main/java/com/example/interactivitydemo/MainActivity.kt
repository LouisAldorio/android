package com.example.interactivitydemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    fun LogIn(view : View){
        var username : EditText =  findViewById(R.id.usernameEditText)
        var password : EditText =  findViewById(R.id.passwordEditText)

        Log.i("password",password.text.toString())
        Log.i("username",username.text.toString())

        Toast.makeText( this,"Hey ${username.text.toString()}", Toast.LENGTH_SHORT).show()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}