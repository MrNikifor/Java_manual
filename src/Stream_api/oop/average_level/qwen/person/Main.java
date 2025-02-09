package Stream_api.oop.average_level.qwen.person;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 35),
                new Person("Charlie", 45),
                new Person("David", 55)
        );
        //Нам нужно сгруппировать людей по возрастным категориям:
        //"Young" — если возраст меньше 30.
        //"Adult" — если возраст от 30 до 50.
        //"Senior" — если возраст больше 50.
        Map<String, List<Person>> collect = people.stream().collect(Collectors.groupingBy(person -> {
            return person.getAge() < 30 ? "Young" : person.getAge() >= 30 && person.getAge() < 50 ? "Adult" : "Senior";
        }));

        collect.forEach((cotegory, persons) -> System.out.println(cotegory + " : " + persons));

    }
}
