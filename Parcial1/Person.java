package Parcial1;

//Clase abstracta (madre) persona
public abstract class Person {
    //Atributos
    protected int dni;
    protected String name;

    //Constructores vacío y parametrizado
    public Person() {
    }

    public Person(int dni, String name) {
        this.dni = dni;
        this.name = name;
    }

    //Getters y setters
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
