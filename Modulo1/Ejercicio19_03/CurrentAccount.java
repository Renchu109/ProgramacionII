package Modulo1.Ejercicio19_03;

public class CurrentAccount extends Account{
    private float overdraft;

    public CurrentAccount(float balance, float annualRate) {
        super(balance, annualRate);
        this.overdraft = 0;
    }


    public void withdraw(float amount) {
        if (amount > balance){
            System.out.println("Reiro de dinero. Sobregiro actualizado");
            float debt = amount-balance;
            overdraft += debt;
            System.out.println("Deuda: $"+overdraft);
        }
        balance = 0;
        numberWithdrawals += 1;
    }

    @Override
    public void consign(float amount) {

        if (overdraft > 0){
            System.out.println("Consignacon de dinero. Sobregiro actualizado");
            float rest;

            if (amount > overdraft){
                rest = amount%overdraft;
                overdraft = 0;
                super.consign(rest);
            }else {
                overdraft -= amount;
                numberConsignments += 1;
            }

            System.out.println("Deuda: $"+overdraft);
        }
    }

    @Override
    public void monthlyStatement() {
        super.monthlyStatement();
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Deuda por sobregiro: $"+overdraft);
    }
}
