package com.example.calculadorawindows

class Operaciones {

    companion object {

        var numero1 = 0.0
        var numero2 = 0.0
        var resultado = 0.0
        var signo: String? = null

        fun suma(numero1: Double, numero2: Double): Double {
            return numero1 + numero2
        }

        fun resta(numero1: Double, numero2: Double): Double {
            return numero1 - numero2
        }

        fun mult(numero1: Double, numero2: Double): Double {
            return numero1 * numero2
        }

        fun div(numero1: Double, numero2: Double): Double {
            return numero1 / numero2
        }

        fun elegiroperacion(numero1: Double, numero2: Double, signo: String?): Double {
            when (signo) {
                "+" -> resultado = suma(numero1, numero2)
                "-" -> resultado = resta(numero1, numero2)
                "*" -> resultado = mult(numero1, numero2)
                "/" -> resultado = div(numero1, numero2)
                else -> {
                }
            }
            return resultado
        }
    }
}
