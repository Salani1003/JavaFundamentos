
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        /*
        
        tipos primitivos : byte, short, int, long
         */

        byte numeroByte = 10;
        System.out.println("valor minimo byte : " + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte: " + Byte.MAX_VALUE);

        short numeroShort = 15;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("valor minimo short : " + Short.MIN_VALUE);
        System.out.println("Valor maximo short: " + Short.MAX_VALUE);

        int numeroInt = (int) 2147483647L;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("valor minimo int : " + Integer.MIN_VALUE);
        System.out.println("Valor maximo int: " + Integer.MAX_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor minimo Long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo Long: " + Long.MAX_VALUE);

        /*
        Tipos float  y double 
         */
        float numeroFloat = 10;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor minimo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo float: " + Float.MAX_VALUE);

        double numeroDouble = 10;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor minimo Double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo Double: " + Double.MAX_VALUE);

        var entero = 28;
        System.out.println("entero = " + entero);

        var numeroD = 150.25;
        System.out.println("numeroD = " + numeroD);

        var numeroF = 10.25F;
        System.out.println("numeroF = " + numeroF);

        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);

        char nuevoChar = '\u0021'; // list unicode
        System.out.println("nuevoChar = " + nuevoChar);

        char nuevoChar2 = 33;
        System.out.println("nuevoChar2 = " + nuevoChar2);

        System.out.println("==============VIDEO 20======================");

        var miCaracter2 = 'a';
        System.out.println("miCaracter2 = " + miCaracter2);

        int variableEnteraSimbolo = '!'; // entero  33
        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);

        int letra = 'a';
        System.out.println("letra = " + letra);

        System.out.println("==============VIDEO 21======================");

        boolean varBoolean = true;

        if (varBoolean) {
            System.out.println("Valor Verdadero");
        } else {
            System.out.println("Valor Falso");
        }
        var edad = 15;
        var adulto = edad >= 18;

        if (adulto) {
            System.out.println("Persona Adulta");
        } else {
            System.out.println("Persona Menor");
        }
        System.out.println("==============VIDEO 22======================");
        // convertir un tipo string a int
        var edad2 = Integer.parseInt("20");
        System.out.println("edad2 = " + (edad2 + 1));

        var edad3 = "20";
        System.out.println("edad3 = " + (edad3 + 1));

        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);

        var consola = new Scanner(System.in);
        System.out.println("Ingrese su edad:");
        edad = Integer.parseInt(consola.nextLine());
        System.out.println("Edad = " + edad);
        
        System.out.println("==============VIDEO 23======================");
        
        var edadTexto = String.valueOf(10); // convierte a string
        System.out.println("edadTexto = " + edadTexto);
        
        var caracter= "HOLA".charAt(0);
        System.out.println("caracter = " + caracter);
        
        System.out.println("Proporciona un caracter");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
        

     
        
    }
}
