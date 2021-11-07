package domain;

public class Empleado extends Persona {

    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    //sobrecarga de constructores 
    public Empleado() {
        this.idEmpleado = ++Empleado.contadorEmpleado;

    }

    public Empleado(String nombre, double sueldo) {
        //super(nombre);
        this(); // hago referencia al constructor sin argumentos. 
        //tengo que inicializar todos los demas datos porque no puedo llamar al super
        this.nombre=nombre;
        this.sueldo = sueldo;

    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("").append(super.toString());
        sb.append("Empleado{idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append('}');
        return sb.toString();
    }

}
