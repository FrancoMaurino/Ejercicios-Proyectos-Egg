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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese tiempo en minutos");
        
        int minutos =  leer.nextInt();
        
        int dias = minutos / 1440;
        
        int horas = (minutos - ( Math.round(dias)) * 1440) / 60 ;
        
        int mins = minutos - (dias * 1440 + horas * 60 );
        
        System.out.println( Math.round(dias) + " dias");
        
        System.out.println( horas + " horas");
        
        System.out.println(mins + " minutos");
        
        
        
        
        
    }
    
}
/*Dado un tiempo en minutos, calcular su equivalente en días, horas y minutos. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente:
1 día, 2 horas y 40 minutos*/