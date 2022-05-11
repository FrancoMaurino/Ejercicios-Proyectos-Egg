package estanciasjdbc.servicios;

import estanciasjdbc.entidades.Familia;
import estanciasjdbc.persistencia.FamiliaDao;
import java.util.Collection;
import java.util.List;


public class FamiliaServicio {

    private FamiliaDao fliaDao = new FamiliaDao();
    
    public List<Familia> listarFamilia() throws Exception {

        try {

            List<Familia> familias = fliaDao.listarFamilia();
            //mostrar
            return familias;

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error de sistema");
        }

    }
    
    public void imprimirFamilias() throws Exception {

        try {

            //Listamos los usuarios
            List<Familia> familias = listarFamilia();

            //Imprimimos los usuarios
            if (familias.isEmpty()) {
                throw new Exception("No existen familias para imprimir");
            } else {
                for (Familia f1 : familias) {

                    System.out.println(f1);

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error de sistema");
        }
    }
}

