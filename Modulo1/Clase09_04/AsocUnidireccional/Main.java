package Modulo1.Clase09_04.AsocUnidireccional;

public class Main {
    public static void main(String[] args) {

        Universidad u1 = new Universidad("Universidad Tecnológica Nacional");
        Estudiante e1 = new Estudiante("Renzo");

        System.out.println("El estudiante "+e1.getNombreEstudiante()+" va a la "+u1.getNombreUniversidad());
        e1.cambiarUniversidad();
        System.out.println("El estudiante "+e1.getNombreEstudiante()+" ahora va a la "+u1.getNombreUniversidad());
    }
}
