package co.edu.unac.poo2.cl03;

public class Persona {
    private long identificacion;
    private String nombre;
    private String apellido;

    public Persona (long identificacion, String nombre, String apellido){
        setIdentificacion(identificacion);
        setApellido(apellido);
        setNombre(nombre);
    }

    public long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(long identificacion) {
        this.identificacion = identificacion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
