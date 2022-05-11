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
public class e27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int contador = 0, dividendo, divisor, residuo =0;
        
        System.out.println("Ingrese dividendo");
        dividendo= leer.nextInt();
        
        System.out.println("Ingrese divisor");
        divisor= leer.nextInt();
        
       
        
        while (dividendo >= divisor ){
            contador  ++;
            
            dividendo = dividendo - divisor ;
            
        }
        System.out.println("El residuo es " + dividendo);
        System.out.println("El cociente es " + contador);
        
        
    }
    
}
/*. Simular la división usando solamente restas. Dados dos números enteros mayores
que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo
restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor
que el divisor, este resultado es el residuo, y el número de restas realizadas es el
cociente. Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3*/