
import java.util.Scanner;

public class Calificaciones {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE LA CALIFICACION:");
        var calificacion = Integer.parseInt(scanner.nextLine());

        switch (calificacion) {
            case 9:
                System.out.println("A");
                break;
            case 10:
                System.out.println("A+");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("F");
        }
    }
}
