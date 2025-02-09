package Stream_api.tasks1;

import java.util.Arrays;
import java.util.List;

public class MinNumber {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(5, 3, 8, 2, 9, 1);

        integers.stream().mapToInt(Integer::intValue).min().ifPresent(System.out::println);
    }
}
