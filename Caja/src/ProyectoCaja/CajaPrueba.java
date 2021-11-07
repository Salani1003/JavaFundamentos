
package ProyectoCaja;

public class CajaPrueba {
    
    public static void main(String[] args) {
        
        Caja caja1 = new Caja();
        caja1.ancho=2;
        caja1.alto=2;
        caja1.profundo=2;
        Caja caja2 = new Caja(3,2,6);
        
        int volumen1 = caja1.calcularVolumen();
        System.out.println("volumen1 = " + volumen1);
        int volumen2 = caja2.calcularVolumen();
        System.out.println("volumen2 = " + volumen2);
    }
    
}
