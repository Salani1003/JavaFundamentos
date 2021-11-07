
package ProyectoCaja;

public class Caja {
    //VARIABLES
    int ancho,alto,profundo;
    
    //CONSTRUCTORES
    public Caja(){
        System.out.println("Ejecutando el constructor");
    }
    public Caja(int a, int b, int c){
        this.ancho=a;
        this.alto=b;
        this.profundo=c;
    }
    
    
    //METODOS 
    
    public int calcularVolumen(){
        return this.ancho*this.alto*this.profundo;
    }
}
