package lab4.probC;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Employee> employees = new ArrayList<>(){{
        add(new Commissioned(new ArrayList<>(){{
            add(new Order("1","2/4/2002",2000));
            add(new Order("2","3/4/2002",3000));
            add(new Order("5","4/4/2002",4000));
        }},400,0.1));
        add(new Hourly(20,40));
        add(new Salaried(4000));
    }};

    public static void main(String[] args) {
        double totalNetPay = 0.0;
        for (Employee emp :
                employees) {
            totalNetPay+=emp.calcCompensation(1,2000).getNetPay();
        }

        System.out.println(totalNetPay);
    }
}
