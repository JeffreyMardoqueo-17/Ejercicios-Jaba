// Vehiculo.java
package VehiculoPH;

public class Vehiculo {
    private String marca;
    private String color;
    private int numeroDePasajeros;
    private String tipoDeImpulso;
    private String medioDesplazo;
    private int aceleracion; 

    public Vehiculo(){
    }

    public Vehiculo(String marca, String color, int numeroDePasajeros, String tipoDeImpulso, String medioDesplazo, int aceleracion) {
        this.marca = marca;
        this.color = color;
        this.numeroDePasajeros = numeroDePasajeros;
        this.tipoDeImpulso = tipoDeImpulso;
        this.medioDesplazo = medioDesplazo;
        this.aceleracion = aceleracion;
    }

    public void desplazarse() {
        System.out.println("El vehículo se está desplazando");
    }

    public void acelerar() {
        System.out.println("El vehículo está acelerando");
    }

    public void frenar() {
        System.out.println("El vehículo está frenando");
    }
    
    public void  Alumbrar(){
        System.out.println("El vehículo está alumbrando");
    }

    public void  mostrarDetalles(){
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("Número de pasajeros: " + numeroDePasajeros);
        System.out.println("Tipo de impulso: " + tipoDeImpulso);
        System.out.println("Medio de desplazo: " + medioDesplazo);
        System.out.println("Aceleración: " + aceleracion);
    }
}