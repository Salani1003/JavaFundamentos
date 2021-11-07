package test;

import operaciones.Operaciones;

public class TestOperaciones {

    public static void main(String[] args) {
        var resultado = Operaciones.sumar(10, 15);
        System.out.println("resultado = " + resultado);

        System.out.println("=========================");

        var resultado2 = Operaciones.sumar(10.5, 11.2);
        System.out.println("resultado2= " + resultado2);
        System.out.println("=========================");

    }
}
