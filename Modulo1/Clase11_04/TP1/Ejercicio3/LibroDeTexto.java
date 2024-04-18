package Modulo1.Clase11_04.TP1.Ejercicio3;

public abstract class LibroDeTexto extends Libro{
    private int curso;

    public LibroDeTexto() {
    }

    public LibroDeTexto(String titulo, String autor, double precio, int curso) {
        super(titulo, autor, precio);
        this.curso = curso;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }
}
