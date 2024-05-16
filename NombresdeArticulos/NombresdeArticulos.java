package NombresdeArticulos;

import java.util.Scanner;

/**
 * NombresdeArticulos
 * Desarrollar un programa que permita almacenar 9 nombres de artí-
 * culos en una matriz llamada “artículos”, posteriormente deberá mos-
 * trar el contenido de matriz en el orden de las filas invertido, es decir,
 * la última fila debe aparecer primero y la primera de último.
 */
public class NombresdeArticulos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] articulos = new String[3][3];

        for (int f = 0; f < articulos.length; f++) {
            for (int c = 0; c < articulos[0].length; c++) {
                System.out.println("Escriba el nombre del articulo " + (f + 1) + "," + (c + 1));
                articulos[f][c] = scanner.nextLine();
            }
        }

        for(int f = articulos.length - 1; f >= 0; f--){
            for(int c = 0; c < articulos[0].length; c++){
                System.out.print(articulos[f][c] + " "  );
                // System.out.println((f + 1) + "," + (c + 1));
            }
            System.out.println("");
        }
    }
}
