package Stream_api.basics.perpl;

import java.util.Arrays;
import java.util.List;

public class MaxValueException {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 5, 30, 15);

        //Выведите максимальное значение на экран. Если список пустой, выведите сообщение "Список пуст"
        Integer listNum = numbers.stream().max(Integer::compareTo).orElseThrow(() -> new RuntimeException("Список пуст"));
        System.out.println(listNum);

        //min
        Integer listNum2 = numbers.stream().min(Integer::compareTo).orElseThrow(() -> new RuntimeException("Список пуст"));
        System.out.println(listNum);
    }
}
