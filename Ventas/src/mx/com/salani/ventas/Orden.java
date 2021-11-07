
package mx.com.salani.ventas;


public class Orden {
    
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private final static int MAX_PRODUCTOS=10;
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
        
    }
   
    public void agregarProducto(Producto producto){
        if(this.contadorProductos < Orden.MAX_PRODUCTOS){
            this.productos[this.contadorProductos] = producto;
            System.out.println("El procutos se agrego correctamente");
            this.contadorProductos++;
            
        }else {
            System.out.println(" Supero el numero maximo de productos por orden= "+ Orden.MAX_PRODUCTOS);
        }
    }
//    public double calcularTotal(Producto productos[]){
//        double total=0;
//        for (int i = 0; i < productos.length; i++) {
//            if(productos[i].getPrecio() != 0){
//                total += productos[i].getPrecio();
//            }
//        }
//        return total;
//    }
    
    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            total+=this.productos[i].getPrecio();
            
        }
        return total;
    }
    
    public void imprimirOrden(){
        System.out.println("ID de la orden = " +this.idOrden);
        System.out.println("Se imprimira el detalle de la orden");
        System.out.println("======================================");
        for (int i = 0; i <this.contadorProductos; i++) {
            System.out.println("Producto = " +i+ this.productos[i].getNombre());
            System.out.println("Precio = " + this.productos[i].getPrecio());
            System.out.println("======================================");
        }
        
        System.out.println("TOTAL = " + this.calcularTotal());
        
    }
}
