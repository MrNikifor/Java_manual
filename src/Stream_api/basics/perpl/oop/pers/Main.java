package Stream_api.basics.perpl.oop.pers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Иван", 25),
                new Person("Анна", 30),
                new Person("Петр", 25),
                new Person("Мария", 30),
                new Person("Елена", 35)
        );
        //показывая, сколько людей в каждой возрастной группе
        Map<Integer, Long> collect = people.stream().collect(Collectors.groupingBy(Person::getAge, Collectors.counting()));

        collect.forEach((k, v) -> System.out.println("Возраст: " + k + ", Количество: " + v));
    }
}
