package Modulo2.Clase16_04.EjercicioIteradores;;

import java.util.Iterator;
import java.util.List;

public class Equipo implements Iterable<Jugador>{
    private List<Jugador> listaJugadores;

    public List<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(List<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }


    @Override
    public Iterator iterator() {
        return listaJugadores.iterator();
    }
}
