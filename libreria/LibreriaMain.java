package libreria;

import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.servicios.AutorServicios;
import libreria.servicios.EditorialServicios;
import libreria.servicios.LibroServicios;

public class LibreriaMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        
        AutorServicios as = new AutorServicios();
        EditorialServicios es = new EditorialServicios();
        LibroServicios ls = new LibroServicios();
                
//        as.nuevoAutor();
//        as.consultarAutor();
//        as.modificarAutor();
//        as.eliminarAutor();

//       es.nuevaEditorial();
//       es.eliminarEditorial();
 
 
       ls.nuevolibro();




    }

}
