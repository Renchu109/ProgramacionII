package Modulo1.Clase11_04_TP1_Y_TP2.TP2.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Renzo",20,"Can",5000,"Ovejero alemán",true);
        Gato gato1 = new Gato("Rodolfo", 28,"Michi",10,"Montés",false);
        Ave ave1 = new Ave("Walter",23,"pajarito",452,"Canario",false);
        Pez pez1 = new Pez("Max",21,"pececito",4566,"Salmón",true);

        TiendaMascotas tienda1 = new TiendaMascotas();

        System.out.println("------TIENDA DE MASCOTAS--------");
        tienda1.addAnimal(gato1);
        tienda1.alimentarAnimal(gato1.getNombre());
        tienda1.listarAnimales();
        System.out.println(" ");
        tienda1.addAnimal(perro1);
        tienda1.alimentarAnimal(perro1.getNombre());
        tienda1.listarAnimales();
        System.out.println(" ");
        tienda1.addAnimal(ave1);
        tienda1.alimentarAnimal(ave1.getNombre());
        tienda1.listarAnimales();
        System.out.println(" ");
        tienda1.addAnimal(pez1);
        tienda1.alimentarAnimal(pez1.getNombre());
        tienda1.listarAnimales();
        System.out.println("\n-----------------------------------------------------------\n");
        tienda1.venderAnimal(gato1.getNombre(),gato1);
        tienda1.listarAnimales();
        tienda1.venderAnimal(perro1.getNombre(),perro1);
        tienda1.listarAnimales();
    }
}
