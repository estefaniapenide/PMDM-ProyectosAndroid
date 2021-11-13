package com.example.dados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isGone
import com.example.dados.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvPulsaDado.visibility=View.INVISIBLE

        binding.tiraDado.setOnClickListener{
            tirarDado()
            binding.tiraDado.visibility= View.GONE
            binding.tvPulsaDado.visibility=View.VISIBLE

        }

        binding.dado.setOnClickListener{
            tirarDado()
        }
    }

    fun tirarDado(){
        val numero = Random.nextInt(1,7)

        val imagen = when(numero){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            6->R.drawable.dice_6
            else->R.drawable.empty_dice
        }

        binding.dado.setImageResource(imagen)
    }
}