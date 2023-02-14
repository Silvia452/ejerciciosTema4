import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio7 {

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
                System.out.println("Cuidado, es una auténtica carnicería");
                switchOptions();
                break;
            case 2:
                System.out.println("Me llamo Bond, James Bond");
                switchOptions();
                break;
            case 3:
                System.out.println("¡Viva la vida!");
                switchOptions();
                break;
            case 4:
                System.out.println("¡Que la fuerza te acompañe!");
                switchOptions();
                break;
            case 5:
                System.out.println("¡Adiós!");
                break;

            default:
                System.out.println("Opción no válida");
                break;
        }
    }


}
