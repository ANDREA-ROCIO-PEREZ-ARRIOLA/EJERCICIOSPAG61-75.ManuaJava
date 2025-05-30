import java.util.Scanner;

public class PromediodeNumeros {
    /*1. Desarrollar un programa que permita almacenar 
    cualquier valor numérico hasta que el usuario decida detener
     el programa, se debe calcular el promedio de los 
    números introducidos y la cantidad de números positivos. */

    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
        int contador = 0, positivos = 0;
        double suma = 0;
        
        while (true) {
            System.out.print("Ingresa un número (o escribe 'salir' para finalizar): ");
            if (scanner.hasNextDouble()) {
                double numero = scanner.nextDouble();
                suma += numero;
                contador++;

                if (numero > 0) {
                    positivos++;
                }
            } else {
                String entrada = scanner.next();
                if (entrada.equalsIgnoreCase("salir")) {
                    break;
                } else {
                    System.out.println("Entrada no válida. Ingresa un número o 'salir' para terminar.");
                }
            }
        }

        scanner.close();

        if (contador > 0) {
            double promedio = suma / contador;
            System.out.println("Cantidad de números ingresados: " + contador);
            System.out.println("Cantidad de números positivos: " + positivos);
            System.out.println("Promedio de los números ingresados: " + promedio);
        } else {
            System.out.println("No se ingresaron números.");
        }


    }

}
