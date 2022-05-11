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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("Ingrese el primer numero");
        int num1 =  leer.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        int num2 =  leer.nextInt(); 
        
        if (num1 > num2) {
        
            System.out.println("El numero mayor es " + num1);
       
        } else 
               {
        
         System.out.println("El numero mayor es " + num2);
    }
        
      
        
        
        
        
        
        
    }
    
}
/*Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.
*/