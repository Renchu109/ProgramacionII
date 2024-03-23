package Modulo1.EjerciciosHerencia;

public class Motocicleta extends Vehiculo{
    private double velocidad;
    private boolean cilndrada;

    public Motocicleta() {
    }

    public Motocicleta(String color, int ruedas, double velocidad, boolean cilndrada) {
        super(color, ruedas);
        this.velocidad = velocidad;
        this.cilndrada = cilndrada;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public boolean isCilndrada() {
        return cilndrada;
    }

    public void setCilndrada(boolean cilndrada) {
        this.cilndrada = cilndrada;
    }



    @Override
    void soyUnVehiculo() {
        System.out.println("Soy una motocicleta");
    }

    @Override
    void mostrarDatos() {
        System.out.println("DATOS EXTRA");
        System.out.println("Velocidad: "+velocidad);
        System.out.println("Cilindrada: "+cilndrada);
    }
}
