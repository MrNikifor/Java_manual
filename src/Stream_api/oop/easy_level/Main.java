package Stream_api.oop.easy_level;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 20),
                new Person("David", 35),
                new Person("Eve", 28)
        );
        //имена младше 30
        personList.stream().filter(x -> x.getAge() < 30).map(Person::getName).forEach(System.out::println);

        //все ли люди старше 18
        boolean b1 = personList.stream().anyMatch(x -> x.getAge() > 18);
        System.out.println(b1);

        //найти самое длинное имя
        Optional<Person> max = personList.stream().max((x1, x2) -> Integer.compare(x1.getName().length(), x2.getName().length()));
        System.out.println(max.get().getName());

        // сумма возрастов
        int sum = personList.stream().mapToInt(Person::getAge).sum();
        System.out.println(sum);

        //проверка на возраст
        boolean b = personList.stream().anyMatch(x -> x.getAge() == 40);
        System.out.println(b);

        // найти имена людей старше 25
        List<String> collect = personList.stream().filter(x -> x.getAge() > 25).map(Person::getName).collect(Collectors.toList());
        System.out.println(collect);


        // преобразование в map
        Map<Integer, List<Person>> groupedByAge = personList.stream()
                .collect(Collectors.groupingBy(Person::getAge));
        System.out.println(groupedByAge);

        //самый молодой
        personList.stream().min(Comparator.comparingInt(Person::getAge)).ifPresent(System.out::println);

        // средний возраст
        OptionalDouble reduce = personList.stream().mapToInt(Person::getAge).average();
        System.out.println(reduce.getAsDouble());


        // находим старше 25
        personList.stream().filter(x -> x.getAge() > 25).forEach(System.out::println);

    }
}
