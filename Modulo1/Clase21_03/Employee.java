package Modulo1.Clase21_03;

public abstract class Employee {

    private int id;
    private String nombre;
    private float salary;

    public Employee(int id, String nombre, float salary) {
        this.id = id;
        this.nombre = nombre;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float calculateSalary(){
        return salary;
    }
}
