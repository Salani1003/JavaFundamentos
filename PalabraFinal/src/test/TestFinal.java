
package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        
        
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
        
            //miVariable = 15; no se puede reasignar el valor a una variable marcada con final
    
            //Persona.MI_CONSTANTE=8; no se puede modificar 
         System.out.println("MiConstante = " + Persona.MI_CONSTANTE); 
         
         final Persona persona1 = new Persona();
         //persona1= new Persona(); 
         //no se puede reasignar persona1 ya que se asigno como final, o sea modificar la referencia del objeto
         
         persona1.setNombre("Pablito");
         System.out.println("persona1 = " + persona1.getNombre());
    }
}
