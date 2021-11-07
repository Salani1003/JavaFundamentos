
import java.util.Scanner;


public class TareaLibros {
    public static void main (String args []){
        var consola = new Scanner(System.in);
        
        String nombre;
        int id;
        double precio;
        boolean envioGratuito;
        
        System.out.println("Proporciona el nombre:");
        nombre = consola.nextLine();
        System.out.println("Proporciona ID :");
        id= Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona precio: ");
        precio = Double.parseDouble(consola.nextLine());
        System.out.println("Proporcina envio : ");
        envioGratuito = Boolean.parseBoolean(consola.nextLine());
        
        System.out.println(nombre + " #"+id);
        System.out.println("Precio: "+ precio);
        System.out.println("Envio gratuito: "+ envioGratuito );
    }
    
}
