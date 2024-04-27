package Modulo2.TP3.Ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Alumno> listaAlumnos = new ArrayList<>();
        Alumno alu1 = new Alumno("Renzo",20,10.0);
        Alumno alu2 = new Alumno("Sodolfo",28,8.5);
        Alumno alu3 = new Alumno("Gualter",23,9.5);
        Alumno alu4 = new Alumno("Max",21,9.0);

        boolean continuar = true;

        while(continuar){
            System.out.println("\n----MENU----");
            System.out.println("1-Agregar alumnos a la lista");
            System.out.println("2-Mostrar lista de alumnos");
            System.out.println("3-Calcular media de notas");
            System.out.println("4-Alumno con la nota más alta");
            System.out.println("5-Buscar un alumno");
            System.out.println("Salir (ingrese cualquier tecla)");
            System.out.print(": ");
            String dec = scan.nextLine();

            switch (dec) {
                case "1" -> {
                    //1) Agregar usuarios a la lista
                    System.out.println("\n-Agregando alumnos...");
                    listaAlumnos.add(alu1);
                    listaAlumnos.add(alu2);
                    listaAlumnos.add(alu3);
                    listaAlumnos.add(alu4);
                }
                case "2" -> {
                    //2) Mostrar lista completa de alumnos
                    System.out.println("\n-Mostrando alumnos agregados");
                    System.out.println(listaAlumnos);
                }
                case "3" -> {
                    //3) Media de notas
                    double media = calcularMedia(listaAlumnos);
                    System.out.println("\n-La nota media es: "+media);
                }
                case "4" -> {
                    //4) Alumno con nota más alta
                    mostrarAlumnoInteligente(listaAlumnos);
                }
                case "5" -> {
                    //5) Buscar a un alumno ingresando su nombre
                    buscarAlumnoPorNombre(listaAlumnos,scan);
                }
                default -> {
                    System.out.println("\nCerrando lista...");
                    continuar = false;
                }
            }
        }
    }
    public static double calcularMedia(List<Alumno> lista){
        double media = 0;
        for(Alumno alumno:lista){
            media += alumno.getNota();
        }
        return media/ lista.size();
    }

    public static void mostrarAlumnoInteligente(List<Alumno> lista){
        double notaMayor = 0;
        for(Alumno alumno:lista){
            if(alumno.getNota() >= notaMayor){
                notaMayor = alumno.getNota();
            }
        }
        System.out.println("\nNota más alta: "+notaMayor);
        System.out.println("Alumnos con esa nota:");
        for(Alumno alumno:lista){
            if(alumno.getNota() == notaMayor){
                System.out.println("-"+alumno.getNombre());
            }
        }
    }

    public static void buscarAlumnoPorNombre(List<Alumno> lista, Scanner scan){
        System.out.print("\nNombre del alumno: ");
        String nombreBuscar = scan.nextLine().toLowerCase();
        boolean bool = true;
        for(Alumno alumno:lista){
            if(alumno.getNombre().toLowerCase().equals(nombreBuscar)){
                System.out.println("Alumno encontrado. Mostrando sus datos");
                System.out.println(alumno);
                bool = false;
            }
        }
        if(bool){
            System.out.println("-Alumno no encontrado");
        }
    }
}
