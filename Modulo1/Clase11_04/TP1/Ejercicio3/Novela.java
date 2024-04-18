package Modulo1.Clase11_04.TP1.Ejercicio3;

public class Novela extends Libro{
    private String genero;

    public Novela() {
    }

    public Novela(String titulo, String autor, double precio, String genero) {
        super(titulo, autor, precio);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    void mostrarDatosLibro() {
        System.out.println("Novela");
        System.out.println("Título: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Precio: $"+precio);
        System.out.println("Género: "+genero);
    }
}
