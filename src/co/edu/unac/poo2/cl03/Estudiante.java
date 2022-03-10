package co.edu.unac.poo2.cl03;

public class Estudiante extends Persona {

    private String semestreActual;
    private Materia materia;

    public Estudiante(long identificacion, String nombre, String apellido,String semestreActual){
        super(identificacion,nombre,apellido);
        setSemestreactual(semestreActual);
    }

    public void setSemestreactual(String semestreActual){
        this.semestreActual  = semestreActual;
    }

    public String getSemestreactual(){
        return semestreActual;
    }

    public void setMateria(Materia materia){
        this.materia  = materia;
    }

    public Materia getMateria(){
        return materia;
    }
    
}
