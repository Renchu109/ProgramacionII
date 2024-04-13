package Modulo1.Clase11_04.Ejercicio1;

public class Main {
    public static void main(String[] args) {

        System.out.println("------------------------------------");
        Trabajador t1 = new Trabajador("Ricardo",40,98000,"Ensamblado de productos");
        t1.mostrarDatosEmpleado();

        System.out.println("------------------------------------");

        Gerente g1 = new Gerente("Gerardo", 50, 200000,"Organización de trabajadores");
        g1.mostrarDatosEmpleado();
        System.out.println("------------------------------------");
    }
}
