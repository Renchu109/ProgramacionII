package Modulo1.Clase04_04;

public class Main {
    public static void main(String[] args) {

        Cuadrado cu1 = new Cuadrado(5);
        Circulo ci1 = new Circulo(4);

        System.out.println("CUADRADO");
        System.out.println("Area: "+cu1.area());
        cu1.dibujar();
        cu1.rotar();
        System.out.println("--------------------------");
        System.out.println("CÍRCULO");
        System.out.println("Area: "+ci1.area());
        ci1.dibujar();

    }
}
