package domain;

public class Orden {

    private int idOrden;
    private Computadora computadora[];
    private static int contadorOrden;
    private static final int MAX_COMPUTADORA = 10;
    private int contadorComputadoras;

    public Orden() {
        this.idOrden = ++Orden.contadorOrden;
        this.computadora = new Computadora[Orden.MAX_COMPUTADORA];
    }

    public void agregarComputadora(Computadora computadora) {
        if (this.contadorComputadoras < Orden.MAX_COMPUTADORA) {
            this.computadora[this.contadorComputadoras++] = computadora;
            System.out.println("Se agrego una computadora con exito");

        } else {
            System.out.println(" Alcanzo el numero maximo de computadoras en una orden");
        }
    }

    public void mostrarOrden() {
        System.out.println("Generando reporte");
        System.out.println("=======================================");

        System.out.println("Orden numero = " + this.getIdOrden());

        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println("Computadora  = " + this.computadora[i].toString());

        }
        System.out.println("=======================================");
        System.out.println("GRACIAS POR ELEGIRNOS");
        System.out.println("=======================================");
    }

    public int getIdOrden() {
        return this.idOrden;
    }

}
