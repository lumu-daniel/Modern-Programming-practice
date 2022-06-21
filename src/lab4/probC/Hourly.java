package lab4.probC;

public class Hourly extends Employee{

    private double hourlyWage;
    private int hoursPerWeek;
    private final int WPM = 4;

    public Hourly(double hourlyWage, int hoursPerWeek) {
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public double calcGrossPay(int month, int year) {
        return (hourlyWage*hoursPerWeek*WPM);
    }
}
