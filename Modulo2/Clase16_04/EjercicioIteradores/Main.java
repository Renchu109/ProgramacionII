package Modulo2.Clase16_04.EjercicioIteradores;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Creación de objetos de la clase jugador
        Jugador jug1 = new Jugador();
        Jugador jug2 = new Jugador();
        Jugador jug3 = new Jugador();
        Jugador jug4 = new Jugador();
        jug1.setNombre("Renzimiliano");
        jug1.setPosicion("Mediocampista");
        jug1.setNumCamiseta(10);
        jug2.setNombre("Guadodolfo");
        jug2.setPosicion("Portero");
        jug2.setNumCamiseta(99);
        jug3.setNombre("Maxzo");
        jug3.setPosicion("Defensor");
        jug3.setNumCamiseta(2);
        jug4.setNombre("Rodolter");
        jug4.setPosicion("Delantero");
        jug4.setNumCamiseta(9);

        //Creacion de la lista de los jugadores de futbol
        List<Jugador> listaJugadores = new ArrayList<>();

        //Agregando jugadores a la lista de jugadores
        listaJugadores.add(jug1);
        listaJugadores.add(jug2);
        listaJugadores.add(jug3);
        listaJugadores.add(jug4);

        //Creacion del objeto de la clase equipo y rellenado con la lista de los jugadores
        Equipo equipo = new Equipo();
        equipo.setListaJugadores(listaJugadores);

        //Muestra de datos mediante el metodo iterator implementado en la calse equipo como iterable
        System.out.println("JUGADORES DEL EQUIPO MADMAX5");
        for(Jugador jug:equipo){
            System.out.println("-------------------------------");
            System.out.println("Nombre: "+jug.getNombre());
            System.out.println("Posicion: "+jug.getPosicion());
            System.out.println("Nùmero de camiseta: "+jug.getNumCamiseta());
        }
    }
}
