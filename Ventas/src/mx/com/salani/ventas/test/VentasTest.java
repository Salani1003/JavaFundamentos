package mx.com.salani.ventas.test;

import mx.com.salani.ventas.*;

public class VentasTest {
    
    public static void main(String[] args) {
        
        Producto producto1 = new Producto("Camisa", 50);
        Producto producto2 = new Producto("Pantalon", 100);
        Producto producto3 = new Producto("Media", 20);
        Producto producto4 = new Producto("Calzon", 15);
        Producto producto5 = new Producto("Gorro", 35);
        
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto5);
        orden1.agregarProducto(producto3);
        orden1.imprimirOrden();
        
        Orden orden2 = new Orden();
        orden2.agregarProducto(producto4);
        orden2.agregarProducto(producto2);
        orden2.imprimirOrden();
        
    }
}
