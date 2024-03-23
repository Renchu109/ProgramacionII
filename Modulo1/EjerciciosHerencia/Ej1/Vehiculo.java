package Modulo1.EjerciciosHerencia;

public abstract class Vehiculo {
    protected String color;
    protected int ruedas;

    public Vehiculo() {
    }

    public Vehiculo(String color, int ruedas) {
        this.color = color;
        this.ruedas = ruedas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    abstract void soyUnVehiculo();
    abstract void mostrarDatos();
}
