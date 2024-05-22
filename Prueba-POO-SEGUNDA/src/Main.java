import  ClasesHijas.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        //instancias de las clases hijas
        Estudiante estudiante = new Estudiante(1, "Jeffrey", "Mardoqueo", 18, "noveno", 90);
        Administrador administrador = new Administrador(2, "Nestir", "Lopez", 30, "Recursos Humanos", 5);
        Profesor profesor = new Profesor(3, "Pedro", "Ramirez", 40, "Matematicas", "Licenciado", 10);

        System.out.println("Bienvenido al sistema de la escuela ¿Quien quieres que se presente?");
        System.out.println("1. Estudiante");
        System.out.println("2. Administrador");
        System.out.println("3. Profesor");
        opcion = scanner.nextInt();
        try {
            switch (opcion) {
                case 1:
                System.out.println("ESTUDIANTE:");
                    estudiante.Presentarse();
                    estudiante.TomarClase();
                    estudiante.PresentarTarea();
                    break;
                case 2:
                    System.out.println("ADMINISTRADOR:");
                   administrador.Presentarse();
                   administrador.AdmonistrarPresupuesto();
                   administrador.GestionarPersonal();
                   administrador.PlanidicarEventos();
                   administrador.MarcarAsistencia();
                    break;
                case 3:
                    System.out.println("PROFESOR:");
                    profesor.Presentarse();
                    profesor.MarcarAsistencia();
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