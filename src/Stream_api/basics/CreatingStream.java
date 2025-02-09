package Stream_api.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreatingStream {
    public static void main(String[] args) {
        // создание потока из коллекции
        List<String> list = Arrays.asList("apple","banana","orange");
        Stream<String> stream = list.stream();

        //Создание потока из массива
        String[] arr = {"apple","banana","orange"};
        Stream<String> stream2 = Arrays.stream(arr);

        //Создание потоков с помощи статических методов
        Stream<String> stream3 = Stream.of("apple","banana","orange");

        // вывод с использованием лямды
        stream3.forEach(s -> System.out.print(s + " "));
        System.out.println();

        // вывод с использованием collect и Collectors.joining(" ")
        String collect = stream2.collect(Collectors.joining(" "));
        System.out.println(collect);
    }
}
