import java.util.Scanner;
import java.util.TreeSet;

public class EjercicioColeccionTreeSet {
    /*1. Desarrollar un programa que permita leer
     múltiples valores numéricos hasta que el
      usuario decida detener la lectura. Después, usará
    la colección TreeSet para mostrar el listado de los
    números ingresados ordenados de menor a mayor. */

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        TreeSet<Integer> numeros = new TreeSet<>();

        while (true) {
            System.out.print("Ingresa un número (o escribe 'salir' para terminar): ");
            if (scanner.hasNextInt()) {
                numeros.add(scanner.nextInt());
            } else {
                String entrada = scanner.next();
                if (entrada.equalsIgnoreCase("salir")) {
                    break;
                } else {
                    System.out.println("No valido. Ingresa un número o 'salir' para finalizar.");
                }
            }
        }

        scanner.close();

        System.out.println("Números ingresados ordenados de menor a mayor: " + numeros);

    }

}
