package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        printf("Hello World")
        var a = 10
        val b = 20
        a = 30.5.toInt()
        a=10
        printf(""+a)
        printf(""+b)
    }

    private fun printf(str : String){
        Log.d("test", str)
    }
}