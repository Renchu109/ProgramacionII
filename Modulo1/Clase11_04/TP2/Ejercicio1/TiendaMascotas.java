package Modulo1.Clase11_04.TP2.Ejercicio1;
import java.util.List;
import java.util.ArrayList;

public class TiendaMascotas extends Animal{
    private final List<Animal> listaAnimales = new ArrayList<>();
    public void addAnimal(Animal animal) {
        System.out.println("Agregando a "+animal.nombre+" a la lista");
        listaAnimales.add(animal);
    }

    public void venderAnimal(String nombre, Animal animal) {
        System.out.println("Vendiendo a "+nombre+" por $"+animal.precio);
        listaAnimales.remove(animal);
    }

    public void alimentarAnimal(String nombre) {
        System.out.println("Alimentando a "+nombre);
    }

    public void listarAnimales() {
        System.out.println("\nLISTA DE ANIMALES:");
        for (Animal ani:listaAnimales){
            System.out.println(ani);
        }
    }
}
