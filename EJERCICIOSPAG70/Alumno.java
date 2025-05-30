import java.util.ArrayList;

public class Alumno {
    /*2. Crear una clase entidad llamada Alumno con las propiedades: Código, Nombre y Carnet. Encapsule las 
propiedades y agregue los constructores. A partir de esta entidad crear una lista genérica de tipo ArrayList, 
insértele valores y luego muéstrelos en pantalla. */

    private String codigo;
    private String nombre;
    private String carnet;

    public Alumno() {
    }

    public Alumno(String codigo, String nombre, String carnet) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.carnet = carnet;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

   @Override
    public String toString() {
        return "Código: " + codigo + ", Nombre: " + nombre + ", Carnet: " + carnet;
    }


    public static void main(String[] args) {
        
       ArrayList<Alumno> listaAlumnos = new ArrayList<>();

        listaAlumnos.add(new Alumno("001", "Rocio Pérez", "A12345"));
        listaAlumnos.add(new Alumno("102", "Carlos Mendoza", "B67890"));
        listaAlumnos.add(new Alumno("103", "Ana López", "C54321"));
        listaAlumnos.add(new Alumno("104", "Luis García", "D98765"));
        listaAlumnos.add(new Alumno("105", "María Torres", "E11223"));
        listaAlumnos.add(new Alumno("106", "Pedro Sánchez", "F44556"));
        listaAlumnos.add(new Alumno("107", "Laura Jiménez", "G77889"));
        listaAlumnos.add(new Alumno("108", "Javier Ruiz", "H99001"));

        System.out.println("Lista de alumnos:");
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno);
        }

    }
}
