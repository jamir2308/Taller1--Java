package co.edu.unac.poo2.cl03;

public class Profesor extends Persona {
    private String tipoContrato;

    public Profesor(long identificacion, String nombre, String apellido,String tipoContrato){
        super(identificacion,nombre,apellido);
        setTipoContrato(tipoContrato);
    }

    public void setTipoContrato(String tipoContrato){
        this.tipoContrato  = tipoContrato;
    }

    public String getTipoContrato(){
        return tipoContrato;
    }
}
