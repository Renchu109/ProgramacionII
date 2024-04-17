package Modulo1.Clase16_04.PracticaArreglos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("-------EJERCICIO 1-----------");
        int[] arreglo1 = new int[10];

        for (int i=0;i<10;i++){
            System.out.print("Valor en el índice #"+i+": ");
            arreglo1[i] = scan.nextInt();
        }

        int mayor = 0;
        int indice = 0;
        for (int i=0;i<10;i++){
            if (arreglo1[i] > mayor){
                mayor = arreglo1[i];
                indice = i;
            }
        }

        System.out.println("El número más grande es "+mayor+" y se ubica en el índice #"+indice);

        System.out.println("-------EJERCICIO 2-----------");
        indice = 10;
        int posicion = 0;
        List<Integer> numeros = new ArrayList<>(indice);

        while(indice > 0){
            System.out.print("Número "+posicion+": #");
            int num = scan.nextInt();
            numeros.add(num);
            indice -= 1;
            posicion += 1;
        }

        System.out.println("Números: "+numeros);

        mayor = 0;
        for (Integer nume: numeros){
            int divisores = 0;
            int divisor = nume;
            while (divisor > 0){
                if (nume % divisor == 0){
                    divisores += 1;
                }
                divisor -= 1;
            }
            if ((divisores <= 2) && (nume > mayor)){
                mayor = nume;
            }
        }

        posicion = 0;
        for (Integer nume: numeros){
            if (nume == mayor){
                break;
            }else {
                posicion += 1;
            }
        }

        System.out.println("El primo más alto es el #"+mayor+" y está en la posición #"+posicion);

        System.out.println("-------EJERCICIO 3-----------");

        List<Integer> primos = new ArrayList<>();
        for (int i=100;i<=300;i++){
            int divisores = 0;
            int divisor = 1;
            while (divisor <= i){
                if (i % divisor == 0){
                    divisores += 1;
                }
                divisor += 1;
            }

            if (divisores <= 2){
                primos.add(i);
            }

            if (primos.size() == 10){
                break;
            }
        }
        System.out.println("Los 10 primeros Primos: "+primos);

        System.out.println("-------EJERCICIO 4-----------");
        List<Integer> arreglo4Enteros = new ArrayList<>();
        List<Integer> numerosTerminanEn4 = new ArrayList<>();
        List<Integer> posiciones = new ArrayList<>();

        indice = 0;
        while (indice < 10){
            System.out.print("Número #"+indice+": ");
            int num = scan.nextInt();
            arreglo4Enteros.add(num);
            indice += 1;
        }
        System.out.print("Números: "+arreglo4Enteros);

        posicion = 0;
        for(Integer num: arreglo4Enteros){
            if(num % 10 == 4){
                numerosTerminanEn4.add(num);
                posiciones.add(posicion);
            }
            posicion += 1;
        }

        System.out.println(" ");
        System.out.println("-----------------------------------------------");
        System.out.println("Números terminados en 4: "+numerosTerminanEn4);
        System.out.println("Posiciones: "+posiciones);

        System.out.println("-------EJERCICIO 5-----------");
        List<Integer> arreglo5 = new ArrayList<>();

        indice = 0;
        while(indice < 10){
            System.out.print("Número #"+indice+": ");
            int num = scan.nextInt();
            arreglo5.add(num);
            indice += 1;
        }

        mayor = 0;
        int contadorMayor = 1;
        for(Integer num: arreglo5){
            if(num > mayor){
                mayor = num;
            }else if (num == mayor){
                contadorMayor += 1;
            }
        }

        System.out.println("------------------------------------------");
        System.out.println(arreglo5);
        System.out.println("Mayor: "+mayor);
        System.out.println("Veces que aparece: "+contadorMayor);
    }
}
