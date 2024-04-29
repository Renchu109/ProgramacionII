package Modulo2.Clase25_04.Ejercicio4Excepciones;

import Modulo2.TP3.Ejercicio4.Alumno;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Alumno> listaAlumnos = new ArrayList<>();

        Modulo2.TP3.Ejercicio4.Alumno alu1 = new Modulo2.TP3.Ejercicio4.Alumno("Renzo",20,10.0);
        Modulo2.TP3.Ejercicio4.Alumno alu2 = new Modulo2.TP3.Ejercicio4.Alumno("Sodolfo",28,8.5);
        Modulo2.TP3.Ejercicio4.Alumno alu3 = new Modulo2.TP3.Ejercicio4.Alumno("Gualter",23,9.5);
        Modulo2.TP3.Ejercicio4.Alumno alu4 = new Modulo2.TP3.Ejercicio4.Alumno("Max",21,9.0);

        try{
            boolean continuar = true;
            while(continuar){
                System.out.println("\n----MENU----");
                System.out.println("1-Agregar alumnos a la lista");
                System.out.println("2-Mostrar lista de alumnos");
                System.out.println("3-Calcular media de notas");
                System.out.println("4-Alumno con la nota más alta");
                System.out.println("5-Buscar un alumno");
                System.out.println("6-Salir");
                System.out.print(": ");
                int dec = scan.nextInt();

                switch (dec) {
                    case 1 -> {
                        //1) Agregar usuarios a la lista
                        System.out.println("\n-Agregar alumno");
                        listaAlumnos.add(alu1);
                        listaAlumnos.add(alu2);
                        listaAlumnos.add(alu3);
                        listaAlumnos.add(alu4);
                    }
                    case 2 -> {
                        //2) Mostrar lista completa de alumnos
                        System.out.println("\n-Mostrando alumnos agregados");
                        System.out.println(listaAlumnos);
                    }
                    case 3 -> {
                        //3) Media de notas

                        try{
                            double media = calcularMedia(listaAlumnos);
                            System.out.println("\n-La nota media es: "+media);
                        }catch (ArithmeticException e){
                            System.out.println("Error en el cálculo: " + e.getMessage());
                        }
                    }
                    case 4 -> {
                        //4) Alumno con nota más alta
                        mostrarAlumnoInteligente(listaAlumnos);
                    }
                    case 5 -> {
                        //5) Buscar a un alumno ingresando su nombre
                        buscarAlumnoPorNombre(listaAlumnos,scan);
                    }case 6 -> {
                        //6) Salir de la lista
                        System.out.println("\nCerrando lista...");
                        continuar = false;
                    }
                }

                if(dec <= 0 || dec >= 7){
                    throw new miExcepcion("El valor debe ser entre 1 y 6");
                }
            }
        }catch (InputMismatchException e){
            System.out.println("Error en el dato ingresado: "+e.getMessage());
        }catch (miExcepcion e){
            System.out.println("Dato incorrecto: "+e.getMessage());
        }
    }
    public static double calcularMedia(List<Modulo2.TP3.Ejercicio4.Alumno> lista){
        double media = 0;
        for(Modulo2.TP3.Ejercicio4.Alumno alumno:lista){
            media += alumno.getNota();
        }
        if(lista.size() != 0){
            return media/ lista.size();
        }else {
            return (int) media/lista.size();
        }
    }

    public static void mostrarAlumnoInteligente(List<Modulo2.TP3.Ejercicio4.Alumno> lista){
        double notaMayor = 0;
        for(Modulo2.TP3.Ejercicio4.Alumno alumno:lista){
            if(alumno.getNota() >= notaMayor){
                notaMayor = alumno.getNota();
            }
        }
        System.out.println("\nNota más alta: "+notaMayor);
        System.out.println("Alumnos con esa nota:");
        for(Modulo2.TP3.Ejercicio4.Alumno alumno:lista){
            if(alumno.getNota() == notaMayor){
                System.out.println("-"+alumno.getNombre());
            }
        }
    }

    public static void buscarAlumnoPorNombre(List<Modulo2.TP3.Ejercicio4.Alumno> lista, Scanner scan){
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
