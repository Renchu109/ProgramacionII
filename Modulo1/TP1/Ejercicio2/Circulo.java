package Modulo1.TP1.Ejercicio2;

public class Circulo extends FiguraGeometrica{
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


    @Override
    double area() {
        return Math.PI*radio*radio;
    }

    @Override
    double perimetro() {
        return 2*Math.PI*radio;
    }

    @Override
    void mostrarDatosFigura() {
        System.out.println("CÍRCULO");
        System.out.println("Radio: "+radio);
        System.out.println("Area: "+area());
        System.out.println("Perímetro: "+perimetro());
    }
}
