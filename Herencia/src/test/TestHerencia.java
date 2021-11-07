
package test;

import domain.Cliente;
import domain.Empleado;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TestHerencia {
    public static void main(String[] args) {
        System.out.println("==================================================");
        Empleado empleado1 = new Empleado("Pablito", 5000.0);
        System.out.println("empleado1 = " + empleado1);
        System.out.println("==================================================");
        Empleado empleado2 = new Empleado("Fabio", 40000);
        System.out.println("empleado2 = " + empleado2);
        System.out.println("==================================================");
        Cliente cliente1 = new Cliente("Alejandra", new Date(), true,'F', 25, "Calle falsa 123");
        System.out.println("cliente1 = " + cliente1);
        System.out.println("==================================================");
    }
}
