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
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una letra para verificar si es vocal");
        String letra = leer.nextLine();
        
        switch (letra){
            
            case "a": System.out.println("Si, es vocal");
            break;
            case "e": System.out.println("Si, es vocal");
            break;
            case "i": System.out.println("Si, es vocal");
            break;
            case "o": System.out.println("Si, es vocal");
            break;
            case "u": System.out.println("Si, es vocal");
            break;
            default: System.out.println("La letra ingresada no es vocal");
        }
        
        
    }
    
}
/*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una
vocal. Caso contrario mostrar un mensaje.*/