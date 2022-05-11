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
public class e25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int cant=0;
        int par = 0;
        int impar = 0;
       do {
           System.out.println("Ingrese numero");
           int num = leer.nextInt();
          
           
           if (num % 5 == 0 ){
              
              break;
          } 
           if (num % 2 == 0 && num>0 ){
             par++;  
           } else {
               impar ++;
           }
           cant ++;
       } while ( cant >0 );
       
       System.out.println("La cantidad de numeros leidos es de " + cant);
       System.out.println("La cantidad de numeros pares es " + par);
        System.out.println("La cantidad de numeros impares es " + impar); 
        
       
    }
    
}
/*Escriba un programa que lea números enteros. Si el número es múltiplo de cinco
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de
números pares y la cantidad de números impares. Al igual que en el ejercicio
anterior los números negativos no deben sumarse. Nota: recordar el uso de la
sentencia break.*/