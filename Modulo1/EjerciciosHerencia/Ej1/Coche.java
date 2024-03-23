package Modulo1.EjerciciosHerencia;

public class Coche extends Vehiculo{
    private double velocidad;
    private boolean cilindrada;

    public Coche() {
    }

    public Coche(String color, int ruedas, double velocidad, boolean cilindrada) {
        super(color, ruedas);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public boolean isCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(boolean cilindrada) {
        this.cilindrada = cilindrada;
    }



    @Override
    void soyUnVehiculo() {
        System.out.println("Soy un coche");
    }

    @Override
    void mostrarDatos() {
        System.out.println("DATOS EXTRA");
        System.out.println("Velocidad: "+velocidad);
        System.out.println("Cilindrado: "+cilindrada);
    }
}
