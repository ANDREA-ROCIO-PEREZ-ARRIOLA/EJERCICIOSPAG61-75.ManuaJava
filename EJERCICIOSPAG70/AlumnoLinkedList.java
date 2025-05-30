import java.util.LinkedList;

public class AlumnoLinkedList {
    /*3. Crear una lista de tipo LinkedList con la misma 
    entidad que el ejercicio anterior. Inserte valores y muéstrelos 
    en pantalla. */

     private String codigo;
    private String nombre;
    private String carnet;

    public AlumnoLinkedList() {
    }

    public AlumnoLinkedList(String codigo, String nombre, String carnet) {
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

        LinkedList<AlumnoLinkedList> listaAlumnos = new LinkedList<>();

        listaAlumnos.add(new AlumnoLinkedList("01", "Ruth Hernández", "A12345"));
        listaAlumnos.add(new AlumnoLinkedList("02", "Milton Mendoza", "B67890"));
        listaAlumnos.add(new AlumnoLinkedList("03", "Dulce López", "C54321"));
        listaAlumnos.add(new AlumnoLinkedList("04", "Carlos García", "D98765"));
        listaAlumnos.add(new AlumnoLinkedList("05", "Sandra Torres", "E11223"));
        listaAlumnos.add(new AlumnoLinkedList("06", "Pedro Sánchez", "F44556"));

        System.out.println("Listado:");
        for (AlumnoLinkedList alumno : listaAlumnos) {
            System.out.println(alumno);
        }

        System.out.println("\nTamaño de la lista: " + listaAlumnos.size());


    }

}
