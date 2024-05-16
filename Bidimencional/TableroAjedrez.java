package Bidimencional;

/**
 * TableroAjedrez
 * CREAR UN PROGRAMA QUE IMPRIMA UN PATRO DE TABLERO DE AJEDEZ UTILIZANDO UN ARRAY BIDIMENCINAL, EL ARRAY DEBE ALMACENAR LOS CARACTERES QUE REPRESENTARAN LAS CASILLAS BLANCAS Y NEGRAS DEL TABLERO
 */
public class TableroAjedrez {

    public static void main(String[] args) {
        char[][] tablero = new char[8][8];

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    tablero[i][j] = 'B'; // Casilla blanca
                } else {
                    tablero[i][j] = 'N'; // Casilla negra
                }
            }
        }

        imprimirTablero(tablero);
    }

    private static void imprimirTablero(char[][] tablero) {
        for (char[] fila : tablero) {
            for (char casilla : fila) {
                System.out.print(casilla + " ");
            }
            System.out.println();
        }
    }
}
