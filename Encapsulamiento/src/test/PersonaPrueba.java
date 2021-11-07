package test;

import dominio.Persona;

public class PersonaPrueba {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Pablito", 40000, false);

//        System.out.println("persona1 nombre= " + persona1.getNombre());
//        System.out.println("persona1 sueldo = " + persona1.getSueldo());
//        System.out.println("persona1  estado = " + persona1.isEliminado());
        System.out.println("persona1 = " + persona1.toString());
        System.out.println("persona1 = " + persona1);
        //si esta definido toString() dentro de persona no hace falta ponerlo
    }
}
