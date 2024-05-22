package ClasesHijas;

import ClasesPadres.Persona;

public class Estudiante extends Persona {
    private String grado;
    private int Promedio;

    //constructor sin parametros
    public Estudiante() {
    }
    //constructor con parametros
    public Estudiante(int id, String nombre, String apellido, int edad, String grado, int promedio) {
        super(id, nombre, apellido, edad);
        this.grado = grado;
        Promedio = promedio;
    }
    //metodos get y set

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public int getPromedio() {
        return Promedio;
    }

    public void setPromedio(int promedio) {
        Promedio = promedio;
    }
    //metodos directamente de estudiantes
    public void TomarClase() {
        System.out.println("Yo " + getNombre() + "Estoy tomando clase");
    }
    public void PresentarTarea(){
        System.out.println("Yo " + getNombre() + "Estoy presentando tarea");
    }
    public void MarcarAsistencia(){
        System.out.println("Yo " + getNombre() + "Estoy marcando asistencia");
    }
    public void HacerExamen(){
        System.out.println("Yo " + getNombre() + "Estoy haciendo examen");
    }
    //metdoo de persona y ahora de alumno
    @Override
    public void Presentarse(){
        super.Presentarse();
        System.out.println("Y voy al grado: "+grado);
    }
}

