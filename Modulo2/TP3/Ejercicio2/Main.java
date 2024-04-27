package Modulo2.TP3.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Empleado empl1 = new Empleado();
        empl1.setNombre("Renzo");

        Empleado empl2 = new Empleado();
        empl2.setNombre("Emanuel");

        Empleado sup1 = new Empleado();
        sup1.setNombre("Ricardo");

        Empleado sup2 = new Empleado();

        System.out.println("-----EMPLEADOS-----");
        System.out.println("-"+empl1.getNombre());
        System.out.println("-"+empl2.getNombre());

        System.out.println("-----SUPERVISORES-----");
        empl1.asignarSupervisor(sup1);
        empl2.asignarSupervisor(sup2);
        empl1.obtenerNombreSupervisor();
        empl2.obtenerNombreSupervisor();
    }
}
