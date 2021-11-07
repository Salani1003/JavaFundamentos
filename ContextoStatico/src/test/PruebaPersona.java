
package test;

import dominio.Persona;


public class PruebaPersona {
    public static void main(String[] args) {
        
        Persona persona1= new Persona("Pablito");
        System.out.println("persona1 = " + persona1);
        Persona persona2 = new Persona("Juan");
        System.out.println("persona2 = " + persona2);
        Persona persona3 = new Persona("Alejandra");
        System.out.println("persona3 = " + persona3);
    }
    
    //si contadorPersona no fuera statico todos los id serian 1
    //un metodo static solo puede llamar a metodos de tipo static 
    //la palabra this no puede ser utilizado en metodos static  ya que 
    // cuando usamos static estamos en el contexto estatico y nos relacionamos con la clase y no con los objetos
}
