
import java.util.Scanner;

public class ejercicio3 {
    public static final Scanner sn = new Scanner(System.in);
    public static void main(String[] args) {
        mediaAritmetica();
    }

    public static void mediaAritmetica() {

        double nota = 0;
        double suma = 0;
        int contador = 0;
        int contador2 = 0;
        double media = 0;
        double porcentaje;
        while (nota != -1) {
            System.out.println("¿Nota (-1 para terminar)?: ");
            nota = sn.nextDouble();
            suma += nota;
            contador++;
            if (nota >= 10) {
                contador2++;
            }
        }
        media = suma / contador;
        porcentaje = contador2 * 100 / contador;
        System.out.println(String.format("La media es %.2f (%.2f %% >= 10)", media, porcentaje));
    }

}

