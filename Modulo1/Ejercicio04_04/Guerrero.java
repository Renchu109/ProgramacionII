package Modulo1.Ejercicio04_04;

public class Guerrero extends PersonajeBase{
    private int puntosFuerza;

    public Guerrero(String nombre, int nivel, int puntosVida) {
        super(nombre, nivel, puntosVida);
    }

    public Guerrero(String nombre, int nivel, int puntosVida, int puntosFuerza) {
        super(nombre, nivel, puntosVida);
        this.puntosFuerza = puntosFuerza;
    }

    public int getPuntosFuerza() {
        return puntosFuerza;
    }

    public void setPuntosFuerza(int puntosFuerza) {
        this.puntosFuerza = puntosFuerza;
    }

    @Override
    public int atacar() {
        return nivel*puntosFuerza/10;
    }

    @Override
    public void defender(int danio) {
        System.out.println("---------------------------");
        System.out.println(nombre+" DEFIENDE!");
        System.out.println("Daño recibido: "+danio/3);
        puntosVida -= danio/3;

        if (puntosVida <= 0){
            puntosVida = 0;
        }

        System.out.println("HP: "+puntosVida);
        System.out.println("---------------------------");
    }
}
