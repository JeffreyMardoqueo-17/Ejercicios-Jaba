package clases;

public class Empleado {
    private int id;
    private String codigo;
    private String nombre;
    private String apellido;
    private String departamento;
    private double salario;

    //constructor
    public Empleado() {
    }
    //constructor
    private Empleado(int id, String codigo, String nombre, String apellido, String departamento, double salario) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.departamento = departamento;
        this.salario = salario;
        this.codigo = generarCodigo(apellido, departamento);
        System.out.println("Código generado: " + this.codigo);
    }

    //getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {

        this.departamento = departamento;
    }

    public double getSalario() {

        return salario;
    }

    public void setSalario(double salario) {

        this.salario = salario;
    }

    // Método para generar el código del empleado
    public String generarCodigo(String apellido, String departamento) {
        String parteApellido = apellido.length() >= 2 ? apellido.substring(0, 2) : apellido;
        String parteDepartamento = departamento.length() >= 3 ? departamento.substring(0, 3) : departamento;
        int numeroAleatorio = (int) (Math.random() * 900) + 100;
        return parteApellido + parteDepartamento + numeroAleatorio;
    }

}
