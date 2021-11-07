
package domain;


public final class Persona {
 
    public final static int  MI_CONSTANTE=10;
    
    private String nombre;  
    //final+static+tipo asi se hace una constante con notacion MI_CONSTANTE_DE_PRUEBA
    public final void imprimir(){
        System.out.println("Metodo imprimir");
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
