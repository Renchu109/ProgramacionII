package Modulo1.Clase09_04.AsocBidireccional;

import java.util.List;

public class Libro {
    private String titulo;
    private List<Persona> propietarios;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Persona> getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(List<Persona> propietarios) {
        this.propietarios = propietarios;
    }
}
