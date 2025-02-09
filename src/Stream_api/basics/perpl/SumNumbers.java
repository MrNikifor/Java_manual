package Stream_api.basics.perpl;

import java.util.Arrays;
import java.util.List;

public class SumNumbers {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        //среднее значение
        integers.stream()
                .mapToInt(Integer::intValue)
                .average().ifPresent(System.out::println);

        //найти сумму
        int sum = integers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
