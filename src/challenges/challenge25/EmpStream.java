package challenges.challenge25;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmpStream {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Saurabh Kumar", 30462);
        Employee employee2 = new Employee("Gaurav Kumar", 50000);
        Employee employee3 = new Employee("Aman", 49000);
        Employee employee4 = new Employee("Himanshu Sharma", 28000);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        List<Employee> sortedEmployeeList = employeeList.stream().sorted(Employee::compareTo).collect(Collectors.toList());

        System.out.println(sortedEmployeeList);

    }
}
