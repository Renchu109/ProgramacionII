package Modulo1.Clase11_04.TP2.Ejercicio2;

public class Libro implements Prestable{
    protected String titulo;
    protected String autor;
    protected int anioDePublicacion;
    protected boolean prestado;

    public Libro() {
    }

    public Libro(String titulo, String autor, int anioDePublicacion, boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioDePublicacion = anioDePublicacion;
        this.prestado = prestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioDePublicacion() {
        return anioDePublicacion;
    }

    public void setAnioDePublicacion(int anioDePublicacion) {
        this.anioDePublicacion = anioDePublicacion;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public void prestar() {
        System.out.println("PRESTANDO LIBRO: "+titulo);
    }

    @Override
    public void devolver() {
        System.out.println("LIBRO REINTEGRADO: "+titulo);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anioDePublicacion=" + anioDePublicacion +
                ", prestado=" + prestado +
                '}';
    }
}
