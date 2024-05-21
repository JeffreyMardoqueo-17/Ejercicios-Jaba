package Ejercicios.PracticePOOPruebas;
import  java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        //instancia de scaneer
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        System.out.println("ESTOS SON ALGUNOS DE LOS LIBROS QUE ESTAN EN LA BIBLIOTECA:");
        System.out.println("-------------------------------------------------");
        System.out.println("¿De cual genero quisiera ver los libros?");
        System.out.println("1. Romance");
        System.out.println("2. Miedo");
        System.out.println("3. Audio Libros");
        System.out.println("-------------------------------------------------");
        opcion = sc.nextInt();

        try {
            switch (opcion) {
                case 1:
                    Sexuales sexuales = new Sexuales();
                    sexuales.SexuelesSE();
                    break;
                case 2:
                    Miedo miedo = new Miedo();
                    miedo.Miedos();
                    break;
                case 3:
                    AudiosLibros audioLibros = new AudiosLibros();
                    audioLibros.AudioLibrosLerr();
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
