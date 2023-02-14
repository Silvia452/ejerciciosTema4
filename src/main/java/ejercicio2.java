//EJERCICIO 2


import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        mediaAritmetica();

    }

    public static void mediaAritmetica(){
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[100];
        int suma = 0;
        int i = 0;
        while (true) {
            System.out.println("¿Nota(-1 para terminar)? ");
            valores[i] = sc.nextInt();
            if (valores[i] == -1) {
                break;
            }
            suma += valores[i];
            i++;
        }
        System.out.println("La media aritmética de los valores introducidos es: " + (suma / i));
    }
}

