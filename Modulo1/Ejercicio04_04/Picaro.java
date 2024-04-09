package Modulo1.Ejercicio04_04;

public class Picaro extends PersonajeBase{
    private int puntosVelocidad;

    public Picaro(String nombre, int nivel, int puntosVida) {
        super(nombre, nivel, puntosVida);
    }

    public Picaro(String nombre, int nivel, int puntosVida, int puntosVelocidad) {
        super(nombre, nivel, puntosVida);
        this.puntosVelocidad = puntosVelocidad;
    }

    public int getPuntosVelocidad() {
        return puntosVelocidad;
    }

    public void setPuntosVelocidad(int puntosVelocidad) {
        this.puntosVelocidad = puntosVelocidad;
    }

    @Override
    public int atacar() {
        return nivel*puntosVelocidad/10;
    }

    @Override
    public void defender(int danio) {
        System.out.println("---------------------------");
        System.out.println(nombre+" DEFIENDE!");
        System.out.println("Daño recibido: "+danio/2);
        puntosVida -= danio/2;

        if (puntosVida <= 0){
            puntosVida = 0;
        }

        System.out.println("HP: "+puntosVida);
        System.out.println("---------------------------");
    }
}
