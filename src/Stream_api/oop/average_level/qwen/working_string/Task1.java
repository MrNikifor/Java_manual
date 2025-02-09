package Stream_api.oop.average_level.qwen.working_string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Stream", "API");

        //найти все уникальные буквы (без учета регистра) из всех строк и отсортировать их в алфавитном порядке
        List<Character> collect = list.stream()
                .flatMap(s -> String.valueOf(s).chars()
                        .mapToObj(o -> (char) o))
                .map(Character::toLowerCase)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(collect);

    }
}
