package Stream_api.tasks1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class CombiningString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Python", "C++", "JavaScript", "Kotlin");
        //короткая строка
        list.stream().min(Comparator.comparing(String::length)).ifPresent(System.out::println);

        //в нижний регистр
        list.stream().map(x -> x.toLowerCase()).forEach(System.out::println);

        // в верхний регистр
        list.stream().map(x -> x.toUpperCase()).forEach(System.out::println);

        //объеденяем в одну строку
        Optional<String> reduced = list.stream().reduce((x1, x2) -> x1 + ", " + x2);
        System.out.println(reduced.get());
    }
}
