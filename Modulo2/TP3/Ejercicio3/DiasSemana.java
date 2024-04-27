package Modulo2.TP3.Ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DiasSemana {
    public static void main(String[] args) {
        List<String> diasSemana = new ArrayList<>();

        //Punto 1
        System.out.println("\nEjercicio 1) ");
        System.out.println("Agregando días...");

        diasSemana.add("Lunes");
        diasSemana.add("Martes");
        diasSemana.add("Miércoles");
        diasSemana.add("Juernes");
        diasSemana.add("Viernes");
        diasSemana.add("Sábado");
        diasSemana.add("Domingo");

        for(String dia: diasSemana){
            System.out.println(dia);
        }

        //Punto 2
        System.out.println("\nEjercicio 2) ");
        System.out.println("Posición 3: "+diasSemana.get(3));
        System.out.println("Posición 4: "+diasSemana.get(4));

        //Punto 3
        System.out.println("\nEjercicio 3) ");
        System.out.println("Primer elemento: "+diasSemana.get(0));
        System.out.println("Último elemento: "+diasSemana.get(diasSemana.size()-1));

        //Punto 4
        System.out.println("\nEjercicio 4) ");
        diasSemana.remove("Juernes");
        boolean bool = true;
        for(String dia:diasSemana){
            if(dia.equals("Juernes")){
                bool = false;
            }
        }
        if(bool){
            System.out.println("Juernes eliminado");
        }

        //Punto 5
        System.out.println("\nEjercicio 5) ");
        Iterable<String> iterador = new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                return diasSemana.iterator();
            }
        };
        System.out.println("Días de la semana");
        for(String dia:iterador){
            System.out.println(dia);
        }

        //Punto 6
        System.out.println("\nEjercicio 6) ");
        for(String dia:iterador){
            if(dia.equals("Lunes")){
                System.out.println("Hay un elemento lunes en la posición "+diasSemana.indexOf("Lunes"));
            }
        }

        //Punto 7
        System.out.println("\nEjercicio 7) ");
        for(String dia:iterador){
            if(dia.toLowerCase().equals("lunes")){
                System.out.println("Hay un elemento lunes en la posición "+diasSemana.indexOf("Lunes"));
            }
        }

        //Punto 8
        System.out.println("\nEjercicio 8) ");
        System.out.println("Borrando elementos...");
        diasSemana.clear();
        for(String dia:iterador){
            System.out.println(dia);
        }

    }
}
