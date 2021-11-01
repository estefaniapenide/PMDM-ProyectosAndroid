 */
package com.mycompany.calculadora;

/**
 *
 * @author a20estefaniapc
 */
class Operacion {
    
    public static double numero1;
    public static double numero2;
    public static double resultado;
    public static String signo;
    
    public static double suma(double numero1, double numero2){
    return numero1+numero2;
    }
    
    public static double resta(double numero1, double numero2){
    return numero1-numero2;
    }
    
    public static double mult(double numero1, double numero2){
    return numero1*numero2;
    }
    
    public static double div(double numero1, double numero2){
    return numero1/numero2;
    }
    
       public static double elegiroperacion(double numero1, double numero2, String signo){
        switch(signo){
            case "+":
                resultado=Operacion.suma(numero1, numero2);
                break;
            case "-":
                resultado=Operacion.resta(numero1, numero2);
                break;
            case "*":
                resultado=Operacion.mult(numero1, numero2);
                break;
            case "/":
                resultado=Operacion.div(numero1, numero2);
                break;
            default:
            break;
        }
                
    return resultado;
    }
    
    
}
