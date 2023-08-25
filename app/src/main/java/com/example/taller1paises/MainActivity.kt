package com.example.taller1paises

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val spinner = findViewById<Spinner>(R.id.spinner)
        val arrayAdapter = ArrayAdapter.createFromResource(this, R.array.regiones, android.R.layout.simple_spinner_item)
        spinner.adapter = arrayAdapter

    }
}