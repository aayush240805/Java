package CollectionFramework.StreamsPractice.Intermediate;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _1OperationsOnEmployees {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(101, "John", "IT", 50000),
                new Employee(102, "Alice", "HR", 70000),
                new Employee(103, "Bob", "IT", 45000),
                new Employee(104, "David", "Finance", 90000),
                new Employee(105, "Mike", "HR", 80000),
                new Employee(106, "Sara", "Finance", 60000),
                new Employee(107, "Paul", "Finance", 55000)
        );

//        1. Sort employee by their salary
//        Ascending...
        List<Employee> asc = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .toList();

//        Descending...
        List<Employee> dsc = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .toList();

        System.out.println("Ascending: " + asc);
        System.out.println("Descending: " + dsc);


//        6. Group by department and find average of each
        Map<String, Double> collect = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

        System.out.println("\nSalary avergage by department: " + collect);

//        7. Find the highest-paid employee in each department
        Map<String, Optional<Employee>> collect1 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

        System.out.println("\nHigh-paid employee in each department: " + collect1);

//        8. Find all departments with more than 2 employees
        List<String> collect2 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 2)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println("\nDepartments with more than 2 employees: " + collect2);

//        9. Find the department with the highest average salary

        Map.Entry<String, Double> collect3 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();

        System.out.println("\nDepartment with the highest average salary: " + collect3);

    }

}
