package Stream_api.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperations {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "chery", "orange","elderberry");

        // фильтруем фрукты на начальную букву
        List<String> filtList = list.stream().filter(fruit -> fruit.startsWith("o")).collect(Collectors.toList());
        System.out.println(filtList);
        System.out.println("-------------------------");

        // преоьразование в верхний регистр
        list.stream().map(String::toUpperCase).forEach(s -> System.out.print(s + " "));
        System.out.println();
        System.out.println("-------------------------");

        //сортировка
        List<String> sotrList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sotrList);
    }
}
