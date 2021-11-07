
package domain;


public class Teclado extends DispositivoEntrada{
    private final int idTeclado;
    private static int contadorTeclado;
    
    
    public Teclado(String tipo, String marca){
        super(tipo, marca);
        this.idTeclado=++Teclado.contadorTeclado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teclado{idTeclado=").append(idTeclado);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
