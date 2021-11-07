
import java.util.Scanner;


public class Main {
    public static void main (String args []){
        
        var consola = new Scanner(System.in);
        System.out.println("Ingrese el alto ");
        var alto = Double.parseDouble(consola.nextLine());
        System.out.println("Ingrese el ancho");
        var ancho = Double.parseDouble(consola.nextLine());
        
        var area = (alto * ancho);
        System.out.println("area = " + area);
        
        var perimetro = (alto + ancho)*2;
        System.out.println("perimetro = " + perimetro);
    }
}
