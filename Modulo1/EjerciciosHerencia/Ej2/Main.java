package Modulo1.EjerciciosHerencia.Ej2;

public class Main {
    public static void main(String[] args) {

        Perro pe1 = new Perro("Rodri",10,"Macho","Ovejero alemán","Oscuro");
        Gato g1 = new Gato("Mile",6,"Hembra","crema y negro","Ciamés");
        Pajaro pa1 = new Pajaro("Kenchu",1,"Hembra","Cata","Verde");

        pe1.hacerSonido();
        pe1.informacion();

        g1.hacerSonido();
        g1.informacion();

        pa1.hacerSonido();
        pa1.informacion();
    }
}
