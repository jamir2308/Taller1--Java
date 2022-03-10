package co.edu.unac.poo2.cl03;

public class Materia {
    private String nombre;
    private Profesor profesor;
    private Double nota;

    // public Materia(String nombre,Profesor profesor,Double nota){
    //     this.nombre = nombre;
    //     this.profesor = profesor;
    //     this.nota = nota;
    // }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota)throws AccountException {
        
        if (nota < 0 || nota > 5) {
            throw new AccountException("Error: La nota no es valida");
        } else {
            this.nota = nota;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



}
