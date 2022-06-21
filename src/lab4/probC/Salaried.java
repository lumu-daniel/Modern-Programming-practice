package lab4.probC;

public class Salaried extends Employee{

    private double baseSalary;

    public Salaried(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double calcGrossPay(int month, int year) {
        return baseSalary;
    }
}
