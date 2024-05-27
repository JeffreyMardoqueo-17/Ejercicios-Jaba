import java.util.ArrayList;
import java.util.Iterator;
import list.Equipo;

public class Main {
    public static void main(String[] args) {
        ArrayList<Equipo> lista = new ArrayList<>();

        // crear objetos de equipo

        Equipo equipo = new Equipo("Real Madrid", "España", 13);
        Equipo equipo2 = new Equipo("Barcelona", "España", 5);
        Equipo equipo3 = new Equipo("Bayern Munich", "Alemania", 5);
        Equipo equipo4 = new Equipo("Juventus", "Italia", 2);

        lista.add(equipo);
        lista.add(equipo2);
        lista.add(equipo3);
        lista.add(equipo4);

        for (Equipo e : lista) {
            System.out.println("Nombre: " + e.getNombre());
            System.out.println("Pais: " + e.getPais());
            System.out.println("Copas: " + e.getCopas());
            System.out.println("-------------------------------");
        }
    }
}
