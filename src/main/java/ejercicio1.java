//EJERCICIO 1

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        mediaAritmetica();
    }

    public static void mediaAritmetica(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número de notas: ");
        int numValores = sc.nextInt();
        int[] valores = new int[numValores];
        int suma = 0;
        for (int i = 0; i < numValores; i++) {
            System.out.println("Nota" + (i + 1) + ": ");
            valores[i] = sc.nextInt();
            suma += valores[i];
        }
        System.out.println("La media aritmética de los valores introducidos es: " + (suma / numValores));

    }
}
