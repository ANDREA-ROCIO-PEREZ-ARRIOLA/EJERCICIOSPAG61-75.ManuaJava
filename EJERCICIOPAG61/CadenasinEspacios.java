import java.util.Scanner;

public class CadenasinEspacios {
    /*2. Crea un programa que lea una cadena 
    y quite los espacios en blanco. */ 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String cadena = scanner.nextLine();

        // Quitar los espacios en blanco
        String cadenaSinEspacios = cadena.replaceAll("\\s+", "");

        // Mostrar el resultado
        System.out.println("Frase sin espacios: " + cadenaSinEspacios);
        
        scanner.close();
    }

}
