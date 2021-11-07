
package test;

import domain.Computadora;
import domain.Monitor;
import domain.Orden;
import domain.Raton;
import domain.Teclado;


public class MundoPc {
    
    public static void main(String[] args) {
        
        Raton raton1 = new Raton("inalambrico","HP");
        Raton raton2 = new Raton("mecanico","ZEUS");
        Raton raton3 = new Raton("gamer","PEPINO");
        
        Teclado teclado1 = new Teclado("mecanico","GARGOLA");
        Teclado teclado2 = new Teclado("inalambrico","LOGITECH");
        Teclado teclado3 = new Teclado("clasico","PIRINOLA");

        Monitor monitor1 = new Monitor("CHULENGO", 16.5);
        Monitor monitor2 = new Monitor("SAMSUNG", 19.2);
        Monitor monitor3 = new Monitor("LG", 27.5);
        
        
        Computadora computadora1 = new Computadora("pc1", monitor1, teclado1,raton1);
        Computadora computadora2 = new Computadora("pc2", monitor1, teclado2,raton3);
        Computadora computadora3 = new Computadora("pc3", monitor3, teclado2,raton3);
        Computadora computadora4 = new Computadora("pc4", monitor2, teclado2,raton2);
        Computadora computadora5 = new Computadora("pc5", monitor3, teclado3,raton3);
        Computadora computadora6 = new Computadora("pc6", monitor3, teclado2,raton1);
        Computadora computadora7 = new Computadora("pc7", monitor3, teclado3,raton2);
        Computadora computadora8 = new Computadora("pc8", monitor2, teclado3,raton2);
        
        
        Orden orden1 = new Orden();
        Orden orden2 = new Orden();
        
        orden1.agregarComputadora(computadora8);
        orden1.agregarComputadora(computadora1);
        orden1.agregarComputadora(computadora3);
        orden1.agregarComputadora(computadora2);
        orden1.agregarComputadora(computadora4);
        orden1.agregarComputadora(computadora5);
        orden1.agregarComputadora(computadora6);
        orden1.agregarComputadora(computadora7);
        orden1.agregarComputadora(computadora2);
        orden1.agregarComputadora(computadora4);
        orden1.agregarComputadora(computadora3);
        
        
        orden1.mostrarOrden();
        
        
        orden2.agregarComputadora(computadora1);
        orden2.mostrarOrden();
    }
    
}
