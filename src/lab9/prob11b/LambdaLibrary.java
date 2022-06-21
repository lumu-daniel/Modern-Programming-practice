package lab9.prob11b;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
    public static final TriFunction<List<Employee>,Double,String,List<String>>
            FILTER_WITH_TRI = (employees,salary,regex)->
            employees.stream()
                    .filter(emp->emp.getSalary()>salary && emp.getLastName().matches(regex))
                    .map(name->name.getFirstName() + " " + name.getLastName())
                    .sorted()
                    .collect(Collectors.toList());
}
