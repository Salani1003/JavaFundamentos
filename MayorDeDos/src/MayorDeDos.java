
import java.util.Scanner;


public class MayorDeDos {
    public static void main (String args[]){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE EL PRIMER VALOR");
        int numero1= Integer.parseInt(scanner.nextLine());
        System.out.println("INGRESE EL SEGUNDO VALOR");
        int numero2=Integer.parseInt(scanner.nextLine());
        
        var resultado = (numero1 > numero2)? numero1: numero2;
        System.out.println("EL NUMERO MAYOR ES : "+ resultado);
        
    }
}
