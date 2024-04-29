package Modulo2.Clase25_04.Ejercicio5Excepciones;

import java.util.*;

public class ListaDeTareas implements Iterable<Tarea>{
    private List<Tarea> listaDeTareas = new ArrayList<>();

    public ListaDeTareas() {
    }

    public ListaDeTareas(List<Tarea> listaDeTareas) {
        this.listaDeTareas = listaDeTareas;
    }

    public void agregarTarea(Scanner scan){
        System.out.print("-Descripción: ");
        String desc = agregarDescripcion(scan);
        System.out.print("-Prioridad: ");
        int prior = agregarPrioridad(scan);

        Tarea tarea = new Tarea(desc,prior);

        System.out.println("Agregando tarea: "+tarea);
        listaDeTareas.add(tarea);
        listaDeTareas.sort(Comparator.comparingInt(Tarea::getPrioridad).reversed());
    }

    public void eliminarTarea(Tarea tarea){
        System.out.println("\nEliminando tarea: "+tarea);
        listaDeTareas.remove(tarea);
    }

    public void cantTarea(){
        System.out.println("\nCantidad de tareas en la lista: "+listaDeTareas.size());
    }


    @Override
    public Iterator<Tarea> iterator() {
        return listaDeTareas.iterator();
    }

    public static String agregarDescripcion(Scanner scan){
        return scan.nextLine();
    }

    public static int agregarPrioridad(Scanner scan){
        int prioridad = scan.nextInt();
        scan.nextLine();
        return prioridad;
    }
}
