package Stream_api.tasks1;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class AverageValue {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(12, 15, 18, 21, 24);
        //делятся нв 2 и 3
        integers.stream().filter(x -> x % 2 == 0 && x % 3 == 0).forEach(System.out::println);

        // увеличиваем каждое на 5
        List<Integer> collect1 = integers.stream().map(x -> x + 5).collect(Collectors.toList());
        System.out.println(collect1);

        //сортируем по убыванию
        integers.stream().sorted((x1,x2) -> Integer.compare(x2, x1)).forEach(System.out::println);

        // удвоение чисел
        List<Integer> collect = integers.stream().map(x -> x * 2).collect(Collectors.toList());
        System.out.println(collect);


        // среднее значение
        OptionalDouble average = integers.stream().mapToInt(Integer::intValue).average();
        System.out.println(average.getAsDouble());
    }
}
