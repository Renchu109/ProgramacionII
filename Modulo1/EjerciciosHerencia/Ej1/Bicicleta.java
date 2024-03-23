package Modulo1.EjerciciosHerencia;

public class Bicicleta extends Vehiculo{
    private String tipo;

    public Bicicleta() {
    }

    public Bicicleta(String color, int ruedas, String tipo) {
        super(color, ruedas);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }



    @Override
    void soyUnVehiculo() {
        System.out.println("Soy una bicicleta");
    }

    @Override
    void mostrarDatos() {
        System.out.println("DATOS EXTRA");
        System.out.println("Tipo: "+tipo);
    }
}
