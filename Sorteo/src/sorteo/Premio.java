package sorteo;

import java.util.Random;
import java.util.Scanner;

public class Premio {

    private String nombre;

    private Integer numeroGanador;

    public Premio(String nombre, Integer numeroGanador) {
        this.nombre = nombre;
        this.numeroGanador = numeroGanador;
    }

    public Premio() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumeroGanador() {
        return numeroGanador;
    }

    public void setNumeroGanador(Integer numeroGanador) {
        this.numeroGanador = numeroGanador;
    }

    public void llenarPremio() {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        Random rand = new Random();

        Integer num = rand.nextInt((6 - 1) + 1) + 1;

        System.out.println("Ingrese el premio");
        String nombre = scan.next();

        numeroGanador = num;
        
        this.nombre = nombre;

    }

    @Override
    public String toString() {
        return "Premio{" + "nombre=" + nombre + ", numeroGanador=" + numeroGanador + '}';
    }
    
    
    

}
