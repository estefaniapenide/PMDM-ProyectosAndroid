package com.example.javakotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivityKotlinOtra : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_kotlin_otra)

        val boton1 = findViewById<Button>(R.id.button1)
        boton1.setOnClickListener {
            val intent = Intent(this@MainActivityKotlinOtra, MainActivity::class.java)
            startActivity(intent)
            Toast.makeText(this@MainActivityKotlinOtra, "Pinchando en el botón", Toast.LENGTH_SHORT).show()
        }


        val boton2 =findViewById<Button>(R.id.button2)
        var tv1 = findViewById<TextView>(R.id.tv1)
        var contador=0
        tv1.setText("Contador:\n"+contador.toString());
        boton2.setOnClickListener{
            contador++
            tv1.setText("Contador:\n"+contador.toString())
            Toast.makeText(this@MainActivityKotlinOtra,"Uno más", Toast.LENGTH_SHORT).show()
        }

        val boton3 = findViewById<Button>(R.id.button3)
        var contadorBoton=0
        boton3.setOnClickListener{
            contadorBoton++
            boton3.setText("Contador: "+contadorBoton.toString())
            Toast.makeText(this@MainActivityKotlinOtra,"Uno más", Toast.LENGTH_SHORT).show()
        }

        val boton4 =findViewById<Button>(R.id.button4)
        boton4.setOnClickListener{
            contador=0
            tv1.setText("Contador:\n"+contador.toString());
        }

        val boton5 =findViewById<Button>(R.id.button5)
        boton5.setOnClickListener{
            contadorBoton=0
            boton3.setText("Contador: "+contadorBoton.toString())
        }

        val boton6 =findViewById<Button>(R.id.button6)
        var fondo = findViewById<ConstraintLayout>(R.id.fondo)
        boton6.setOnClickListener{
            fondo.setBackgroundResource(R.color.white)
            boton6.setText("Cambia a Kotlin oscuro")
        }
    }
}