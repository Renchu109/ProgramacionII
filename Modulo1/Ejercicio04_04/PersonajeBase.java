package Modulo1.Ejercicio04_04;

public abstract class PersonajeBase implements Personaje{

    protected String nombre;
    protected int nivel;
    protected int puntosVida;

    public PersonajeBase() {
    }

    public PersonajeBase(String nombre, int nivel, int puntosVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }
    public void mostrarDatosIniciales(){
        System.out.println(nombre+", Nivel "+nivel+", "+puntosVida+" HP");
    }

    public void mostrarDatosAtaque(){
        System.out.println(nombre +" ATACA!");
    }
}
