package Ejercicios.PracticePOOPruebas;

public class CincuentaSombrasDeGrey extends Libro {
    private String genero;
    private String editorial;

    //constructor vacio sin parameters
    public CincuentaSombrasDeGrey(){
    }

    //constructor con parameters
    public CincuentaSombrasDeGrey(String titulo, String autor, int paginas, String genero, String editorial) {
        super(titulo, autor, paginas); //estas son las propiedades de la clase Libro
        this.genero = genero; //estas son las propiedades extendidas o nuevas
        this.editorial = editorial; //esta es ifual
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    //sobreescritura de metodo esto es polimorfismo
    @Override
    public void MostrarInfo(){
        super.MostrarInfo();
        System.out.println("Genero: "+genero);
        System.out.println("Editorial: "+editorial);
    }
}