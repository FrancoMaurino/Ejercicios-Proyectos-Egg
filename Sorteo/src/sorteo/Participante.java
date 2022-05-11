package sorteo;

import java.util.Scanner;

public class Participante {

    private Integer numero;
    private String nombre;
    private Boolean ganador;

    public Integer getId() {
        return numero;
    }

    public void setId(Integer id) {
        this.numero = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getGanador() {
        return ganador;
    }

    public void setGanador(Boolean ganador) {
        this.ganador = ganador;
    }

    public void llenarParticipante() {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el numero del jugador");
        int numero = scan.nextInt();

        System.out.println("Ingrese el nombre del jugador");
        String nombre = scan.next();

        this.numero = numero;

        this.nombre = nombre;

        ganador = false;

    }

    public boolean chequear(Premio pr) {

        boolean gano = false;

        if (numero.equals(pr.getNumeroGanador())) {

            ganador = true;

            gano = true;
        }

        return gano;

    }

}
