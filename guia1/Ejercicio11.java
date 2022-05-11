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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =  new Scanner(System.in);
        
        System.out.println("Ingrese numero");        
        int num1 = leer.nextInt();
        
        int num2 = num1 % 2;
        
        if  ( num2 == 0 ){
            System.out.println("El numero es par");
        }
        else {
            System.out.println("El numero es impar");
        }
        
    
    }
    
}
/*. Crear un programa que dado un numero determine si es par o impar.*/