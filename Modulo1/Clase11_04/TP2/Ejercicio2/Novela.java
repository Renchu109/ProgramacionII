package Modulo1.Clase11_04.TP2.Ejercicio2;

public class Novela extends Libro{
    private String genero;

    public Novela() {
    }

    public Novela(String titulo, String autor, int anioDePublicacion, boolean prestado, String genero) {
        super(titulo, autor, anioDePublicacion, prestado);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
