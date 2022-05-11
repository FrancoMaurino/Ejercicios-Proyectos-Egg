package libreria.servicios;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Persistence;
import libreria.entidades.Autor;

public class AutorServicios {

    public void nuevoAutor() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el nombre");
        String nombre = scan.nextLine();

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
        EntityManager em = emf.createEntityManager();

        Autor autor = new Autor();

        autor.setNombre(nombre);

        em.getTransaction().begin();
        em.persist(autor);
        em.getTransaction().commit();

    }

    public void consultarAutor() {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
        EntityManager em = emf.createEntityManager();

        System.out.println("Ingrese autor a buscar");
        String nombre = scan.next();
        
        List<Autor> autor = em.createQuery("select a from Autor as a where a.nombre like :nombre")
                .setParameter("nombre", "%" + nombre + "%")
                .getResultList();

        for (Autor autor1 : autor) {
            System.out.println(autor1);
            
        }

    }

    public void modificarAutor() {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
        EntityManager em = emf.createEntityManager();

        System.out.println("Ingrese el nombre a modificar");
        String nombre = scan.nextLine();

        System.out.println("Ingrese el ID");
        Integer id = scan.nextInt();

        Autor autor = em.find(Autor.class, id);
       
        System.out.println("Nuevo nombre");
        String nombreNuevo = scan.next();
        
        autor.setNombre(nombreNuevo);
        
        em.getTransaction().begin();
        em.merge(autor);
        em.getTransaction().commit();
    }

    public void eliminarAutor() {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
        EntityManager em = emf.createEntityManager();

        System.out.println("Ingrese el ID a eliminar");
        Integer id = scan.nextInt();

        Autor autor = em.find(Autor.class, id);
        
        em.getTransaction().begin();
        em.remove(autor);
        em.getTransaction().commit();

    }
    
    public static Autor buscarAutorId (Integer id){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
        EntityManager em = emf.createEntityManager();
        
        Autor autor = em.find(Autor.class, id);
        
        if (autor == null) {
            
            System.out.println("No se encontro un autor con ese ID");
            System.out.println("Ingrese un nuevo autor a continuacion");
            
            AutorServicios as = new AutorServicios();
            as.nuevoAutor();
            
        }
        
        return autor;
    }
}
