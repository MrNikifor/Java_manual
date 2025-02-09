package Stream_api.tasks1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SortedStringLight {
    public static void main(String[] args) {
        List<String> fruitList = Arrays.asList("banana", "apple", "cherry", "date", "elderberry");

        //сортировка алфавит
        fruitList.stream().sorted().collect(Collectors.toList()).forEach(x -> System.out.print(x + " "));

        // находим самую длинную строку
        Optional<String> max = fruitList.stream().max(Comparator.comparing(String::length));
        System.out.println(max.get());

        //фильтруем по начальной букве
        List<String> b = fruitList.stream().filter(x -> x.startsWith("b")).collect(Collectors.toList());
        System.out.println(b);

        //сортировка по длине
        List<String> sortFruit = fruitList.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
        System.out.println(sortFruit);
    }
}
