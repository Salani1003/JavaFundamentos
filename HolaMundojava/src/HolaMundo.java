
import java.util.Scanner;

// Mi primer clase JAVA

public class HolaMundo {

    public static void main(String args[]) {
        System.out.println("Hola Mundo!");

        int entero = 10;
        System.out.println(entero);

        entero = 5;
        System.out.println(entero);

        String variableCadena = "Saludos Terricolas";
        System.out.println(variableCadena);

        variableCadena = "Adios!";
        System.out.println(variableCadena);

        var variableEntera2 = 15;
        System.out.println(variableEntera2);

        var variableCadena2 = "Malditos traumas de la niñez";
        System.out.println("Variable cadena 2 : " + variableCadena2);

        var usuario = "Juan";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario; // concatenacion de strings
        System.out.println("union = " + union);

        var i = 3;
        var j = 4;

        System.out.println(i + j); // suma de numeros! 

        System.out.println(i + j + union);// se evaluan de izquierda a derecha. primero suma despues concatena.
        System.out.println(union + i + j);// si primero encuentra numeros los suma y despues concatena la cadena, si primero encuentra cadena, toma todo como cadena.
        System.out.println(union + (i + j));// con parentesis modificamos la prioridad.

        var nombre = "Alejandra";
        System.out.println("Nueva Linea: \n" + nombre); // salto de linea
        System.out.println("Tabulador: \t" + nombre); // tabulador
        System.out.println("Retroceso: \b" + nombre); // Retroceso de un caracter
        System.out.println("Retroceso: \b\b" + nombre);
        System.out.println("Comilla simple: '"+nombre+"'"); // comilla siemple
        System.out.println("Comilla Doble: \"" + nombre+ "\""); // comilla doble
        
        System.out.println("=============SCANNER==================");
        System.out.println("Ingrese nombre:");
        Scanner consola = new Scanner(System.in);
        var user =consola.nextLine();
        System.out.println("user = " + user);
        System.out.println("Escribi el titulo");
        var title=consola.nextLine();
        System.out.println("Resultado: "+title+ " "+ user);
        
        System.out.println("================TAREA LIBROS===============");
        System.out.println("Proporciona el titulo:");
        var tituloLibro =consola.nextLine();
        System.out.println("Proporciona el Autor:");
        var autor =consola.nextLine();
        System.out.println(tituloLibro+ " fue escrito por "+ autor);
        
    }
}
