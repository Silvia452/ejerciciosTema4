import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ejercicio8 {
    public static final Scanner sn = new Scanner(System.in);

    public static void main(String[] args) {
        switchOptions();

    }

    public static void switchOptions() throws InputMismatchException {
        boolean repeat = false;
        do{
            try{
                repeat=false;
                System.out.println("1 - Una cita de la ciudad del miedo\n" +
                        "2 - Una cita de James Bond\n" +
                        "3 - Una cita de la vida es un largo río tranquilo\n" +
                        "4 - Una cita de Star Wars\n" +
                        "5 - Salir de esta magnífica aplicación.");
                int choice = sn.nextInt();
                if (choice <1||choice>5)
                    throw new OutofRangeException("Error. Tienes que introducir un número entre 1 y 5"); //Excepcion introducida para comprobar que los valores esten entre 0 y 5
                Menu(choice);

            } catch (OutofRangeException e) {
                throw new RuntimeException(e);
            }

        }while(repeat);
    }

    public static void Menu(int option){

        switch(option){
            case 1:
                String[] x = {"Cuidado, es una auténtica carnicería", "Miedo a no enfrentar tus miedos"};
                Random rand = new Random();

                int n = rand.nextInt(2);
                String z = x [n];
                System.out.println(z);
                switchOptions();
                break;
            case 2:
                String[] x1 = {"Me llamo Bond, James Bond", "Bond. James Bond", "El amor es difícil"};
                Random random1 = new Random();
                int n1 = random1.nextInt(3);
                String z1 = x1 [n1];
                System.out.println(z1);
                switchOptions();
                break;
            case 3:
                String[] x3 = {"¡Viva la vida!", "Disfruta de la vida"};
                Random random3 = new Random();
                int n3 = random3.nextInt(2);
                String z3 = x3 [n3];
                System.out.println(z3);
                switchOptions();
                break;
            case 4:
                String[] x2 = {"¡Que la fuerza te acompañe!", "Algún día seré el Jedi más poderoso de todos los tiempos"};
                Random random2 = new Random();
                int n2 = random2.nextInt(2);
                String z2 = x2 [n2];
                System.out.println(z2);
                switchOptions();
                break;
            case 5:
                String[] xadios = {"¡Hasta la próxima!", "¡Adiós!"};
                Random random = new Random();
                int n5 = random.nextInt(2);
                String z5 = xadios [n5];
                System.out.println(z5);

                break;

            default:
                System.out.println("Opción no válida");
                break;
        }
    }
}
