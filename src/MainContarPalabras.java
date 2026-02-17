import java.util.HashMap;
import java.util.Scanner;

public class MainContarPalabras {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> contadorPalabras = new HashMap<>();

        System.out.println("Introduce un texto:");
        String texto = scanner.nextLine();

        String[] palabras = texto.toLowerCase().split(" ");

        for (String palabra : palabras) {
            if (contadorPalabras.containsKey(palabra)) {
                contadorPalabras.put(palabra, contadorPalabras.get(palabra) + 1);
            } else {
                contadorPalabras.put(palabra, 1);
            }
        }
        System.out.println("Frecuencia de palabras:");

        for (String palabra : contadorPalabras.keySet()) {
            System.out.println(palabra +" " +  contadorPalabras.get(palabra));
        }

        scanner.close();
    }
}