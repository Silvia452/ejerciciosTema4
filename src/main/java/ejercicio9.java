import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {
        multiploTres();
    }

    public static void multiploTres(){
        Scanner sc = new Scanner(System.in);
        int num;

        while (true) {

            System.out.print("Escriba un múltiplo de 3: ");
            num = sc.nextInt();

            if (num % 3 == 0) {
                System.out.println("Ok: " + num + " es un múltiplo de 3");
                break;
            } else {
                System.out.println("Error " + num + " no es un múltiplo de 3");
            }
        }

    }
}
