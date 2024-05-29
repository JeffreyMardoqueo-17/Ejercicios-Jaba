import clases.Empleado;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedList<Empleado> empleados = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String continuar;

        do {
            System.out.println("Ingrese los datos del empleado:");

            Empleado empleado = new Empleado();

            System.out.print("ID: ");
            empleado.setId(scanner.nextInt());

            //System.out.print("Código: ");
            //empleado.setCodigo(scanner.next());

            System.out.print("Nombre: ");
            empleado.setNombre(scanner.next());

            System.out.print("Apellido: ");
            empleado.setApellido(scanner.next());

            System.out.print("Departamento: ");
            empleado.setDepartamento(scanner.next());

            Empleado empleado  = new empleado (id, codigo, nombre, apellido, departamento, salario);
            empleados.add(empleado);
            

            System.out.print("¿Desea continuar registrando empleados? (s/n): ");
            continuar = scanner.next();

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("EMPLEADOS REGISTRADOS");
        for (Empleado emp : empleados) {
            System.out.println("ID: " + emp.getId() + ", Código: " + emp.getCodigo() + ", Nombre: " + emp.getNombre() + ", Apellido: " + emp.getApellido() + ", Departamento: " + emp.getDepartamento() + ", Salario: " + emp.getSalario());
        }

        scanner.close();

    }
}