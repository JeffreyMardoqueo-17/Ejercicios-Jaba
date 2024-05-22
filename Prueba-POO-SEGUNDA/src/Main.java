import  ClasesHijas.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        Estudiante student = new Estudiante();
        Administrador admi = new Administrador();
        Profesor profesor = new Profesor();

        System.out.println("Bienvenido al sistema de la escuela ¿Quien quieres que sER HOY?");
        System.out.println("1. Estudiante");
        System.out.println("2. Administrador");
        System.out.println("3. Profesor");
        opcion = scanner.nextInt();
        try {
            switch (opcion) {
                case 1:
                System.out.println("ESTUDIANTE:");
                    System.out.println("Ingrese su nombre");
                    student.setNombre(scanner.next());

                    System.out.println("Ingrese su apellido");
                    student.setApellido(scanner.next());

                    System.out.println("Ingrese su edad");
                    student.setEdad(scanner.nextInt());

                    System.out.println("Ingrese su grado");
                    student.setGrado(scanner.next());

                    System.out.println("Ingrese su promedio");
                    student.setPromedio(scanner.nextInt());

                    student.Presentarse();
                    student.TomarClase();
                    student.PresentarTarea();
                    break;
                case 2:
                    System.out.println("ADMINISTRADOR:");
                    System.out.println("Ingrese su nombre");
                    admi.setNombre(scanner.next());

                    System.out.println("Ingrese su apellido");
                    admi.setApellido(scanner.next());

                    System.out.println("Ingrese su edad");
                    admi.setEdad(scanner.nextInt());

                    System.out.println("Ingrese su departamento");
                    admi.setDepartamento(scanner.next());

                    System.out.println("Ingrese su años de experiencia");
                    admi.setAniosExperiencia(scanner.nextInt());

                    admi.Presentarse();
                    admi.GestionarPersonal();
                    admi.PlanidicarEventos();
                    admi.AdmonistrarPresupuesto();
                    break;
                case 3:
                    System.out.println("PROFESOR:");
                    System.out.println("Ingrese su nombre");
                    profesor.setNombre(scanner.next());
                    System.out.println("Ingrese su apellido");
                    profesor.setApellido(scanner.next());
                    System.out.println("Ingrese su edad");
                    profesor.setEdad(scanner.nextInt());
                    System.out.println("Ingrese su materia");
                    profesor.setMateria(scanner.next());
                    System.out.println("Ingrese su especialidad");
                    profesor.setEspecialidad(scanner.next());
                    System.out.println("Ingrese su años de experiencia");
                    profesor.setAniosExperiencia(scanner.nextInt());

                    profesor.Presentarse();
                    profesor.PrepararClase();
                    profesor.Enseniar();
                    profesor.Evaluar();
                    profesor.MarcarAsistencia();
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }

    }
}