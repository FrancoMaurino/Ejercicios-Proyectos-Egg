package guia1;

import java.util.Scanner;

public class Ejercicio1 {


    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        int num1, num2, suma;
        
        System.out.println("ingrese el primer numero");
        
        num1 = leer.nextInt();
        
        System.out.println("ingrese el segundo numero");
        
        num2 = leer.nextInt();
        
        suma= num1 + num2;
        
        System.out.println("la suma de los numeros es " + suma); 
       
        
    }
    
}
