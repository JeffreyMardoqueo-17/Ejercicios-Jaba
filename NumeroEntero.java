import java.util.Scanner;

public class NumeroEntero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int primerImpar = 1;

        System.out.println("Ingrese un numero entero positivo: ");
        numero = scanner.nextInt();
        try {
            if (numero <= 0)
                System.out.println("El numero debe ser entero");

            while (primerImpar <= numero) {
                if (primerImpar % 2 != 0)
                    System.out.print(primerImpar + " ");
                // esto es para que vaya en incremend
                primerImpar++;
            }
        } catch (Exception ex) {
            // TODO: handle exception
            System.out.println(ex);
        }
    }
}
