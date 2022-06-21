package lab4.probC;

import java.util.List;

public class Commissioned extends Employee{

    private List<Order> orders;
    private double baseSalary;
    private double commission;

    public Commissioned(List<Order> orders, double baseSalary, double commission) {
        this.orders = orders;
        this.baseSalary = baseSalary;
        this.commission = commission;
    }

    @Override
    public double calcGrossPay(int month, int year) {
        double tmp=0.0;
        for (Order o :
                orders) {
            tmp+=o.getOrderAmount()*commission;
        }
        return baseSalary+(tmp);
    }
}
