package Modulo2.TP4.Ejercicio1;

import java.util.Random;
import java.util.Scanner;

public class MainEj1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int randomNumber = rand.nextInt(100)+1;
        int trys = 0;
        boolean cont = true;

        System.out.println("\nADIVINA EL NÚMERO");
        System.out.println("Ingrese un número entre 1 y 100");

        while(cont){
            trys += 1;
            try {
                System.out.print("Número: ");
                int userNumber = Integer.parseInt(scan.nextLine());
                if(userNumber < randomNumber){
                    System.out.println("-El número aleatorio es MAYOR que "+userNumber);
                } else if (userNumber > randomNumber) {
                    System.out.println("-El número aleatorio es MENOR que "+userNumber);
                }else {
                    System.out.println("----------------------------");
                    System.out.println("Correcto!! número adivinado");
                    System.out.println("Intentos utilizados: "+trys);
                    cont = false;
                }
            }catch (NumberFormatException e){
                System.out.println("\n-------------------------------");
                System.out.println("Error: No se detectó un número");
            }
        }
    }
}
