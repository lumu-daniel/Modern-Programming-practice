package lab4.probC;

public abstract class Employee {

    public void print(){

    }

    public Paycheck calcCompensation(int month,int year){
        double grossPay = calcGrossPay(month,year);
        return new Paycheck(grossPay,
                (0.23*grossPay),
                (0.05*grossPay),
                (0.01*grossPay),
                (0.03*grossPay),
                (0.075*grossPay));
    }

    public abstract double calcGrossPay(int month,int year);
}
