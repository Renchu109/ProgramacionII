package Modulo1.Clase04_04;

public class Cuadrado implements Figura, Rotable, Dibujable{
    private float lado;

    public Cuadrado() {
    }

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public float area() {
        return lado*lado;
    }

    @Override
    public void dibujar() {
        System.out.println("El cuadrado es dibujable");
    }

    @Override
    public void rotar() {
        System.out.println("El cuadrado puede rotar");
    }
}
