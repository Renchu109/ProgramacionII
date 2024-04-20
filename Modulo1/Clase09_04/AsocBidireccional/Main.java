package Modulo1.Clase09_04.AsocBidireccional;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Creando objetos persona
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        persona1.setNombre("Renzo");
        persona2.setNombre("Castrolfo");
        persona3.setNombre("Gualter");

        //Creando a cada persona su respectiva lista de libros
        List<Persona> propietariosLibro1 = new ArrayList<>();
        propietariosLibro1.add(persona1);
        propietariosLibro1.add(persona2);

        List<Persona> propietariosLibro2 = new ArrayList<>();
        propietariosLibro2.add(persona2);
        propietariosLibro2.add(persona3);

        List<Persona> propietariosLibro3 = new ArrayList<>();
        propietariosLibro3.add(persona3);
        propietariosLibro3.add(persona1);

        //Creando objetos libro
        Libro libro1 = new Libro();
        Libro libro2 = new Libro();
        Libro libro3 = new Libro();
        libro1.setTitulo("Harry Potter y el cáliz de fuego");
        libro2.setTitulo("El psicoanalista");
        libro3.setTitulo("Asesinato en el Orient Express");

        //Creando a cada libro su respectiva lista de propietarios
        List<Libro> listaLibrosProp1 = new ArrayList<>();
        listaLibrosProp1.add(libro1);
        listaLibrosProp1.add(libro3);

        List<Libro> listaLibrosProp2 = new ArrayList<>();
        listaLibrosProp2.add(libro2);
        listaLibrosProp2.add(libro1);

        List<Libro> listaLibrosProp3 = new ArrayList<>();
        listaLibrosProp3.add(libro3);
        listaLibrosProp3.add(libro2);

        //Asociando la lista de libros de cada persona a su correspondiente propietario
        persona1.setListaLibros(listaLibrosProp1);
        persona2.setListaLibros(listaLibrosProp2);
        persona3.setListaLibros(listaLibrosProp3);

        //Asociando la lista de propietarios de cada libro a su correspondiente libro
        libro1.setPropietarios(propietariosLibro1);
        libro2.setPropietarios(propietariosLibro2);
        libro3.setPropietarios(propietariosLibro3);

        //Mostrando datos
        System.out.println("-------PERSPECTIVA DE LOS PROPIETARIOS-------");
        System.out.println("El propietario "+persona1.getNombre()+" tiene los siguientes libros:");
        for(int i=0;i<listaLibrosProp1.size();i++){
            System.out.println("-"+persona1.getListaLibros().get(i).getTitulo());
        }

        System.out.println("El propietario "+persona2.getNombre()+" tiene los siguientes libros:");
        for(int i=0;i<listaLibrosProp2.size();i++){
            System.out.println("-"+persona2.getListaLibros().get(i).getTitulo());
        }

        System.out.println("El propietario "+persona3.getNombre()+" tiene los siguientes libros:");
        for(int i=0;i<listaLibrosProp3.size();i++){
            System.out.println("-"+persona3.getListaLibros().get(i).getTitulo());
        }

        System.out.println("-------PERSPECTIVA DE LOS LIBROS-------");
        System.out.println("El libro "+libro1.getTitulo()+" tiene los siguientes dueños: ");
        for(int i=0;i<propietariosLibro1.size();i++){
            System.out.println("-"+libro1.getPropietarios().get(i).getNombre());
        }

        System.out.println("El libro "+libro2.getTitulo()+" tiene los siguientes dueños: ");
        for(int i=0;i<propietariosLibro2.size();i++){
            System.out.println("-"+libro2.getPropietarios().get(i).getNombre());
        }

        System.out.println("El libro "+libro3.getTitulo()+" tiene los siguientes dueños: ");
        for(int i=0;i<propietariosLibro3.size();i++){
            System.out.println("-"+libro3.getPropietarios().get(i).getNombre());
        }
    }
}
