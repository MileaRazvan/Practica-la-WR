package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun animale(view: View) {
        setContentView(R.layout.animale)
    }

    fun oras(view: View) {
        setContentView(R.layout.oras)
    }

    fun masina(view: View) {
        setContentView(R.layout.masini)
    }
    fun back(view: View){
        setContentView(R.layout.activity_main)
    }



}