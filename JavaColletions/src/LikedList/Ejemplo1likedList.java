package LikedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Ejemplo1likedList {
    public static void main(String[] args) {
        //declaracion de la conleccion de tipo likedlist

        LinkedList lista = new LinkedList();
        int i = 1;

        while(i <= 20){
            if(i % 2 == 0)
                lista.add(i);
            else
                lista.add("Elemento impar" + i);
            i++;
        }

        Iterator it = lista.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}

