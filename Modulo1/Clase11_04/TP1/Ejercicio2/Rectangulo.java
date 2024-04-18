package Modulo1.Clase11_04.TP1.Ejercicio2;

public class Rectangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    double area() {
        return base*altura;
    }

    @Override
    double perimetro() {
        return (base*2)+(altura*2);
    }

    @Override
    void mostrarDatosFigura() {
        System.out.println("RECTÁNGULO");
        System.out.println("Base: "+base);
        System.out.println("Altura: "+altura);
        System.out.println("Area: "+area());
        System.out.println("Perímetro: "+perimetro());
    }
}
