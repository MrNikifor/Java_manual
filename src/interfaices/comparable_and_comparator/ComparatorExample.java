package interfaices.comparable_and_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
// Для интерфейса Comparator требуется создание отдельно класса и в параметрах его метода устанавливаем два значение.
// Интерфейс Comparator используется для сравнения объектов, используя не естественный порядок.
// Comparator-ом обычно пользуются для второй нестандартной(индивидуальной сортировки) как показано в примере на стр.22

public class ComparatorExample {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Nikita", "Osinskiy", 200_000);
        Employee emp2 = new Employee(10, "Sergey", "Markushew", 150_000);
        Employee emp3 = new Employee(1000, "Nikolay", "Lagutin", 100_000);
        // Arrays.sort(new Employee[]{emp1,emp2,emp3}); // также можно сортировать в массивах
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sorting: \n" + list);
        Collections.sort(list,new Employee.NameComparator());
        System.out.println("After sorting: \n" + list);
    }

    static class Employee{
        int id;
        String name;
        String surname;
        int salary;

        public Employee(int id, String name, String surname, int salary) {
            this.id = id;
            this.name = name;
            this.surname = surname;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    " id = " + id +
                    ", name = '" + name + '\'' +
                    ", surname = '" + surname + '\'' +
                    ", salary = " + salary +
                    '}';
        }

        // Пример работы с Comparator(нужно создать класс по какому параметру будет реализовываться сортировка)

         static class NameComparator implements Comparator<Employee>{

            @Override
            public int compare(Employee emp1, Employee emp2) {
                return emp1.name.compareTo(emp2.name); // все способы сортировки в методе соответствуют интерфейсу Comparable
            }
        }

    }
}


