//EJERCICIO 5

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        numeroAleatorio();

    }

    public static void numeroAleatorio(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elija un número del 1 al 100, luego presione cualquier tecla");

        int min = 1;
        int max = 100;
        int guess;
        int intentos = 0;

        while (true) {

            guess = (min + max) / 2;

            System.out.println("Pruebo con, " + guess + " ¿es mayor, menor o es el número (+/-/=)?");
            String respuesta = scanner.nextLine();

            if (respuesta.equals("+")) {
                min = guess + 1;
            } else if (respuesta.equals("-")) {
                max = guess - 1;
            } else if (respuesta.equals("=")) {
                System.out.println("Fenomenal, lo encontré después de " + intentos + " intentos.");
                break;
            } else {
                System.out.println("Respuesta no válida.");
                continue;
            }

            intentos++;
        }


}
}
