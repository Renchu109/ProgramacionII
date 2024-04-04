package Modulo1.Ejercicio19_03;

public abstract class Account {

    protected float balance;
    protected int numberConsignments = 0;
    protected int numberWithdrawals = 0;
    protected float annualRate;
    protected float monthlyCommission = 0;

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public Account(float balance, float annualRate) {
        this.balance = balance;
        this.annualRate = annualRate;
    }

    public void consign(float amount){
        balance += amount;
        numberConsignments++;
    }

    public void withdraw(float amount){
        float newBalance = balance - amount;
        if(newBalance >= 0){
            balance -= amount;
            numberWithdrawals++;
        }else{
            System.out.println("La cantidad a retirar excede el saldo actual.");
        }
    }

    public void calculateInterest(){
        float monthlyRate = annualRate / 12;
        float monthlyInterest = (float) (balance * monthlyRate * 0.1);
        balance += monthlyInterest;
    }

    public void monthlyStatement(){
        balance -= monthlyCommission;
        calculateInterest();
    }

    public void showData(){
        System.out.println("------------------------");
        System.out.println("Saldo: $"+balance);
        System.out.println("------------------------");
        System.out.println("Consignaciones: "+numberConsignments);
        System.out.println("------------------------");
        System.out.println("Retiros: "+numberWithdrawals);
        System.out.println("------------------------");
        System.out.println("Tasa anual: %"+annualRate);
        System.out.println("------------------------");
        System.out.println("Comisión mensual: $"+monthlyCommission);
        System.out.println("------------------------");
    }
}
