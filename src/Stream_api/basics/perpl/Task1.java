package Stream_api.basics.perpl;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 2, 8, 9, 10, 11, 12, 13, 14, 15, 16, 10, 17, 18, 19, 20);

        //найти четные и избавиться от дубликатов
        Set<Integer> collect = integers.stream().filter(x -> x % 2 == 0).collect(Collectors.toSet());
        System.out.println(collect);
    }
}
