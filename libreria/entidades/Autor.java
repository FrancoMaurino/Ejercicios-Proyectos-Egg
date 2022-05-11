
package libreria.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Autor{
    
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int ID;
    private String nombre;

    public Autor() {
    }

    public Autor(String nombre, int ID) {
        this.nombre = nombre;
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", ID=" + ID + '}';
    }
    
    
}
