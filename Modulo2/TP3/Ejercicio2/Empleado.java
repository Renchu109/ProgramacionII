package Modulo2.TP3.Ejercicio2;

public class Empleado {
    private String nombre;
    private Empleado supervisor;

    public Empleado() {
    }

    public Empleado(String nombre, Empleado supervisor) {
        this.nombre = nombre;
        this.supervisor = supervisor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empleado getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

    public void asignarSupervisor(Empleado sup){
        this.supervisor = sup;
    }
    public void obtenerNombreSupervisor(){
        System.out.print("-Supervisor de "+nombre+": ");
        if(supervisor.getNombre() != null){
            System.out.println(supervisor.getNombre());
        }else {
            System.out.println("Empleado sin supervisor");
        }
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", supervisor=" + supervisor +
                '}';
    }
}
