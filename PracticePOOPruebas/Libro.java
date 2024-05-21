package Ejercicios.PracticePOOPruebas;

public class Libro {
    private String titulo;
    private String autor;
    private int paginas;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    //constructor vacio sin parametros
    public Libro(){
    }

    //constructor con parametros
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    //metodos del objeto
    public void MostrarInfo(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Paginas: "+paginas);
    }
}
