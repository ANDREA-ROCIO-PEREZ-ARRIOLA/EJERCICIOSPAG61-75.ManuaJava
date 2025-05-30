import java.util.LinkedHashSet;
import java.util.Objects;

public class Libro {
    /*2. Desarrollar un programa que permita
     almacenar múltiples elementos de la clase
      Libro (Id, Título, Edición, Autor) en un LinkedHashSet. */

    private int id;
    private String titulo;
    private int edicion;
    private String autor;

    public Libro() {
    }	

    public Libro(int id, String titulo, int edicion, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.edicion = edicion;
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEdicion() {
        return edicion;
    }
    
    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Título: " + titulo + ", Edición: " + edicion + ", Autor: " + autor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, edicion, autor);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Libro)) return false;
        Libro libro = (Libro) obj;
        return id == libro.id && edicion == libro.edicion &&
                Objects.equals(titulo, libro.titulo) &&
                Objects.equals(autor, libro.autor);
    }

    public static void main(String[] args) {
        
        LinkedHashSet<Libro> biblioteca = new LinkedHashSet<>();

        biblioteca.add(new Libro(1,  "El Quijote", 3, "Miguel de Cervantes"));
        biblioteca.add(new Libro(2, "Cien años de soledad", 2, "Gabriel García Márquez"));
        biblioteca.add(new Libro(3, "Crimen y castigo", 1, "Fiódor Dostoyevski"));
        biblioteca.add(new Libro(4, "Orgullo y prejuicio", 5, "Jane Austen"));
        biblioteca.add(new Libro(5, "1984", 1, "George Orwell"));
        biblioteca.add(new Libro(1, "El Quijote", 3, "Miguel de Cervantes")); //Este es un registro duplicado
        biblioteca.add(new Libro(6, "El gran Gatsby", 1, "F. Scott Fitzgerald"));
    
        
        System.out.println("Lista de libros en la biblioteca:");
        for (Libro libro : biblioteca) {
            System.out.println(libro);
        }
    }

    }
    
    

