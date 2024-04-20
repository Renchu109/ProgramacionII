package Modulo1.Clase09_04.AsocUnidireccional;


public class Main {
    public static void main(String[] args) {
        //Creando objetos estudiante
        Estudiante est1 = new Estudiante();
        est1.setNombre("Renzo");
        Estudiante est2 = new Estudiante();
        est2.setNombre("Fridolfo");

        //Creando objetos universidad
        Universidad universidad1 = new Universidad();
        universidad1.setNombre("Universidad Tecnológica Nacional");
        Universidad universidad2 = new Universidad();
        universidad2.setNombre("Universidad Nacional de Cuyo");

        System.out.println("-----------LISTA DE ESTUDAINTES: UNIVERSIDADES---------------");
        //Asociando estudiantes con universidad y mostrando datos
        est1.setUniversidad(universidad1);
        est2.setUniversidad(universidad2);
        est1.mostrar();
        est2.mostrar();

        System.out.println("----------CAMBIANDO ESTUDIANTES DE UNIVERSIDAD--------------");
        //Cambiando estudiantes de universidad y mostrando
        est1.cambiarUniversidad(est1, universidad1, universidad2);
        est2.cambiarUniversidad(est2, universidad1, universidad2);
        est1.mostrar();
        est2.mostrar();
    }
}
