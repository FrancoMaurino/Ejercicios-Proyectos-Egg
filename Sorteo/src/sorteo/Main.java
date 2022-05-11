package sorteo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Premio pr = new Premio();

        pr.llenarPremio();
        
        System.out.println(pr);
        
        ArrayList<Participante> participantes = new ArrayList();

        for (int i = 0; i < 6; i++) {

            Participante p1 = new Participante();
            
            p1.llenarParticipante();
            
            participantes.add(p1);

        }
        
        Sorteo s1 = new Sorteo();
        
        s1.llenarSorteo(participantes, pr);
        
        s1.sorteo();


    }

}
