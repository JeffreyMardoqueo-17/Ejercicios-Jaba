package Ejercicios.PracticePOOPruebas;

public class AudiosLibros {
    public  void AudioLibrosLerr(){
        AudioLibro libro1 = new AudioLibro("El Alquimista", "Paulo Coelho", 208, "Español", 240);
        AudioLibro libro2 = new AudioLibro("1984", "George Orwell", 328, "Inglés", 540);
        AudioLibro libro3 = new AudioLibro("Cien años de soledad", "Gabriel García Márquez", 417, "Español", 600);

        libro1.MostrarInfo();
        libro1.LeerLibro();
        System.out.println("-------------------------------------------------");
        libro2.MostrarInfo();
        libro2.LeerLibro();
        System.out.println("-------------------------------------------------");
        libro3.MostrarInfo();
        libro3.LeerLibro();
        System.out.println("-------------------------------------------------");
    }
}
