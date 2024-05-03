package Modulo2.TP4.Ejercicio3;

import java.util.Scanner;
public class MainEj3 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("\nCALCULAR AREA TRIÁNGULO");
        boolean cont = true;

        while(cont){
            try{
                System.out.print("\nBase: ");
                String base = scan.nextLine();
                double baseDouble = Double.parseDouble(base);

                System.out.print("Altura: ");
                String height = scan.nextLine();
                double heightDouble = Double.parseDouble(height);

                double area = calculateArea(baseDouble,heightDouble);
                System.out.println("\nArea del triángulo: "+area);
                cont = false;
            }catch (NumberFormatException e){
                System.out.println("\nError en los datos: "+e.getMessage());
            }
        }
    }

    public static double calculateArea(double b, double h){
        return ((b*h)/2);
    }
}
