package test;

import domain.Persona;

public class TestMatrices {

    public static void main(String[] args) {

        int edades[][] = new int[3][2];

        System.out.println("edades = " + edades);

        edades[0][0] = 5;
        edades[0][1] = 10;
        edades[1][0] = 15;
        edades[1][1] = 20;
        edades[2][0] = 25;
        edades[2][1] = 30;

        System.out.println("edades 0 -0 = " + edades[0][0]);
        System.out.println("edades 0 -1 = " + edades[0][1]);

        for (int i = 0; i < edades.length; i++) {
            for (int j = 0; j < edades[i].length; j++) {

                System.out.println("edades  = " + i + "-" + j + "= " + edades[i][j]);

            }

        }

        String frutas[][] = {{"Naranja", "Limon"}, {"Pera", "Durazno"}};
        imprimir(frutas);
        
        Persona personas[][]= new Persona[2][3];
        personas[0][0] = new Persona("Pablito");
        personas[0][1] = new Persona("Alejandra");
        personas[0][2] = new Persona("Lorenzo");
        personas[1][0] = new Persona("Ramiro");
        personas[1][1] = new Persona("Josefina");
        personas[1][2] = new Persona("Leo");
     
        
        
        imprimir(personas);
    }

    public static void imprimir(Object matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.println("matriz  desde metodo imprimir = " + matriz[i][j]);

            }

        }
    }
;

}
