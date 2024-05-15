import java.util.Scanner;
public class BuscarNumero {
    public static void main(String[] args) {
        Scanner scanaer = new Scanner(System.in);

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int numeroABuscar;
        boolean encontrado = false;
        int posision = -1;

        System.out.println("Ingrese el numero a buscar");
        numeroABuscar = scanaer.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroABuscar) {
                encontrado = true;
                posision = i;
                break;
            }
        }
        if(encontrado)
            System.out.println("El numero: " + numeroABuscar + "se eneontro en el array en la posision: " + posision);
        else
        System.out.println("El numero" + numeroABuscar + "no se encontro");
    }
}