package com.example.ejercicioeventoskotlin1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

import com.example.ejercicioeventoskotlin1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var contadorBoton1=0
        var contadorBoton2=0
        var total=0

        binding.button1.setText("Contador A ($contadorBoton1)")
        binding.button2.setText("Contador B ($contadorBoton2)")

        binding.button1.setOnClickListener{
            contadorBoton1++
            total++
            binding.textView1.setText("$contadorBoton1")
            (it as Button).setText("Contador A ($contadorBoton1)")
            binding.textView3.setText("$total")
            Toast.makeText(this@MainActivity,"$contadorBoton1", Toast.LENGTH_SHORT).show()

        }

        binding.button2.setOnClickListener{
            contadorBoton2++
            total++
            binding.textView2.setText("$contadorBoton2")
            (it as Button).setText("Contador B ($contadorBoton2)")
            binding.textView3.setText("$total")
            Toast.makeText(this@MainActivity,"$contadorBoton2",Toast.LENGTH_SHORT).show()
        }



    }
}