package Modulo1.Clase21_03;

public class Main {
    public static void main(String[] args) {

        FullTimeEmployee fte1 = new FullTimeEmployee(1,"Renzo",80000,20000);
        PartTimeEmployee pte1 = new PartTimeEmployee(2,"Carlos",600,30,50);

        System.out.println("El salario del empleado "+fte1.getNombre()+" es: $"+fte1.calculateSalary());
        System.out.println("El salario del empleado "+pte1.getNombre()+" es: $"+pte1.calculateSalary());


    }
}
