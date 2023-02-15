//TODO:mostrar además el porcentaje de notas superiores a 10/20

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        mediaAritmetica();

    }

    public static void mediaAritmetica(){

        Scanner sc = new Scanner(System.in);
        int[] valores = new int[100];
        int suma = 0;
        int i = 0;
        int contadorNotasAltas = 0;
        while (true) {
            System.out.println("¿Nota(-1 para terminar)? ");
            valores[i] = sc.nextInt();
            if (valores[i] == -1) {
                break;
            }
            else if (valores[i] >= 10 || valores[i] >=20){
                contadorNotasAltas++;
            }

            suma += valores[i];
            i++;
        }
        System.out.println("La media aritmética de los valores introducidos es: " + (suma / i));
        System.out.println("Las notas que superan 10/20: " +  contadorNotasAltas*10 +" %" );
    }

}

