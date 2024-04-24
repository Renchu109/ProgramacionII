package Modulo2.Clase23_04.Calculadora;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try{
            System.out.println("------CALCULADORA------\n");
            System.out.print("Un número: ");
            int num1 = scan.nextInt();
            System.out.print("Otro número: ");
            int num2 = scan.nextInt();


            System.out.println("Operaciones");
            System.out.println("1) Suma");
            System.out.println("2) Resta");
            System.out.println("3) Multiplicación");
            System.out.println("4) División");
            System.out.println("5) Salir");


            System.out.print("Elección: ");
            String decision = scan.next();

            double result;
            switch (decision){
                case ("1"):
                    System.out.print("Suma: ");
                    result = suma(num1,num2);
                    System.out.println(num1+" + "+num2+" = "+result);
                    break;
                case ("2"):
                    System.out.print("Resta: ");
                    result = resta(num1,num2);
                    System.out.println(num1+" - "+num2+" = "+result);
                    break;
                case ("3"):
                    System.out.print("Multiplicación: ");
                    result = multiplicacion(num1,num2);
                    System.out.println(num1+" * "+num2+" = "+result);
                    break;
                case ("4"):
                    System.out.print("División: ");
                    try{
                        result = division(num1,num2);
                        System.out.println(num1+" / "+num2+" = "+result);
                    }catch (ArithmeticException e){
                        System.out.println("Error en la división: "+e.getMessage());
                    }
                    break;
                case ("5"):
                    System.out.println("Saliendo...");
                    break;
            }
        }catch (InputMismatchException e){
            System.out.println("Detectado número inválido: "+e.getMessage());
        }finally {
            System.out.println("\nBorrando cálculos...");
        }
    }

    public static double suma(double primerNum, double segundoNum){
        return primerNum+segundoNum;
    }
    public static double resta(double primerNum, double segundoNum){
        return primerNum-segundoNum;
    }
    public static double multiplicacion(double primerNum, double segundoNum){
        return primerNum*segundoNum;
    }
    public static double division(int primerNum, int segundoNum){
        if(segundoNum != 0){
            return (double) primerNum/segundoNum;
        }else{
            return primerNum/segundoNum;
        }
    }
}
