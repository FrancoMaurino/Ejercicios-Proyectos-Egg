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
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese que clase de socio es:");
        String cadena = leer.nextLine();
        
        System.out.println("Ingrese el costo del tratamiento");
        int costo = leer.nextInt();
        
        switch (cadena){
            case "a": System.out.println("El importe a pagar es: " + (costo * 0.5) ); 
            break;
            case "b": System.out.println("El importe a pagar es: " + (costo * 0.65) );
            break;
            case "c": System.out.println("El importe a pagar es: " + costo ) ;
            break;
          
            default: System.out.println("Ingrese clase correcta (a,b o c)");
        }
        
        
        
        
        
        
    }
    
}
/*. Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos odontológicos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre
dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real
que represente el costo del tratamiento (previo al descuento) y determine el importe
en efectivo a pagar por dicho socio.
*/