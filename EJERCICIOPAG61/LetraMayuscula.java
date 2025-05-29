import java.util.Scanner;

public class LetraMayuscula {
    /*3. Crear un programa que la cadena, sustituya por mayusculas la 
    primera letra de la cadena y la primera letra despues de un espacio */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una frase:");
        String cadena = scanner.nextLine();

        String[] palabras = cadena.split(" ");
        StringBuilder resultado = new StringBuilder();

        for (String palabra : palabras) {
            if (palabra.length() > 0) {
                resultado.append(Character.toUpperCase(palabra.charAt(0)))
                         .append(palabra.substring(1)).append(" ");
            }
        }
        if (resultado.length() > 0) {
            resultado.setLength(resultado.length() - 1);
        }
        System.out.println("Frase:" + resultado.toString());
        scanner.close();
    }

}
