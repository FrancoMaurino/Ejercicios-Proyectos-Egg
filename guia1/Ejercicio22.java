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
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese cantidad de nuemeros");
        int numeros = leer.nextInt();
        
        int cont= 0 ;
        int mayor = 0 ;
        int menor= 100000 ;
        int suma= 0 ;
        do {
            System.out.println("Ingrese valores");
            int valor = leer.nextInt();
            
            cont++;
            
            
            if (valor > mayor){
               mayor = valor ;
           }
            
            if (valor< menor){
              menor = valor;  
            }
           
            suma= suma + valor;
         
            
        } while (numeros>cont);
       
       
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
        System.out.println("El promedio de los numero es: " + suma/numeros);
       
    }
    
}
/*. Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y
los números serán introducidos por el usuario. Realice dos versiones del programa,
una usando el bucle “while” y otra con el bucle “do - while”.
*/