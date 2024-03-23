package Modulo1.EjerciciosHerencia.Ej2;

public class Pajaro extends Animal{
    private String especie;
    private String plumaje;

    public Pajaro() {
    }

    public Pajaro(String nombre, int edad, String genero, String especie, String plumaje) {
        super(nombre, edad, genero);
        this.especie = especie;
        this.plumaje = plumaje;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getPlumaje() {
        return plumaje;
    }

    public void setPlumaje(String plumaje) {
        this.plumaje = plumaje;
    }

    @Override
    void hacerSonido() {
        System.out.println("--------------------");
        System.out.println("Soy un pájaro y canto");
    }

    @Override
    void informacion() {
        System.out.println("PÁJARO");
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+ edad);
        System.out.println("Género: "+genero);
        System.out.println("Especie: "+especie);
        System.out.println("Plumaje: "+plumaje);
    }
}
