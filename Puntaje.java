import java.util.Scanner;
public class Puntaje{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int respCorrectas = 0;
        int respIncorrectas = 0;
        int vacias = 0;
        int puntaje = 0;

        System.out.println("Ingrese el numero de respuestas Correctas");
        respCorrectas = scanner.nextInt();
        System.out.println("Ingrese el numero de respuestas Incorrectas");
        respIncorrectas = scanner.nextInt();
        // System.out.println("Ingrese el numero de respuestas Vacias"); 
        // vacias = scanner.nextInt();

        puntaje = (respCorrectas * 5) + (respIncorrectas * -2);
        System.out.println("El puntje es: " + puntaje);
    }
}
