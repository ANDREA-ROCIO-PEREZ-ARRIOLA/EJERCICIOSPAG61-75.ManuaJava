import java.util.Scanner;

public class EliminarlaUltimaPalabra {
    /*4.Desarrollar un programa que elimine 
    la última palabra de una frase. */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        String frase = scanner.nextLine().trim();

        int ultimaPosicion = frase.lastIndexOf(" ");

        String resultado;
        if (ultimaPosicion != -1) {
            resultado = frase.substring(0, ultimaPosicion);
        } else {
            resultado = frase;
        }

        System.out.println("Frase sin la última palabra queda así: " + resultado);

        scanner.close();

    }

}
