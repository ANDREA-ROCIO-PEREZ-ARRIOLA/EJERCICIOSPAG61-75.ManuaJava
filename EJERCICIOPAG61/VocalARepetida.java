import java.util.Scanner;

public class VocalARepetida {
    /*5. Desarrollar un programa que muestre 
    la cantidad de veces que aparece la vocal “A” 
    en una frase ingresada por la persona usuaria.*/

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
         System.out.println("Ingrese una frase:");
         String frase = scanner.nextLine();

            int contador = 0;
            for (int i = 0; i < frase.length(); i++) {
                char caracter = frase.charAt(i);
                if (Character.toLowerCase(caracter) == 'a') {
                    contador++;
                }
            }

            System.out.println("La vocal 'A' aparece " + contador + " veces en la frase ingresada.");
            scanner.close();

    }

}
