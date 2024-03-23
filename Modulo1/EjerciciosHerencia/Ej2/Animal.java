package Modulo1.EjerciciosHerencia.Ej2;

public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected String genero;

    public Animal() {
    }

    public Animal(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    abstract void hacerSonido();
    abstract void informacion();
}
