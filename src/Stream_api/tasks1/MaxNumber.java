package Stream_api.tasks1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxNumber {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //нечетные в квадрат
        integers.stream().filter(x -> x % 2 == 0).mapToInt(x -> x * 2).forEach(System.out::println);

        //сумма всех квадратов
        int sum1 = integers.stream().map(x -> x * x).mapToInt(Integer::intValue).sum();
        System.out.println(sum1);

        // сумма всех чисел
        int sum = integers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        //произведение всех
        integers.stream().reduce((x1, x2) -> x1 * x2).ifPresent(System.out::println);

        // максимальное значение
        Optional<Integer> max = integers.stream().max(Integer::compareTo);
        System.out.println(max.get());
    }
}
