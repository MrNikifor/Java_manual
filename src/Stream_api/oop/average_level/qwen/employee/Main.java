package Stream_api.oop.average_level.qwen.employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 50000, "HR"),
                new Employee("Bob", 60000, "IT"),
                new Employee("Charlie", 70000, "IT"),
                new Employee("David", 80000, "HR"),
                new Employee("Eve", 90000, "IT"),
                new Employee("Frank", 55000, "HR")
        );

        //найти трех самых высокооплачиваемых сотрудников в каждом отделе
        Map<String, List<Employee>> deparMaxSalary = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey, v -> v.getValue()
                        .stream()
                        .sorted(Comparator.comparingDouble(Employee::getSalary)
                                .reversed())
                        .limit(3)
                        .collect(Collectors.toList())));

        deparMaxSalary.forEach((k, v) -> {
            System.out.println(("Department: ") + k);
            v.forEach(System.out::println);
        });
    }
}
