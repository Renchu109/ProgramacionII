package Modulo1.Clase11_04.TP1.Ejercicio1;

public class Trabajador extends Empleado{
    private String areaTrabajo;

    public Trabajador() {
    }

    public Trabajador(String nombre, int edad, double salario, String areaTrabajo) {
        super(nombre, edad, salario);
        this.areaTrabajo = areaTrabajo;
    }

    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    public void setAreaTrabajo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }

    public void producir(){
        System.out.println("Trabajando en la fábrica");
    }

    @Override
    void mostrarDatosEmpleado() {
        System.out.println("\nDatos del empleado: TRABAJADOR");
        System.out.println("\nNombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Salario: $"+salario);
        System.out.println("Área de trabajo: "+areaTrabajo);
        producir();
    }
}
