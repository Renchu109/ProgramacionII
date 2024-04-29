package Modulo2.Clase25_04.Ejercicio5Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ListaDeTareas tareas = new ListaDeTareas();

        boolean continuar = true;

        try{
            while (continuar) {
                System.out.println("\n----MENU----");
                System.out.println("1-Agregar tarea a la lista");
                System.out.println("2-Mostrar tareas en orden descendente");
                System.out.println("3-Eliminar tarea");
                System.out.println("4-Obtener número de tareas");
                System.out.println("Salir (ingrese cualquier tecla)");
                System.out.print(": ");
                int dec = scan.nextInt();

                switch (dec) {
                    case 1 -> {
                        //1) Agregar usuarios a la lista
                        System.out.println("\nAGREGAR UNA NUEVA TAREA");
                        tareas.agregarTarea(scan);
                    }
                    case 2 -> {
                        //2) Mostrar lista de tareas en orden desdendente
                        System.out.println("\n-Mostrando tareas en orden descendente");
                        for (Tarea tarea : tareas) {
                            System.out.println(tarea);
                        }
                    }
                    case 3 -> {
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
                    case 4 -> {
                        //4)Obtener número de tareas
                        tareas.cantTarea();
                    }
                }

                if(dec <= 0 || dec >= 5){
                    throw new miExcepcion("El número debe ser entre 1 y 4");
                }
            }
        }catch (InputMismatchException e){
            System.out.println("Error en el dato ingresado: "+e.getMessage());
            System.out.println("Debe ingresar un número");
        }catch (miExcepcion e){
            System.out.println("Valor numérico inválido: "+e.getMessage());
        }
    }
}
