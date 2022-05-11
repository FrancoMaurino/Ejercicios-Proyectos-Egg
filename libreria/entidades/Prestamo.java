
package libreria.entidades;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Prestamo {
   
    @Id
    private int id;
    
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Temporal(TemporalType.DATE)
    private Date devolucion;
    @ManyToOne
    private Cliente cliente;///
    @ManyToOne
    private Libro libro;////para las relaciones

    public Prestamo() {
    }

    public Prestamo(int id, Date fecha, Date devolucion, Cliente cliente, Libro libro) {
        this.id = id;
        this.fecha = fecha;
        this.devolucion = devolucion;
        this.cliente = cliente;
        this.libro = libro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(Date devolucion) {
        this.devolucion = devolucion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "id=" + id + ", fecha=" + fecha + ", devolucion=" + devolucion + ", cliente=" + cliente + ", libro=" + libro + '}';
    }

   
    
    
}
