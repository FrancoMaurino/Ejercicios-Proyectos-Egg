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
public class e24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int cont = 0;
        int suma =0; 
        int num = 0;
      
        do {
          cont++;
            System.out.println("Ingrese numero");
            num = leer.nextInt();
            
            if (num > 0 ){
                suma = suma + num;
                                
            }
           
            
        } while (cont < 20 && num != 0);
      
        if (num == 0){
            System.out.println("Se capturó el numero cero");
        }
        System.out.println("la suma de los numeros es " + suma);
    }
    
}
/*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.*/