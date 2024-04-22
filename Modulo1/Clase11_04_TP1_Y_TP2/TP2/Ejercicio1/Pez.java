package Modulo1.Clase11_04_TP1_Y_TP2.TP2.Ejercicio1;

public class Pez extends Animal{
    private String familia;
    private boolean esDeAguaDulce;

    public Pez() {
    }

    public Pez(String nombre, int edad, String tipoAnimal, double precio, String familia, boolean esDeAguaDulce) {
        super(nombre, edad, tipoAnimal, precio);
        this.familia = familia;
        this.esDeAguaDulce = esDeAguaDulce;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public boolean isEsDeAguaDulce() {
        return esDeAguaDulce;
    }

    public void setEsDeAguaDulce(boolean esDeAguaDulce) {
        this.esDeAguaDulce = esDeAguaDulce;
    }
}
