/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadora;

import java.util.Scanner;

/**
 *
 * @author a20estefaniapc
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String seguir="";
        do{
        System.out.println("Numero:");
        double numero1=input.nextDouble();
        
        System.out.println("Signo:");
        String signo=input.nextLine();
        
        System.out.println("Numero:");
        double numero2=input.nextDouble();
        
        System.out.println("seguir?");
        seguir=input.nextLine();
        Operacion a;
        if(signo=="+"){
        
        }
        
        }while(seguir=="s");
    }
    
}
