//EJERCICIO 4
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        numeroAleatorio();

    }

    public static void numeroAleatorio(){
        int numeroAleatorio = (int) (Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        int numeroUsuario = 0;
        while (numeroUsuario != numeroAleatorio) {
            System.out.println("¿En qué número entre 1 y 100 estoy pensando? ");
            numeroUsuario = sc.nextInt();
            if (numeroUsuario > numeroAleatorio) {
                System.out.println("El número es menor");
            }
            else if (numeroUsuario < numeroAleatorio) {
                System.out.println("El número es mayor");
            }
            else {
                System.out.println("Bravo, lo ha encontrado");
            }
        }
    }

}
