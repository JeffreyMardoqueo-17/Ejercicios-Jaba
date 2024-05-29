package LikedList;

import list.Equipo;

import java.util.LinkedList;

public class Ejemplo2  {
    public static void main(String[] args) {
        LinkedList<Equipo> equipos = new LinkedList<>();
        Equipo eq;

        for(int i = 1; i <= 10; i++){
            eq = new Equipo("Equipo " + i, "Pais " + i, i);
            equipos.add(eq);
        }
        //mostrar el contenido
        for (Equipo e: equipos) {
            System.out.println("Nombre: " + e.getNombre());
            System.out.println("Pais: " + e.getPais());
            System.out.println("Copas: " + e.getCopas());
            System.out.println("-------------------------------");
        }
    }
}

