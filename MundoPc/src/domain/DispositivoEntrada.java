
package domain;


public class DispositivoEntrada {
    
    protected String tipoDeEntrada;
    protected String marca;
    
    public DispositivoEntrada(String tipoDeEntrada , String marca){
        this.tipoDeEntrada= tipoDeEntrada;
        this.marca = marca;
        
    }

    public String getTipoDeEntrada() {
        return this.tipoDeEntrada;
    }

    public void setTipoDeEntrada(String tipoDeEntrada) {
        this.tipoDeEntrada = tipoDeEntrada;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DispositivoEntrada{tipoDeEntrada=").append(tipoDeEntrada);
        sb.append(", marca=").append(marca);
        sb.append('}'); 
        return sb.toString();
    }
    
    
}
