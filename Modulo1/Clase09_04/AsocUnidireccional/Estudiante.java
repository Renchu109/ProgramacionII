package Modulo1.Clase09_04.AsocUnidireccional;

public class Estudiante {
    private String nombreEstudiante;
    private Universidad[] universidad = new Universidad[3];
    private int numEstudiante = 0;


    public Estudiante() {
    }

    public Estudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public Universidad[] getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad[] universidad) {
        this.universidad = universidad;
    }

    public int getNumEstudiante() {
        return numEstudiante;
    }

    public void setNumEstudiante(int numEstudiante) {
        this.numEstudiante = numEstudiante;
    }

    public void cambiarUniversidad(){
        universidad[numEstudiante] = new Universidad("Universidad Nacional de Cuyo");
        numEstudiante++;
    }
}
