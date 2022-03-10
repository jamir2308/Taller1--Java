import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

import co.edu.unac.poo2.cl03.Estudiante;
import co.edu.unac.poo2.cl03.Materia;
import co.edu.unac.poo2.cl03.Profesor;

public class Main {
    
    public static void main(String[] args) throws Exception {
        
        

        List<Estudiante> estudiantes = new ArrayList<Estudiante>();
        List<Profesor> profesores = new ArrayList<Profesor>();


        Estudiante estudiante1 = new Estudiante(125632145,"Carlos","Pedraza","Quinto");
        Estudiante estudiante2 = new Estudiante(18952145,"Fransisco","Marmol","segundo");
        Estudiante estudiante3 = new Estudiante(1598746,"Sofia","castillo","primero");

        Profesor profesor1 = new Profesor(125632145,"Carlos","Pedraza","Catedra");
        Profesor profesor2 = new Profesor(18952145,"Fransisco","Marmol","tiempo completo");
        Profesor profesor3 = new Profesor(1598746,"Sofia","castillo","catedra");

        estudiantes.add(estudiante1);
        estudiantes.add(estudiante2);
        estudiantes.add(estudiante3);

        profesores.add(profesor1);
        profesores.add(profesor2);
        profesores.add(profesor3);
        Scanner scan = new Scanner(System.in);
        int option;
        do {
            System.out.println("Ingrese una opción");
            System.out.println("1. Registrar Estudiante");
            System.out.println("2. Registrar Profesor");
            System.out.println("3. Registrar Estudiante");
            System.out.println("0. Salir");
            option = scan.nextInt();
            switch(option) {
                case 1:
                    try {
                        System.out.println("Ingresar Identificacion:");
                        long identificacion = scan.nextLong();
                        System.out.println("Ingresar nombre:");
                        String nombre = scan.next();
                        System.out.println("Ingresar Apellido:");
                        String apellido = scan.next();
                        System.out.println("Ingresar semestre actual:");
                        String semestre = scan.next();
                        Estudiante estudiant = new Estudiante(identificacion,nombre,apellido,semestre);
                        estudiantes.add(estudiant);
                        System.out.println("Registro exitoso");
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 2:
                try {
                    System.out.println("Ingresar Identificacion:");
                    long identificacion = scan.nextLong();
                    System.out.println("Ingresar nombre:");
                    String nombre = scan.next();
                    System.out.println("Ingresar Apellido:");
                    String apellido = scan.next();
                    System.out.println("Ingresar tipo de contrato:");
                    String contrato = scan.next();
                    Profesor teacher = new Profesor(identificacion,nombre,apellido,contrato);
                    profesores.add(teacher);
                    System.out.println("Registro exitoso");
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;
                    // contactos.forEach((k, v) -> System.out.println("Número: " + k + ", Nombre: " + v));
                    // break;
                case 3:
                    System.out.println("Ingresar el nombre de la materia:");
                    String nombreMateria = scan.next();
                    Materia materia = new Materia();
                    materia.setNombre(nombreMateria);
                    try {
                            System.out.println("Ingresar la identificacion del profesor :");
                            long idProfe = scan.nextLong();

                            List<Profesor> profe = profesores.stream()
                            .filter(v -> v.getIdentificacion() == idProfe)
                            .map(v -> v)
                            .collect(Collectors.toList()); 

                            profe.forEach((p) -> materia.setProfesor(p) );

                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage() + "Debes registrar primero el profesor");
                    }
                    try {
                        System.out.println("Ingresar el nota de la materia:");
                        Double nota = scan.nextDouble();
                        materia.setNota(nota);

                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    
                    try {
                        System.out.println("Ingresar la identificacion del estudiante:");
                        long idEst = scan.nextLong();
                        List<Estudiante> estudiante = estudiantes.stream()
                            .filter(v -> v.getIdentificacion() == idEst)
                            .map(v -> v)
                            .collect(Collectors.toList());
                        
                            estudiante.forEach((v) -> v.setMateria(materia));


                            System.out.println("Materia registrada Correctamente");
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage() + "Debes registrar primero el esudiante");
                    }
                    break;
                default:
                    System.out.println("Adios!");
                break;
            }
        } while (option != 0);
    }
}
