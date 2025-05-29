import java.util.Scanner;

public class CantidadPalabras {
    /* 1. Desarrollar un programa que muestre la cantidad de palabras que contiene una frase. */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String frase = scanner.nextLine();

        // Dividir la frase en palabras usando espacios como delimitadores
        String[] palabras = frase.trim().split("\\s+");

        // Contar las palabras
        int cantidadPalabras = palabras.length;

        // Mostrar el resultado
        System.out.println("La cantidad de palabras en la frase es: " + cantidadPalabras);
        
        scanner.close();
    }

}
