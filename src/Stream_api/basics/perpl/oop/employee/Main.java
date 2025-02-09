package Stream_api.basics.perpl.oop.employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Иван", 50000, "Разработчик"),
                new Employee("Анна", 60000, "Менеджер"),
                new Employee("Петр", 40000, "Тестировщик"),
                new Employee("Мария", 70000, "Разработчик")
        );
        //фильтрации сотрудников с зарплатой выше 55000
        List<String> collect = employees.stream()
                .filter(o -> o.getSalary() > 55000).map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println(collect);

    }
}
