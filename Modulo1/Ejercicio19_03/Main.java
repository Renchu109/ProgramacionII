package Modulo1.Ejercicio19_03;

public class Main {
    public static void main(String[] args) {

        SavingsAccount sa1 = new SavingsAccount(20000,12);

        System.out.println(" ");
        System.out.println("DATOS CUENTA AHORROS");
        System.out.println("------------------------");
        sa1.consign(3000);
        sa1.withdraw(5000);
        sa1.monthlyStatement();
        sa1.showData();


        CurrentAccount ca1 = new CurrentAccount(20000,12);

        System.out.println(" ");
        System.out.println("DATOS CUENTA CORRIENTE");
        System.out.println("------------------------");
        ca1.withdraw(25000);
        ca1.consign(8000);
        ca1.monthlyStatement();
        ca1.showData();
    }
}
