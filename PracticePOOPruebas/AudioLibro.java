package Ejercicios.PracticePOOPruebas;

public class AudioLibro extends Libro {

    private String idioma;
    private int tiempo;

    //conostructor vacio
    public  AudioLibro(){
    }

    //constructor con parametros
    public AudioLibro(String titulo, String autor, int paginas, String idioma, int tiempo) {
        super(titulo, autor, paginas);
        this.idioma = idioma;
        this.tiempo = tiempo;
    }
    //GETERS Y SETRS
    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    @Override
    public  void MostrarInfo(){
        super.MostrarInfo();
        System.out.println("El idioma del libro es:" + idioma);
        System.out.println("El tiempo de audio del libro es de : " + tiempo + " minutos.");
    }
    public  void LeerLibro(){
        System.out.println("Leyendo libro");
    }
}
