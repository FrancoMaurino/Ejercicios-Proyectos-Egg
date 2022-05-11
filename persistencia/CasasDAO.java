package estancias.persitencia;

import estancias.entidades.Casas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
b) Buscar y listar las casas disponibles para el periodo comprendido entre el 1 de
agosto de 2020 y el 31 de agosto de 2020 en Reino Unido.
 */
public class CasasDAO extends DAO {

    public List<Casas> buscarCasas() throws Exception {

        try {
            //Armo el sql //select * from familias where num_hijos >=3 and edad_maxima<=10;
            String sql = "SELECT *from casas"
                    + "WHERE fecha_desde = '2020-08-01'"
                    + "                    AND fecha_hasta ='2020-08-31'"
                    + " AND pais = 'Reino Unido'";
            //Consulto la base de datos
            consultarBase(sql);
            //Recorremos el resultado de la consulta
            Casas casita = null;
            List<Casas> casa = new ArrayList();

            while (resultado.next()) {

                casita = new Casas();
                casita.setId_casa(resultado.getInt(1));
                casita.setCalle(resultado.getString(2));
                casita.setNumero(resultado.getInt(3));
                casita.setCodigo_postal(resultado.getString(4));
                casita.setCiudad(resultado.getString(5));
                casita.setPais(resultado.getString(6));
                casita.setFecha_desde(resultado.getDate(7));
                casita.setFecha_hasta(resultado.getDate(8));
                casita.setTiempo_minimo(resultado.getInt(9));
                casita.setTiempo_maximo(resultado.getInt(10));
                casita.setPrecio_habitacion(resultado.getBigDecimal(11));
                casita.setTipo_vivienda(resultado.getString(12));
                casa.add(casita);
            }
            return casa;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error de sistema");
        } finally {
            desconectarBase();
        }
    }

    /*e) Consulta la BD para que te devuelva aquellas casas disponibles a partir de una fecha
dada y un número de días específico.*/
    public List<Casas> disposiocionCasa(String rango, int cantidad) throws Exception {

        try {
            
            if (rango == null || cantidad == 0) {
                throw new Exception("Debe indicar en que fracha y cantidad de dias que requiere una casa");
            }
            //Armo el sql //select * from familias where num_hijos >=3 and edad_maxima<=10;
            String sql = "SELECT * FROM casas where fecha_desde >= '" + rango
                    + "' and " + cantidad + " between tiempo_minimo and tiempo_maximo";
            //Consulto la base de datos
            consultarBase(sql);
            //Recorremos el resultado de la consulta
            Casas casita = null;
            List<Casas> casa = new ArrayList();

            while (resultado.next()) {

                casita = new Casas();
                casita.setId_casa(resultado.getInt(1));
                casita.setCalle(resultado.getString(2));
                casita.setNumero(resultado.getInt(3));
                casita.setCodigo_postal(resultado.getString(4));
                casita.setCiudad(resultado.getString(5));
                casita.setPais(resultado.getString(6));
                casita.setFecha_desde(resultado.getDate(7));
                casita.setFecha_hasta(resultado.getDate(8));
                casita.setTiempo_minimo(resultado.getInt(9));
                casita.setTiempo_maximo(resultado.getInt(10));
                casita.setPrecio_habitacion(resultado.getBigDecimal(11));
                casita.setTipo_vivienda(resultado.getString(12));
                casa.add(casita);
            }
            return casa;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error de sistema");
        } finally {
            desconectarBase();
        }
    }

}
