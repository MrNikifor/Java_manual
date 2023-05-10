package interfaices.comparable_and_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//  Интерфейс Comparable позволяет нам определять порядок между объектами,
//  выявляя, является ли объект больше, меньше или равным другому.
// Интерфейс Comparable используется для сравнения объектов, используя естественный порядок.
// Для интерфейса Comparator требуется создание отдельно класса и в параметрах его метода устанавливаем два значение
public class ComparableAndComparatorExample {
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
        Collections.sort(list);
        System.out.println("After sorting: \n" + list);
    }

    static class Employee implements Comparable<Employee> {
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

        @Override
        public int compareTo(Employee anotherEmp) {

          /*  if (this.id == anotherEmp.id){              <- первый способ метода сортировки
                return 0;
            }else if (this.id < anotherEmp.id){
                return -1;
            }else {
                return 1;*/


            // return this.id-anotherEmp.id;              // <- второй способ(основной)

            //  return this.id.compareTo(anotherEmp.id);    <- третий способ работает только с классом Integer и
            //                                                его методом compareTo()


            int res = this.name.compareTo(anotherEmp.name);   // <- 4й способ работы со строками методом compareTo()
            if (res == 0) {                                   // если имена одинаковые с помощи условия сравнивам фамилии
                res = this.surname.compareTo(anotherEmp.surname);
            }
            return res;
        }

        // Пример работы с Comparator

        class nameComparator implements Comparator<Employee>{

            @Override
            public int compare(Employee emp1, Employee emp2) {
                return emp1.name.compareTo(emp2.name);         // все способы сортировки в методе соответствуют интерфейсу
                                                               // Comparable
            }
        }

    }
}

