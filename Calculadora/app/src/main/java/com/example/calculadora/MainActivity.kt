package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.calculadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var uno="1"
        var dos="2"
        var tres="3"
        var cuatro="4"
        var cinco="5"
        var seis="6"
        var siete="7"
        var ocho="8"
        var nueve="9"
        var igual="="
        var suma="+"
        var resta="-"
        var mult="x"
        var div="/"

        binding.textView.text=""

        var texto = binding.textView.getText().toString()

        binding.button.setOnClickListener{
            texto=texto+uno
            binding.textView.setText(texto)
        }

        binding.button2.setOnClickListener{}

        binding.button3.setOnClickListener{}

        binding.button4.setOnClickListener{}

        binding.button5.setOnClickListener{}

        binding.button6.setOnClickListener{}

        binding.button7.setOnClickListener{}

        binding.button8.setOnClickListener{}

        binding.button9.setOnClickListener{}

        binding.button10.setOnClickListener{}

        binding.button11.setOnClickListener{}

        binding.button12.setOnClickListener{}

        binding.button13.setOnClickListener{}

        binding.button14.setOnClickListener{}

        binding.button15.setOnClickListener{}

        binding.button16.setOnClickListener{}

        binding.button17.setOnClickListener{}

        binding.button18.setOnClickListener{}

        binding.button19.setOnClickListener{}

    }
}