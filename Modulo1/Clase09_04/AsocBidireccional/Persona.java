package Modulo1.Clase09_04.AsocBidireccional;

import java.util.List;

public class Persona {
    private String nombre;
    private List<Libro> listaLibros;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }
}
