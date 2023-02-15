import java.util.Scanner;

public class ejercicio11 {

    public static void main(String[] args) {
        arteASCII2();


    }

    public static void arteASCII2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Tamaño?");
        int tamano = sc.nextInt();

        System.out.println("¿Carácter?");
        char caracter = sc.next().charAt(0);

        System.out.println("¿Forma?");
        System.out.println("1 - rectángulo con relleno");
        System.out.println("2 - rectángulo sin relleno");
        System.out.println("3 - cruz de San Andrés");
        System.out.println("4 - triángulo rectángulo");
        System.out.println("5 - rombo");
        System.out.println("6 - ajedrez");
        int forma = sc.nextInt();

        switch (forma) {
            case 1: //rectángulo con relleno
                for (int i = 0; i < tamano; i++) {
                    for (int j = 0; j < tamano; j++) {
                        System.out.print(caracter);
                    }
                    System.out.println();
                }
                break;
            case 2: //rectángulo sin relleno
                for (int i = 0; i < tamano; i++) {
                    for (int j = 0; j < tamano; j++) {
                        if (i == 0 || i == tamano - 1 || j == 0 || j == tamano - 1) {
                            System.out.print(caracter);
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 3: // cruz de San Andrés
                for (int i = 0; i < tamano; i++) {
                    for (int j = 0; j < tamano; j++) {
                        if (i == j || i + j == tamano - 1) {
                            System.out.print(caracter);
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 4: //triángulo rectángulo
                for (int i = 0; i < tamano; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print(caracter);
                    }
                    System.out.println();
                }
                break;
            case 5: //rombo
                for (int i = 0; i < tamano; i++) {
                    for (int j = 0; j < tamano - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < 2 * i + 1; j++) {
                        System.out.print(caracter);
                    }
                    System.out.println();
                }
                for (int i = tamano - 2; i >= 0; i--) {
                    for (int j = 0; j < tamano - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < 2 * i + 1; j++) {
                        System.out.print(caracter);
                    }
                    System.out.println();
                }
                break;
            case 6: //ajedrez
                for (int i = 0; i < tamano; i++) {
                    for (int j = 0; j < tamano; j++) {
                        if ((i + j) % 2 == 0) {
                            System.out.print(caracter);
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Forma no válida.");

        }
    }
}
