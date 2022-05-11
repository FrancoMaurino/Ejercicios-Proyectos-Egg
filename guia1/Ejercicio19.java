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
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una nota");
        int nota = leer.nextInt();
      
        while ( nota > 10 || nota < 0 ){
           System.out.println("La nota no es valida, ingrese otra"); 
           nota = leer.nextInt();
        }
        if ( nota < 10 && nota > 0 ){
            System.out.println("La nota ingresada es correcta");
        }
        
        
               
        
        
    }
    
}
/*. Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta*/