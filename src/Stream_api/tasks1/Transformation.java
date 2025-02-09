package Stream_api.tasks1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Transformation {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("3", "15", "7", "22", "8");

        list.stream()
                .map(Integer::valueOf)
                .filter((x) -> x > 10)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
