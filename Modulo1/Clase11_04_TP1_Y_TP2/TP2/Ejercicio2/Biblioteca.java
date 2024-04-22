package Modulo1.Clase11_04_TP1_Y_TP2.TP2.Ejercicio2;
import java.util.List;
import java.util.ArrayList;
public class Biblioteca {
    private List<Libro> listaLibros = new ArrayList<>();

    public void agregarLibro(Libro libro){
        System.out.println("Agregando el libro "+libro.titulo);
        listaLibros.add(libro);
    }

    public void prestarLibro(Libro libro){
        if(!libro.prestado){
            libro.prestar();
            libro.setPrestado(true);
        }
    }

    public void devolverLibro(Libro libro){
        if(libro.prestado){
            libro.devolver();
            libro.setPrestado(false);
        }
    }

    public void mostrarLibros(){
        System.out.println("LIBROS DISPONIBLES");
        for(Libro lib:listaLibros){
            System.out.println(lib);
        }
    }
}
