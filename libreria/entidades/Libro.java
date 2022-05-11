
package libreria.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Libro  {
    
    @Id
    private long isbn;
    
    private String titulo;
    private int año;
    private int ejemplares;
    private int prestados;
    
    @ManyToOne
    private Autor autor;/////
    
    @ManyToOne
    private Editorial editorial;///////los ultimos dos crean las relaciones

    public Libro() {
    }

    public Libro(long isbn, String titulo, int año, int ejemplares, int prestados, Autor autor, Editorial editorial) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.año = año;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
        this.autor = autor;
        this.editorial = editorial;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", a\u00f1o=" + año + ", ejemplares=" + ejemplares + ", prestados=" + prestados + ", autor=" + autor + ", editorial=" + editorial + '}';
    }
    
    
    
    
    
}
