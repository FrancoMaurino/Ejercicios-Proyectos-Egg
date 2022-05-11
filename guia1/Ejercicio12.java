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
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =  new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        String cadena = leer.nextLine();
        
        boolean resultado = cadena.equals("eureka");
        
         if ( resultado == true ) {
        
            System.out.println("Correcto");
        } 
         else
                {
            System.out.println("Incorrecto");
    }
                
        
        
    }
}
    
   
 
        
   /*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.*/     
    
   
    

