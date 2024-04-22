package Modulo1.Clase11_04_TP1_Y_TP2.TP2.Ejercicio2;

public class Universitario extends Libro{
    private String tematica;

    public Universitario() {
    }

    public Universitario(String titulo, String autor, int anioDePublicacion, boolean prestado, String tematica) {
        super(titulo, autor, anioDePublicacion, prestado);
        this.tematica = tematica;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }
}
