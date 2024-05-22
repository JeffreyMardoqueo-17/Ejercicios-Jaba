package ClasesHijas;

import ClasesPadres.Persona;

public class Administrador extends Persona {
    public String departamento;
    public int aniosExperiencia;

    //constructor sin parametris
    public Administrador() {
    }
    //constructor con parametros
    public Administrador(int id, String nombre, String apellido, int edad, String departamento, int aniosExperiencia) {
        super(id, nombre, apellido, edad);
        this.departamento = departamento;
        this.aniosExperiencia = aniosExperiencia;
    }

    //get y sets

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
    public void GestionarPersonal(){
        System.out.println("YO "+getNombre()+" "+getApellido()+" estoy gestionando el personal del departamento de "+departamento);
    }
    public void PlanidicarEventos(){
        System.out.println("YO "+getNombre()+" "+getApellido()+" estoy planificando eventos para el departamento de "+departamento);
    }
    public void AdmonistrarPresupuesto(){
        System.out.println("YO "+getNombre()+" "+getApellido()+" estoy administrando el presupuesto del departamento de "+departamento);
    }
    public void MarcarAsistencia(){
        System.out.println("YO "+getNombre()+" "+getApellido()+" estoy marcando asistencia");
    }
    @Override
    public void Presentarse(){
        super.Presentarse();
        System.out.println("Soy el administrador con "+aniosExperiencia+" años de experiencia");
        System.out.println("Y soy del departamento de "+departamento);
        System.out.println("---------------------------------------");
    }
}
