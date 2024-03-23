package Modulo1.Clase21_03;

public class FullTimeEmployee extends Employee{

    private float yearlyBonus;

    public FullTimeEmployee(int id, String nombre, float salary, float yearlyBonus) {
        super(id, nombre, salary);
        this.yearlyBonus = yearlyBonus;
    }

    public float getYearlyBonus() {
        return yearlyBonus;
    }

    public void setYearlyBonus(float yearlyBonus) {
        this.yearlyBonus = yearlyBonus;
    }

    @Override
    public float calculateSalary(){
        return super.calculateSalary() + yearlyBonus;
    }
}