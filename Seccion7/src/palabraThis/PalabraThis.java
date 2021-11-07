
package palabraThis;


public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Pablito", "Salani");
        System.out.println("persona = " + persona);
        System.out.println("persona nombre = " + persona.nombre);
        System.out.println("persona Apellido= " + persona.apellido);
    }
}


class Persona {
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){
        // super() llamada implicita a la clase padre object
        this.nombre=nombre;
        this.apellido=apellido;
        System.out.println("Persona usando THIS = "+this); // imprimo el objeto perspona
        new Imprimir().imprimir(this); //paso como referencia el objeto persona con this
    }
}

class Imprimir{
    public void imprimir(Persona persona){
        System.out.println("persona desde imprimir  = " + persona); // imprimo el objeto persona
        System.out.println("Objeto this dentro de imprimit= " + this);//imprimo el objeto this en el cual estoy ahora
    }
}