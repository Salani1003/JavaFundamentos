
package PorReferencia;

import Clases.Persona;


public class PorReferencia {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona();
        persona1.nombre = "Pablo";
        persona1.apellido= "Salani";
        System.out.println("persona1  nombre = " + persona1.nombre);
        
        cambiarValor(persona1);
        persona1.desplegarInfo();
    }
    public static void cambiarValor(Persona persona){
        persona.nombre="Alejandra";
        persona.apellido="Spinelli";
    }
    
}
