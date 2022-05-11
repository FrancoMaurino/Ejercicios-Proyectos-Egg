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
public class e30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese tamaño de la escalera");
        int alto = leer.nextInt();
        
        for (int i = 1 ; i <= alto ;  i ++){
            for (int j=1 ; j <= i ; j ++ ){
                System.out.print(j);
            } 
            System.out.println(" ");
            
        }
    }
    
}
/*Crear un programa que dibuje una escalera de números, donde cada línea de
números comience en uno y termine en el número de la línea. Solicitar la altura de la
escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123*/