package Modulo1.Clase11_04_TP1_Y_TP2.TP2.Ejercicio2;

public class Infantil extends Libro{
    private String finalidad;

    public Infantil() {
    }

    public Infantil(String titulo, String autor, int anioDePublicacion, boolean prestado, String finalidad) {
        super(titulo, autor, anioDePublicacion, prestado);
        this.finalidad = finalidad;
    }

    public String getFinalidad() {
        return finalidad;
    }

    public void setFinalidad(String finalidad) {
        this.finalidad = finalidad;
    }
}
