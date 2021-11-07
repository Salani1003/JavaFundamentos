
package domain;

public class Raton extends DispositivoEntrada {
    
    private final int idRaton;
    private static int  contadorRaton;
    
   
    public Raton(String tipo, String marca){
        super(tipo, marca);
        this.idRaton = ++Raton.contadorRaton;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Raton{idRaton=").append(idRaton);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
