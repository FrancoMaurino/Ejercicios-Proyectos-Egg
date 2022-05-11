package sorteo;

import java.util.ArrayList;

public class Sorteo {

    private ArrayList<Participante> partipantes;
    
    private Premio premio;

    public Sorteo(ArrayList<Participante> partipantes, Premio premio) {
        this.partipantes = partipantes;
        this.premio = premio;
    }

    public Sorteo() {
    }

    public ArrayList<Participante> getPartipantes() {
        return partipantes;
    }

    public void setPartipantes(ArrayList<Participante> partipantes) {
        this.partipantes = partipantes;
    }

    public Premio getPremio() {
        return premio;
    }

    public void setPremio(Premio premio) {
        this.premio = premio;
    }

    public void llenarSorteo(ArrayList<Participante> partipantes, Premio pr) {
        
        this.partipantes = partipantes;

        this.premio = pr;
       

    }

    public void sorteo() {

        for (Participante partipante : partipantes) {

            if (partipante.chequear(premio)) {

                System.out.println("El premio " + premio.getNombre() + " lo gano " + partipante.getNombre());

                break;
            }

        }

    }

}
