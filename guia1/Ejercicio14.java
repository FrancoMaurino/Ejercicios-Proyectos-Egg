/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        String cadena = leer.nextLine();
        
        String subcadena = cadena.substring(0,1);
        
             
        boolean resultado = subcadena.equals('a');
               
               
        if ( resultado == true ) {
            System.out.println("CORRECTO");
        }
        else if ( resultado == false ) {
            System.out.println("INCORRECTO");
        }
        
    }
    
}
/*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.*/