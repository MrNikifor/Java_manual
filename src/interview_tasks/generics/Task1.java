package interview_tasks.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class Task1 {
    public static void main(String[] args) {
         List<String> list = List.of("1", "2", "3");
         List<Integer> integers = change(list, Integer::parseInt);
         System.out.println(integers);
        
    }

    public static <T,R> List<R> change(List<T> list, Function<T,R> func) {
             List<R> result = new ArrayList<>();
             for (T t : list) {
                 result.add(func.apply(t));
             }
             return result;
    }
}
