package Modulo1.EjerciciosHerencia;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Coche c1 = new Coche("Blanco",4,110.5,true);
        Bicicleta b1 = new Bicicleta("Violeta",2,"Urbana");
        Camioneta ca1 = new Camioneta("Gris",4,350);
        Motocicleta m1 = new Motocicleta("Azul",2,90,true);

        List<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(c1);
        vehiculos.add(b1);
        vehiculos.add(ca1);
        vehiculos.add(m1);

        catalogar(vehiculos);
        System.out.println(" ");

        System.out.print("Número de ruedas a contar: ");
        int ruedas = scan.nextInt();
        System.out.println(" ");
        catalogar2(ruedas, vehiculos);
    }
    public static void catalogar(List<Vehiculo> vehiculos){
        for (Vehiculo vehiculo: vehiculos){
            System.out.println("--------------------");
            vehiculo.soyUnVehiculo();
            System.out.println("Clase: "+vehiculo.getClass().getSimpleName());
            System.out.println("Color: "+vehiculo.getColor());
            System.out.println("Ruedas: "+vehiculo.getRuedas());
            vehiculo.mostrarDatos();
        }
    }

    public static void catalogar2(int ruedas, List<Vehiculo> vehiculos){
        int contador = 0;
        for (Vehiculo vehiculo: vehiculos){
            vehiculo.getRuedas();
            if (vehiculo.getRuedas() == ruedas){
                contador += 1;
            }
        }
        System.out.println("Se encontraron "+contador+" vehículos con "+ruedas+" ruedas");
    }
}
