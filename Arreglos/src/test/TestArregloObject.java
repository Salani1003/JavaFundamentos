
package test;

import domain.Persona;


public class TestArregloObject {
    
    public static void main(String[] args) {
         Persona personas[]=new Persona[2]; 
         
         personas[0]=new Persona("Pablito");
         personas[1]=new Persona("Alejandra");
         
         System.out.println("personas 0= " + personas[0]);
         System.out.println("personas 1= " + personas[1]);

         for (int i = 0; i < personas.length; i++) {
             
             System.out.println("persona  "+i+"= " + personas[i] );
            
        }
    }
}
