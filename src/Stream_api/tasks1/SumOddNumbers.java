package Stream_api.tasks1;

import java.util.Arrays;
import java.util.List;

public class SumOddNumbers {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //найти все которые делятся на 3
        integers.stream().filter(x -> x % 3 == 0).forEach(System.out::println);

        // нахождение суммы нечетных
        int sum = integers.stream().filter(x -> x % 2 != 0).mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
