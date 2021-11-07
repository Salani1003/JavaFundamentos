package dominio;

public class Persona {

    private int idPersona;
    private String nombre;
    private static int contadorPersonas; //static es una variable que se asocia con la clase y no con los objetos. 
    //ponemos static para que no se reinicie el contador cada vez que se usa el constructor en este caso.

    public Persona(String nombre) {

        this.nombre = nombre;
        Persona.contadorPersonas++;
        this.idPersona = Persona.contadorPersonas;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int aContadorPersonas) {
        contadorPersonas = aContadorPersonas;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
    
    
}
