package Modulo1.Clase21_03;

public class PartTimeEmployee extends Employee{

    private int hoursWorked;
    private float hourlyRate;

    public PartTimeEmployee(int id, String nombre, float salary, int hoursWorked, float hourlyRate) {
        super(id, nombre, salary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public float getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(float hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public float calculateSalary(){
        return super.calculateSalary() + (hoursWorked * hourlyRate);
    }
}
