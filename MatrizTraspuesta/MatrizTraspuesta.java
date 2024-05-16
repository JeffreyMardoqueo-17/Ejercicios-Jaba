package MatrizTraspuesta;
import java.util.Scanner;

public class MatrizTraspuesta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrizOriginal = new int[3][3]; 
        int[][] matrizTranspuesta = new int[3][3]; 

        System.out.println("Ingrese los valores para la matriz original:");

        for (int i = 0; i < matrizOriginal.length; i++) {
            for (int j = 0; j < matrizOriginal[i].length; j++) {
                System.out.print("[" + i + "," + j + "]: ");
                matrizOriginal[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matriz original:");

        for (int i = 0; i < matrizOriginal.length; i++) {
            for (int j = 0; j < matrizOriginal[i].length; j++) {
                System.out.print(matrizOriginal[i][j] + "\t");
            }
            System.out.println();
        }

        matrizTranspuesta = new int[matrizOriginal[0].length][matrizOriginal.length];
        for (int i = 0; i < matrizTranspuesta.length; i++) {
            for (int j = 0; j < matrizTranspuesta[i].length; j++) {
                matrizTranspuesta[i][j] = matrizOriginal[j][i];
            }
        }
        
        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < matrizTranspuesta.length; i++) {
            for (int j = 0; j < matrizTranspuesta[i].length; j++) {
                System.out.print(matrizTranspuesta[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
