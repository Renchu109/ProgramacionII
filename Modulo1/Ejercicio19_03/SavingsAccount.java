package Modulo1.Ejercicio19_03;

public class SavingsAccount extends Account{
    private boolean activate;


    public SavingsAccount(float initialBalance, float annualRate) {
        super(initialBalance, annualRate);
        this.activate = initialBalance >= 10000;
    }

    @Override
    public void consign(float amount) {
        if (activate){
            super.consign(amount);
        }else {
            System.out.println("Consignación fallida. La cuenta no está activa");
        }
    }

    @Override
    public void withdraw(float amount) {
        if (activate){
            super.withdraw(amount);
        }else {
            System.out.println("Retiro fallido. La cuenta no está activa");
        }
    }

    @Override
    public void monthlyStatement() {
        super.monthlyStatement();
        activate = super.getBalance() >= 10000;
    }


    public void showData() {
        super.showData();
    }
}
