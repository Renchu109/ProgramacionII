package Modulo1.Clase04_04;

public class Circulo implements Figura, Dibujable{
    private float radio;

    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public float area() {
        return (float) Math.PI*radio*radio;
    }

    @Override
    public void dibujar() {
        System.out.println("El círculo es dibujable pero no rotable");
    }
}
