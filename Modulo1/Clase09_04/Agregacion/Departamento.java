package Modulo1.Clase09_04.Agregacion;

import java.util.List;

public class Departamento {
    private String nombreDep;
    private List<Empleado> empleadosAsociados;

    public String getNombreDep() {
        return nombreDep;
    }

    public void setNombreDep(String nombreDep) {
        this.nombreDep = nombreDep;
    }

    public List<Empleado> getEmpleadosAsociados() {
        return empleadosAsociados;
    }

    public void setEmpleadosAsociados(List<Empleado> empleadosAsociados) {
        this.empleadosAsociados = empleadosAsociados;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nombreDep='" + nombreDep + '\'' +
                ", empleadosAsociados=" + empleadosAsociados +
                '}';
    }
}
