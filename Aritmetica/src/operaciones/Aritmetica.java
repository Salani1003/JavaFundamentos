
package operaciones;

public class Aritmetica {
    //VARIABLES
    int a;
    int b;
    //CONSTRUCTOR
    public Aritmetica(){
        System.out.println("Ejecutando el constructor");
    }
    public Aritmetica(int a , int b){
        this.a = a;
        this.b = b;
    }
        
    //METODOS
    public void sumar(){
        int resultado = this.a+this.b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno(){
        return(this.a+this.b);
    }
    public int sumarConArg(int num1, int num2){
        this.a=num1;
        this.b=num2;
        return this.sumarConRetorno();
    }
}
