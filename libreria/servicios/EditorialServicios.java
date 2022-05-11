
package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Persistence;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;

public class EditorialServicios {
    
    public void nuevaEditorial() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese la editorial");
        String nombreEditorial = scan.nextLine();

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
        EntityManager em = emf.createEntityManager();

        Editorial editorial = new Editorial();

        editorial.setNombre(nombreEditorial);

        em.getTransaction().begin();
        em.persist(editorial);
        em.getTransaction().commit();

    }

    public void consultarEditorial() {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
        EntityManager em = emf.createEntityManager();

        System.out.println("Ingrese editorial a buscar");
        String nombre = scan.next();
        
        List<Editorial> editorial = em.createQuery("select a from Editorial as a where a.nombre like :nombre")
                .setParameter("nombre", "%" + nombre + "%")
                .getResultList();

        for (Editorial editorial1 : editorial) {
            System.out.println(editorial1);
            
        }

    }

    public void modificarEditorial() {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
        EntityManager em = emf.createEntityManager();

        System.out.println("Ingrese la editorial a modificar");
        String nombre = scan.nextLine();

        System.out.println("Ingrese el ID");
        Integer id = scan.nextInt();

        Editorial editorial = em.find(Editorial.class, id);
       
        System.out.println("Nuevo nombre de editorial");
        String nombreNuevo = scan.next();
        
        editorial.setNombre(nombreNuevo);
        
        em.getTransaction().begin();
        em.merge(editorial);
        em.getTransaction().commit();
    }

    public void eliminarEditorial() {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
        EntityManager em = emf.createEntityManager();

        System.out.println("Ingrese el ID de la editorial a eliminar");
        Integer id = scan.nextInt();

        Editorial editorial = em.find(Editorial.class, id);
        
        em.getTransaction().begin();
        em.remove(editorial);
        em.getTransaction().commit();

    }
    
    public static Editorial buscarEditorialId (Integer id){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
        EntityManager em = emf.createEntityManager();
        
        Editorial editorial = em.find(Editorial.class, id);
        
        if (editorial == null) {
            
            System.out.println("No se encontro una editorial con ese ID");
            System.out.println("Ingrese una nueva editorial a continuacion");
            
            EditorialServicios es = new EditorialServicios();
            es.nuevaEditorial();
            
        }
        
        return editorial;
    }
}
