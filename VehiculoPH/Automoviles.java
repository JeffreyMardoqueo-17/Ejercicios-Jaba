package VehiculoPH;

public class Automoviles {
    public static void main(String[] args) {
        Automovil lamborghini = new Automovil("Lamborgini", "Rojo", 2, "Motor v12", "Carretera", 350, 770, 12, 2022);
        lamborghini.desplazarse();
        lamborghini.mostrarDetalles();
    }
}

class Automovil extends Vehiculo{
    private int caballosDeFuerza;
    private int cilindros;
    private int anio;

    public Automovil(String marca, String color, int numeroDePasajeros, String tipoDeImpulso, String medioDesplazo, int aceleracion, int caballosDeFuerza, int cilindros, int anio){
        super(marca, color, numeroDePasajeros, tipoDeImpulso, medioDesplazo, aceleracion);
        this.caballosDeFuerza = caballosDeFuerza;
        this.cilindros = cilindros;
        this.anio = anio;
    }
}