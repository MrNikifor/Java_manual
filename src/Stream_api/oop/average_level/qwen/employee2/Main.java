package Stream_api.oop.average_level.qwen.employee2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", "Female"),
                new Employee("Bob", "IT", "Male"),
                new Employee("Charlie", "IT", "Male"),
                new Employee("David", "HR", "Male"),
                new Employee("Eve", "IT", "Female"),
                new Employee("Frank", "HR", "Male")
        );
        //посчитать количество мужчин и женщин в каждом отделе
        Map<String, Map<String, Long>> collect = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.groupingBy(Employee::getGender, Collectors.counting())));

        collect.forEach((k, v) -> {
            System.out.println("Отдел: " + k);
            v.forEach((k2, v2) -> {
                System.out.println("Пол: " + k2 + " - " + v2 + " человек");
            });
        });
    }
}
