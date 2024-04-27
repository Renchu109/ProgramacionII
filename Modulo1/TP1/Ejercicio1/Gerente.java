package Modulo1.TP1.Ejercicio1;

public class Gerente extends Empleado{
    private String departamento;

    public Gerente() {
    }

    public Gerente(String nombre, int edad, double salario, String departamento) {
        super(nombre, edad, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void organizarActividades(){
        System.out.println("Organizando la oficina");
    }

    @Override
    void mostrarDatosEmpleado() {
        System.out.println("\nDatos del empleado: GERENTE");
        System.out.println("\nNombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Salario: $"+salario);
        System.out.println("Departamento: "+departamento);
        organizarActividades();
    }
}
