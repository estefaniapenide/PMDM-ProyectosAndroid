package com.example.calculadorawindows

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

import com.example.calculadorawindows.databinding.ActivityMainBinding

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
        var punto="."
        var igual="="
        var suma="+"
        var resta="-"
        var mult="x"
        var div="/"

        binding.textView.text=""

        var texto = binding.textView.getText().toString()
        var numero1 = 0.0
        var numero2 = 0.0
        var resultado = 0.0

        fun textoNumeros(digito:String){
            texto=texto+digito
            binding.textView.text=texto
        }

        fun guardarNumero1(numTexto : String){
            numero1 = numTexto.toDouble()
        }

        fun guardarNumero2(numTexto : String){
            numero2 = numTexto.toDouble()
        }

        fun guardarResultado(numero: Double){
            numero1=resultado
        }

        binding.textView2.setOnClickListener{
            textoNumeros(uno)
        }

        binding.textView3.setOnClickListener{
            textoNumeros(dos)
        }

        binding.textView4.setOnClickListener{
            textoNumeros(tres)
        }

        binding.textView5.setOnClickListener{
            textoNumeros(cuatro)
        }

        binding.textView6.setOnClickListener{
            textoNumeros(cinco)
        }

        binding.textView7.setOnClickListener{
            textoNumeros(seis)
        }

        binding.textView8.setOnClickListener{
            textoNumeros(siete)
        }

        binding.textView9.setOnClickListener{
            textoNumeros(ocho)
        }

        binding.textView10.setOnClickListener{
            textoNumeros(nueve)
        }

        binding.textView11.setOnClickListener{

        }

        binding.textView12.setOnClickListener{

        }

        binding.textView13.setOnClickListener{
            textoNumeros(punto)
        }

        binding.textView14.setOnClickListener{
            guardarNumero1(texto)
            textoNumeros(igual)
            texto=""

        }

        binding.textView15.setOnClickListener{

        }

        binding.textView16.setOnClickListener{

        }

        binding.textView17.setOnClickListener{

        }

        binding.textView18.setOnClickListener{

        }

        binding.textView19.setOnClickListener{

        }

        binding.textView20.setOnClickListener{

        }

        binding.textView21.setOnClickListener{

        }

        binding.textView22.setOnClickListener{

        }

        binding.textView23.setOnClickListener{
            binding.textView.text=""
            texto=""
        }

        binding.textView24.setOnClickListener{
            binding.textView.text=""
            texto=""
        }

        binding.textView25.setOnClickListener{

        }

    }
}