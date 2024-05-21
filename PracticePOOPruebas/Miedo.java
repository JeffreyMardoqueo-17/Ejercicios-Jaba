package Ejercicios.PracticePOOPruebas;

public class Miedo {
    Libro it = new Libro("It", "Stephen King", 1138);
    Libro theExorcist = new Libro("The Exorcist", "William Peter Blatty", 400);
    Libro theShining = new Libro("The Shining", "Stephen King", 447);
    public void Miedos(){
        System.out.println("ESTOS SON ALGUNOS DE LOS LIBROS DE MIEDO:");
        System.out.println("-------------------------------------------------");
        it.MostrarInfo();
        theExorcist.MostrarInfo();
        theShining.MostrarInfo();
        System.out.println("-------------------------------------------------");
    }
}

