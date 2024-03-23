package Modulo1.EjerciciosHerencia;

public class Camioneta extends Vehiculo{
    private int carga;

    public Camioneta() {
    }

    public Camioneta(String color, int ruedas, int carga) {
        super(color, ruedas);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }



    @Override
    void soyUnVehiculo() {
        System.out.println("Soy una camioneta");
    }

    @Override
    void mostrarDatos() {
        System.out.println("DATOS EXTRA");
        System.out.println("Carga: "+carga);
    }
}
