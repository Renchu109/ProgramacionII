package Modulo1.EjerciciosHerencia.Ej2;

public class Perro extends Animal{
    private String raza;
    private String pelaje;

    public Perro() {
    }

    public Perro(String nombre, int edad, String genero, String raza, String pelaje) {
        super(nombre, edad, genero);
        this.raza = raza;
        this.pelaje = pelaje;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    @Override
    void hacerSonido() {
        System.out.println("--------------------");
        System.out.println("Soy un perro y ladro");
    }

    @Override
    void informacion() {
        System.out.println("PERRO");
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+ edad);
        System.out.println("Género: "+genero);
        System.out.println("Raza: "+raza);
        System.out.println("Pelaje: "+pelaje);
    }
}
