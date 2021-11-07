
package Clases;


public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1;
        persona1 = new Persona();
        persona1.nombre="Pablito";
        persona1.apellido="Salani";
        persona1.desplegarInfo();
        
        Persona persona2= new Persona();
        System.out.println("Persona1= "+ persona1 );
        System.out.println("Persona2 ="+ persona2);
        
        persona2.desplegarInfo();
        
        persona2.nombre= "Alejandra";
        persona2.apellido="Spinelli";
        
        persona2.desplegarInfo();
        
    }
}
