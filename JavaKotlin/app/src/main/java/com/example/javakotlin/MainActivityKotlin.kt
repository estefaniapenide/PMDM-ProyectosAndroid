package com.example.javakotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivityKotlin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_kotlin)

        val boton = findViewById<Button>(R.id.boton1)

        boton.setOnClickListener { v: View? ->
            val intent = Intent(this@MainActivityKotlin, MainActivity::class.java)
            startActivity(intent)
            Toast.makeText(this@MainActivityKotlin, "Pinchando en el botón", Toast.LENGTH_SHORT).show()
        }

        val tv1 = findViewById<TextView>(R.id.tv1)

        tv1.setOnClickListener { v: View? -> Toast.makeText(this@MainActivityKotlin, "Pinchando en el texto", Toast.LENGTH_SHORT).show() }
    }
}