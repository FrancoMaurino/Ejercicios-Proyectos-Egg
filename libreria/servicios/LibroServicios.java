package libreria.servicios;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Libro;

public class LibroServicios {

    public void nuevolibro(){
    
    Scanner scan = new Scanner(System.in).useDelimiter("\n");;

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    EntityManager em = emf.createEntityManager();
    

    try {
        Libro libro = new Libro();

        System.out.println("Ingrese ISBN");
        libro.setIsbn(scan.nextLong());

        System.out.println("Ingrese Título");
        libro.setTitulo(scan.next());

        System.out.println("Ingrese Año");
        libro.setAño(scan.nextInt());

        System.out.println("Cantidad de ejemplares");
        libro.setEjemplares(scan.nextInt());
        libro.setPrestados(0);

        System.out.println("ID autor");
        int id = scan.nextInt();
        libro.setAutor(AutorServicios.buscarAutorId(id));

        System.out.println("ID editorial");
        int idE = scan.nextInt();
        libro.setEditorial(EditorialServicios.buscarEditorialId(idE));

        em.getTransaction().begin();
        em.persist(libro);
        em.getTransaction().commit();

    } catch (Exception e) {
        em.getTransaction().rollback();
        e.printStackTrace();
    }
    }

}
