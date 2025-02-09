package Stream_api.basics.perpl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Иван", "Анна", "Петр", "Мария", "Елена", "Алексей");
        //имена которые начинаются на букву "А", и преобразования их в верхний регистр
        List<String> collect = list.stream().filter(x -> x.startsWith("А"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(collect);

        //преобразования всех имен в верхний регистр и отсортируйте их в алфавитном порядке
        list.stream().map(x -> x.toUpperCase()).sorted().forEach(x -> System.out.print(x + ", "));
    }
}
