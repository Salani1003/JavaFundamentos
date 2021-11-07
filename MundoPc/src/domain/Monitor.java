package domain;

public class Monitor {

    private final int idMonitor;
    private static int contadorMonitor;
    private String marca;
    private double size;

    private Monitor() {
        this.idMonitor = ++Monitor.contadorMonitor;
    }

    public Monitor(String marca, double size) {
        this();
        this.marca = marca;
        this.size = size;
    }

    

    public int getIdMonitor() {
        return this.idMonitor;
    }


    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getSize() {
        return this.size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Monitor{idMonitor=").append(idMonitor);
        sb.append(", marca=").append(marca);
        sb.append(", size=").append(size);
        sb.append('}');
        return sb.toString();
    }
   

}
