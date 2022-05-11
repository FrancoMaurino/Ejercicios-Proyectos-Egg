package estancias.servicios;

import estancias.entidades.Casas;

import estancias.persitencia.CasasDAO;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/*

 */
public class CasasSs {

    private CasasDAO casa = new CasasDAO();

    public List<Casas> listarCasas() throws Exception {

        try {
            List<Casas> casita = casa.buscarCasas();
            return casita;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error de sistema");
        }
    }

    public void imprimirCasas() throws Exception {

        try {
            List<Casas> casita = casa.buscarCasas();
            //Validamos
            if (casita.isEmpty()) {
                throw new Exception("No existen familias para imprimir");
            } else {
                for (Casas casas : casita) {
                    System.out.println(casas);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error de sistema");
        }
    }

    public void imprimirBuscarFecha() throws Exception {
Scanner leer = new Scanner(System.in).useDelimiter("\n");
Date rango = new Date();
int cantidad;
String fecha;
SimpleDateFormat formato = new SimpleDateFormat("yyyy'-'MM'-'dd");
        try {
            System.out.println("Ingese una fecha YYYY/MM/DD");
            rango.setYear(leer.nextInt()-1900);
            rango.setMonth(leer.nextInt()-1);
            rango.setDate(leer.nextInt());
            fecha=formato.format(rango);
            System.out.println(fecha);
            System.out.println("Ingrese la cantidad de días");
            cantidad = leer.nextInt();
            List<Casas> casita = casa.disposiocionCasa(fecha, cantidad);
            //Validamos
            if (casita.isEmpty()) {
                throw new Exception("No existen casas para imprimir");
            } else {
                for (Casas casas : casita) {
                    System.out.println(casas);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error de sistema");
        }
    }
}
