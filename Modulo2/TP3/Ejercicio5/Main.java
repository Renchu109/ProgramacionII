package Modulo2.TP3.Ejercicio5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ListaDeTareas tareas = new ListaDeTareas();

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n----MENU----");
            System.out.println("1-Agregar tarea a la lista");
            System.out.println("2-Mostrar tareas en orden descendente");
            System.out.println("3-Eliminar tarea");
            System.out.println("4-Obtener número de tareas");
            System.out.println("Salir (ingrese cualquier tecla)");
            System.out.print(": ");
            String dec = scan.nextLine();

            switch (dec) {
                case "1" -> {
                    //1) Agregar usuarios a la lista
                    System.out.println("\nAGREGAR UNA NUEVA TAREA");
                    tareas.agregarTarea(scan);
                }
                case "2" -> {
                    //2) Mostrar lista de tareas en orden desdendente
                    System.out.println("\n-Mostrando tareas en orden descendente");
                    for (Tarea tarea : tareas) {
                        System.out.println(tarea);
                    }
                }
                case "3" -> {
                    //3) Eliminar una tarea dada su descripción
                    System.out.println("Eliminar una tarea");
                    System.out.print("-Descripción: ");
                    String descripcion = scan.nextLine().toLowerCase();
                    for (Tarea tar : tareas) {
                        if (tar.getDescripcion().toLowerCase().equals(descripcion)) {
                            System.out.println("Tarea encontrada");
                            tareas.eliminarTarea(tar);
                            break;
                        }
                    }
                }
                case "4" -> {
                    //4)Obtener número de tareas
                    tareas.cantTarea();
                }
                default -> {
                    System.out.println("\nCerrando lista...");
                    continuar = false;
                }
            }
        }
    }
}