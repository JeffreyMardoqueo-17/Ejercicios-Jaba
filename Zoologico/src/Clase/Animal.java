package Clase;

import Interfaz.IEstarVivo;

public class Animal implements IEstarVivo {
    private String nombre;
    private String especie;
    private int edad;
    private boolean vivo;

    //constructor sin parametros
    public  Animal(){
    }
    //Constructor con parametros
    public Animal(String nombre, String especie, int edad, boolean vivo) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.vivo = vivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean getVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    @Override
    public boolean estaVivo() {
        return vivo;
    }

    public void mostrarInfo(){

    };
}
