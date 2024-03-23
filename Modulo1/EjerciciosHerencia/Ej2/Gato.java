package Modulo1.EjerciciosHerencia.Ej2;

public class Gato extends Animal{
    private String color;
    private String raza;

    public Gato() {
    }

    public Gato(String nombre, int edad, String genero, String color, String raza) {
        super(nombre, edad, genero);
        color = color;
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    void hacerSonido() {
        System.out.println("--------------------");
        System.out.println("Soy un gato y maúllo");
    }

    @Override
    void informacion() {
        System.out.println("GATO");
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+ edad);
        System.out.println("Género: "+genero);
        System.out.println("Color: "+color);
        System.out.println("Raza: "+raza);
    }
}
