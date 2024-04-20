package Modulo1.Clase09_04.Agregacion;

import java.util.List;

public class Empresa {
    private String nombre;
    private List<Departamento> listaDepartamentos;

    public List<Departamento> getListaDepartamentos() {
        return listaDepartamentos;
    }

    public void setListaDepartamentos(List<Departamento> listaDepartamentos) {
        this.listaDepartamentos = listaDepartamentos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", listaDepartamentos=" + listaDepartamentos +
                '}';
    }
}
