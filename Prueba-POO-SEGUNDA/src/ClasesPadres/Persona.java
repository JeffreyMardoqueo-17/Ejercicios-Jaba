package ClasesPadres;

public class Persona {
    private int id;
    private  String nombre;
    private String apellido;
    private int edad;

    //Constructor sin parametros
    public Persona() {
    }
    //constructor con parametros
    public Persona(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    //metodos get y set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //metodo para mostrar la informacion
    public  void Presentarse(){
        System.out.println("Mi nombre es: "+nombre + apellido);
        System.out.println("y tengo : "+edad + " años de esdad");
    }
}
