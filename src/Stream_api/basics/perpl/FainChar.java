package Stream_api.basics.perpl;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class FainChar {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Яблоко", "Груша", "Апельсин", "Груша", "Киви", "Манго", "Груша");
        //Подсчета частоты каждого элемента в списке.
        //Найдите элемент с максимальной частотой.
        //Выведите самый часто встречающийся элемент и его частоту на экран. Если список пуст, выведите сообщение "Список пуст"

        Map<String, Long> collect1 = list.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        Optional<Map.Entry<String, Long>> max = collect1.entrySet().stream().max(Map.Entry.comparingByValue());

        max.ifPresent(e -> System.out.print("Самый частый элемент: " + e.getKey() + ", Количество: " + e.getValue()));

        //уникальные елементы
        Set<String> collect = list.stream().collect(Collectors.toSet());
        System.out.println("\n" + collect);

        //вывести длину болле 4 символов
        list.stream().filter(x -> x.length() > 4).forEach(System.out::println);

        //Подсчитайте количество таких фруктов начинающих на букву Я
        long count = list.stream().filter(x -> x.startsWith("Я")).count();
        System.out.println(count);
    }
}
