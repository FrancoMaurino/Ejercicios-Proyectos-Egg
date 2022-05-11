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
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de personas a promediar altura");
        int personas = leer.nextInt();
        
        int general = 0;
        int bajos = 0;
        int cont = 0;
        
        for ( int i = 0 ; i <= personas-1 ; i ++){
            System.out.println("Ingrese altura en cm");
            int altura = leer.nextInt();
            
            general = (general + altura);
            
            if (altura < 160){
            
                cont++;
                bajos = bajos + altura;  
            }
            
            
        }
        
        System.out.println("Altura promedio general " + general/personas + "cm");
        System.out.println("Algutura promedio por debajo de los 160cm " + bajos/cont + "cm");
        
    }
    
}
/*Leer la altura de N personas y determinar el promedio de estaturas que se
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.*/