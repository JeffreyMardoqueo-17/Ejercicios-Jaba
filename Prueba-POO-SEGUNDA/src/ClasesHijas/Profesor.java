package ClasesHijas;
import ClasesPadres.Persona;

public class Profesor extends Persona{
    private String materia;
    private String especialidad;
    private  int AniosExperiencia;

    //constructor sin parametros
    public Profesor() {
    }
    //constructor con parametros
    public Profesor(int id, String nombre, String apellido, int edad, String materia, String especialidad, int aniosExperiencia) {
        super(id, nombre, apellido, edad);
        this.materia = materia;
        this.especialidad = especialidad;
        AniosExperiencia = aniosExperiencia;
    }
    //metodos get y set

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAniosExperiencia() {
        return AniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        AniosExperiencia = aniosExperiencia;
    }

//metodo que hace solalmente el profesor
    public void PrepararClase(){
        System.out.println("El profesor "+getNombre()+" "+getApellido()+" esta preparando la clase de la "+materia);
    }
    public  void Enseniar(){
        System.out.println("El profesor "+getNombre()+" "+getApellido()+" esta enseñando la clase de la "+materia);
    }
    public  void Evaluar(){
        System.out.println("El profesor "+getNombre()+" "+getApellido()+" esta evaluando la clase de la "+materia);
    }
    public void MarcarAsistencia(){
        System.out.println("El profesor "+getNombre()+" "+getApellido()+" esta marcando la asistencia");
    }
    @Override
    public void Presentarse(){
        super.Presentarse();
        System.out.println("Imparto la maneria de: "+materia);
        System.out.println("Mi especialidad es: "+especialidad);
        System.out.println("y Tengo "+AniosExperiencia+" años de experiencia");
        System.out.println("---------------------------------------");
    }
}
