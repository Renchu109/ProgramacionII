package Modulo1.Clase11_04.Ejercicio3;

public class LibroDeTextoUNCol extends LibroDeTexto{
    private String quienLoPublico;

    public LibroDeTextoUNCol() {
    }

    public LibroDeTextoUNCol(String titulo, String autor, double precio, int curso, String quienLoPublico) {
        super(titulo, autor, precio, curso);
        this.quienLoPublico = quienLoPublico;
    }

    public String getQuienLoPublico() {
        return quienLoPublico;
    }

    public void setQuienLoPublico(String quienLoPublico) {
        this.quienLoPublico = quienLoPublico;
    }

    @Override
    void mostrarDatosLibro() {
        System.out.println("Libro de texto de la Universidad Nacional de Colombia");
        System.out.println("Título: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Precio: $"+precio);
        System.out.println("Curso asociado: "+getCurso());
        System.out.println("Facultad que lo publicó: "+quienLoPublico);
    }
}
