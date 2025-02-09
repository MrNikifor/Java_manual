package Stream_api.basics.perpl;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Predicate {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //создать два списка четные и нечетные
        Map<Boolean, List<Integer>> collect = integers.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));

        List<Integer> integers1 = collect.get(true);
        List<Integer> integers2 = collect.get(false);

        System.out.println("Четные: " + integers1 + "\n" + "Нечетные: " + integers2);
    }
}
