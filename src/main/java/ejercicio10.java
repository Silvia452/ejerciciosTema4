import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {
        arteASCII1();
    }

    public static void arteASCII1(){
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Anchura?");
        int anchura = sc.nextInt();

        System.out.println("¿Altura?");
        int altura = sc.nextInt();

        System.out.println("¿Carácter?");
        char caracter = sc.next().charAt(0);

        for (int i = 0; i < altura; i++) { //definimos la altura
            for (int j = 0; j < anchura; j++) { //definimos la anchura
                System.out.print(caracter);
            }
            System.out.println();
        }

    }
}
