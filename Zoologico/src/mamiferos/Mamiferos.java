package mamiferos;

import Clase.Animal;

public class Mamiferos extends Animal {

    private boolean esDomestico;

    public Mamiferos(String nombre, String especie, int edad, boolean vivo, boolean esDomestico) {
        super(nombre, especie, edad, vivo);
        this.esDomestico = esDomestico;
    }
    public boolean esDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }
    public boolean isEsDomestico() {
        return esDomestico;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Especie: " + getEspecie());
        System.out.println("Edad: " + getEdad());
        System.out.println("Vivo: " + getVivo());
        System.out.println("Es doméstico: " + esDomestico);
    }
}
