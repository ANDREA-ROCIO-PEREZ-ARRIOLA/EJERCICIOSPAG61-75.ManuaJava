import java.util.Scanner;

public class PalabraPalindroma {
    /*6. Crear un programa que muestre si la palabra 
    ingresada por el usuario es palíndroma o no. */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una palabra:");
        String palabra = scanner.nextLine();

        String palabraInvertida = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabraInvertida += palabra.charAt(i);
        }
        if (palabra.equalsIgnoreCase(palabraInvertida)) {
            System.out.println("La palabra es palíndroma.");
        } else {
            System.out.println("La palabra no es palíndroma.");
        }
        
        scanner.close();
    }

}
