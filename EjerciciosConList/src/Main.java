import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0, contador = 0, contadorPositivos = 0;
        String entrada;
        int numero; //aqui es lo que meta el usuario

        do {
            System.out.println("Ingrese un número:");
            numero = scanner.nextInt();
            suma += numero;
            contador++;

            if (numero > 0)
                contadorPositivos++;

            System.out.println("¿Desea detener el programa? Escriba 'D' para detener o ingrede otro numero .");
            entrada = scanner.next();
        } while (!entrada.equalsIgnoreCase("D"));

        double promedio = (double) suma / contador;
        System.out.println("Promedio: " + promedio);
        System.out.println("Cantidad de números positivos: " + contadorPositivos);
    }
}