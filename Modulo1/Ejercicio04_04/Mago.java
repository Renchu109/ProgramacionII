package Modulo1.Ejercicio04_04;

public class Mago extends PersonajeBase{
    private int puntosEnergia;

    public Mago(String nombre, int nivel, int puntosVida) {
        super(nombre, nivel, puntosVida);
    }

    public Mago(String nombre, int nivel, int puntosVida, int puntosEnergia) {
        super(nombre, nivel, puntosVida);
        this.puntosEnergia = puntosEnergia;
    }

    public int getPuntosEnergia() {
        return puntosEnergia;
    }

    public void setPuntosEnergia(int puntosEnergia) {
        this.puntosEnergia = puntosEnergia;
    }

    @Override
    public int atacar() {
        return nivel*puntosEnergia/10;
    }

    @Override
    public void defender(int danio) {
        System.out.println("---------------------------");
        System.out.println(nombre+" DEFIENDE!");
        System.out.println("Daño recibido: "+danio/4);
        puntosVida -= danio/4;

        if (puntosVida <= 0){
            puntosVida = 0;
        }

        System.out.println("HP: "+puntosVida);
        System.out.println("---------------------------");
    }
}
