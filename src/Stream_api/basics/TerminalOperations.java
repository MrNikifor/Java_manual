package Stream_api.basics;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperations {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Banana", "Orange", "Pineapple", "Watermelon", "Lemon");

        // ограниченный сбор элементов
        List<String> filterFruitList = list.stream().filter(fruit -> fruit.length() > 5).collect(Collectors.toList());
        System.out.println(filterFruitList);

        // вывод элементов
        list.forEach(System.out::println);

        // подсчет элементов
        long count = list.stream().filter(fruit -> fruit.length() > 5).count();
        System.out.println(count);

        // объединение всех елементов в одну строку
        Optional<String> reduced = list.stream().reduce((fruit1, fruit2) -> fruit1 + ", " + fruit2);
        reduced.ifPresent(System.out::println);
    }
}
