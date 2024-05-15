import java.util.Scanner;

public class CantidadPuntosCliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int puntos = 0;

        System.out.println("Ingrese el numero de puntos actuales");
        puntos = scanner.nextInt();
        try {
            if (puntos < 1000 >= o) 
                System.out.println("Es cliente Bronce");
            else if(puntos >= 1000 &  puntos < 3000 )
                System.out.println("Es cliente plata");
            else if(puntos > 3000)
                System.out.println("Es cliente oro");
            else
                System.out.println("¡SIGA COMPRANDO PARA GANAR PUNTOS!");

        } catch (Exception e) {
            TODO: handle exception
            System.out.println("Usted no es cliente deje de paja" + e);
        }
    }
}
