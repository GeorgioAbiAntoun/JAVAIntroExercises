package Employee;

import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main (String [] args){

        Employee employee1 = new Employee("Alice", "last",1200.00);
        Employee employee2 = new Employee("Bob", "last",1200.00);

        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(employee1);
        employeeList.add(employee2);

        employeeList.forEach( t -> {

            System.out.printf(t.toString());
            t.raise(t, 10);
            System.out.println("After applying raise");
            System.out.printf(t.toString());

        });
    }
}
