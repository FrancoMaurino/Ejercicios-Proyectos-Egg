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
public class Ejerecicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new  Scanner(System.in);
        
        System.out.println("Ingrese horas trabajadas");
        
        int horas = leer.nextInt();
        
        System.out.println("Ingrese paga por hora");
        
        int paga = leer.nextInt();
        
        int salario = horas * paga ;
                
        System.out.println("El salario es " + salario);        
        
        
        
    }
    
}
/*Dada las horas trabajadas de una persona y el valor por hora. Calcular su salario e
imprimirlo. Salario = Hs. trabajadas * valor por hora*/