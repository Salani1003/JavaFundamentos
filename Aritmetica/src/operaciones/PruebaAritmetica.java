
package operaciones;

public class PruebaAritmetica {
   
    public static void main(String[] args) {
       int resultado;
        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("=============================== " );
        System.out.println("aritmetica1 a : "+ aritmetica1.a );
        System.out.println("aritmetica1 b : "+ aritmetica1.b );
        System.out.println("=============================== " );
        System.out.println("LLAMANDO CONSTRUCTOR CON ARG " );
        Aritmetica aritmetica2 = new Aritmetica(7,9);
        System.out.println("aritmetica2 a = " + aritmetica2.a);
        System.out.println("aritmetica2 b = " + aritmetica2.b);
        
        System.out.println("=============================== " );
        aritmetica1.a=3;
        aritmetica1.b=2;
        aritmetica1.sumar();
        
        resultado= aritmetica1.sumarConRetorno();
        System.out.println("resultado con retorno = " + resultado);
       
        resultado= aritmetica1.sumarConArg(5, 8);
        System.out.println("resultado con arg = " + resultado);
       }
    
     
    
}
